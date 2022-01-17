package br.com.voejota.logbook.entrypoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.voejota.logbook.entrypoint.utils.DataResponseEntity;
import br.com.voejota.logbook.usecase.AeronaveUseCase;
import br.com.voejota.logbook.usecase.domain.request.AeronaveRequestDomain;
import br.com.voejota.logbook.usecase.domain.response.AeronaveResponseDomain;

@RestController
@RequestMapping("/aeronave")
public class AeronaveController {
	
	private AeronaveUseCase aeronaveUseCase;

	@Autowired
	public AeronaveController(AeronaveUseCase aeronaveUseCase) {
		this.aeronaveUseCase = aeronaveUseCase;
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DataResponseEntity<String>> adicionar(@RequestBody AeronaveRequestDomain domain) {
		aeronaveUseCase.adicionar(domain);
		return new ResponseEntity<DataResponseEntity<String>>(HttpStatus.CREATED);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DataResponseEntity<List<AeronaveResponseDomain>>> consultarFrota() {
		return new ResponseEntity<DataResponseEntity<List<AeronaveResponseDomain>>>(
				new DataResponseEntity<>(aeronaveUseCase.consultarFrota()), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{matricula}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DataResponseEntity<AeronaveResponseDomain>> buscar(@PathVariable(name = "matricula") String matricula) {
		var retorno = aeronaveUseCase.buscar(matricula);

		if (retorno.isPresent()) {
			return new ResponseEntity<DataResponseEntity<AeronaveResponseDomain>>(
					new DataResponseEntity<>(retorno.get()), HttpStatus.OK);
		} else {
			return new ResponseEntity<DataResponseEntity<AeronaveResponseDomain>>(HttpStatus.NO_CONTENT);
		}
		
	}
	
}
