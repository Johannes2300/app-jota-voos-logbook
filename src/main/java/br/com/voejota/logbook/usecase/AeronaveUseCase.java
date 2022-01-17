package br.com.voejota.logbook.usecase;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.voejota.logbook.usecase.domain.request.AeronaveRequestDomain;
import br.com.voejota.logbook.usecase.domain.response.AeronaveResponseDomain;
import br.com.voejota.logbook.usecase.gateway.AeronaveGateway;

@Component
public class AeronaveUseCase {

	private static final Logger LOGGER = LoggerFactory.getLogger(AeronaveUseCase.class);

	private AeronaveGateway aeronaveGateway;

	@Autowired
	public AeronaveUseCase(AeronaveGateway aeronaveGateway) {
		this.aeronaveGateway = aeronaveGateway;
	}

	public void adicionar(AeronaveRequestDomain domain) {
		LOGGER.info("Adicionando aeronave de matrícula " + domain.getMatricula() + " à frota");
		if (aeronaveGateway.buscarAeronavePorMatricula(domain.getMatricula()).isEmpty()) {
			aeronaveGateway.adicionar(domain);
			LOGGER.info("Aeronave adicionada com sucesso");
		} else {
			LOGGER.info("Aeronave já cadastrada");
		}
	}

	public List<AeronaveResponseDomain> consultarFrota() {
		LOGGER.info("Listando frota");
		List<AeronaveResponseDomain> frota = aeronaveGateway.consultarFrota();
		
		if (frota.isEmpty())
			LOGGER.info("Não há aeronaves registradas na frota");
			
		return frota;
	}
	
	public Optional<AeronaveResponseDomain> buscar(String matricula) {
		LOGGER.info("Buscando aeronave de matrícula " + matricula);
		return aeronaveGateway.buscarAeronavePorMatricula(matricula);
	}

}
