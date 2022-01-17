package br.com.voejota.logbook.usecase.gateway;

import java.util.List;
import java.util.Optional;

import br.com.voejota.logbook.usecase.domain.request.AeronaveRequestDomain;
import br.com.voejota.logbook.usecase.domain.response.AeronaveResponseDomain;

public interface AeronaveGateway {

	void adicionar(AeronaveRequestDomain aeronave);
	
	void remover(AeronaveRequestDomain aeronave);
	
	Optional<AeronaveResponseDomain> buscarAeronavePorMatricula(String matricula);
	
	List<AeronaveResponseDomain> consultarFrota();
	
}
