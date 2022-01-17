package br.com.voejota.logbook.dataprovider;

import static br.com.voejota.logbook.dataprovider.mapper.AeronaveMapper.toModel;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import br.com.voejota.logbook.dataprovider.mapper.AeronaveMapper;
import br.com.voejota.logbook.dataprovider.model.AeronaveModel;
import br.com.voejota.logbook.dataprovider.model.AeronaveModelId;
import br.com.voejota.logbook.dataprovider.repository.AeronaveRepository;
import br.com.voejota.logbook.usecase.domain.request.AeronaveRequestDomain;
import br.com.voejota.logbook.usecase.domain.response.AeronaveResponseDomain;
import br.com.voejota.logbook.usecase.gateway.AeronaveGateway;

@Component
public class AeronaveDataProvider implements AeronaveGateway {

	private static Logger LOGGER = LoggerFactory.getLogger(AeronaveDataProvider.class);
	
	private AeronaveRepository aeronaveRepository;

	@Autowired
	public AeronaveDataProvider(AeronaveRepository aeronaveRepository) {
		this.aeronaveRepository = aeronaveRepository;
	}

	@Override
	public void adicionar(AeronaveRequestDomain aeronave) {
		LOGGER.info("Adicionando aeronave de matrícula " + aeronave.getMatricula()  + " à frota");
		aeronaveRepository.save(toModel(aeronave));
	}

	@Override
	public void remover(AeronaveRequestDomain aeronave) {
		LOGGER.info("Removendo aeronave de matrícula " + aeronave.getMatricula() + " da frota");
		aeronaveRepository.delete(toModel(aeronave));
	}

	@Override
	public Optional<AeronaveResponseDomain> buscarAeronavePorMatricula(String matricula) {
		ExampleMatcher exampleMatcher = ExampleMatcher.matchingAny()
				.withMatcher("matricula", ExampleMatcher.GenericPropertyMatchers.exact())
				.withIgnorePaths("id", "milhasVoadas")
				.withIgnoreNullValues()
				.withIgnoreCase();
		
		AeronaveModelId pk = new AeronaveModelId();
		pk.setMatricula(matricula);
		AeronaveModel model = new AeronaveModel();
		model.setPK(pk);
		
		Example<AeronaveModel> exemploBusca = Example.of(model, exampleMatcher);
		
		return aeronaveRepository.findOne(exemploBusca).map(AeronaveMapper::toDomain);
	}

	@Override
	public List<AeronaveResponseDomain> consultarFrota() {
		return aeronaveRepository.findAll()
				.stream()
				.map(AeronaveMapper::toDomain)
				.collect(Collectors.toList());
	}
	
}
