package br.com.voejota.logbook.dataprovider.mapper;

import br.com.voejota.logbook.dataprovider.model.AeronaveModel;
import br.com.voejota.logbook.dataprovider.model.AeronaveModelId;
import br.com.voejota.logbook.usecase.domain.request.AeronaveRequestDomain;
import br.com.voejota.logbook.usecase.domain.response.AeronaveResponseDomain;

public class AeronaveMapper {

	public static AeronaveModel toModel(AeronaveRequestDomain domain) {
		AeronaveModelId pk = new AeronaveModelId();
		pk.setMatricula(domain.getMatricula());
		
		AeronaveModel model = new AeronaveModel();
		model.setPK(pk);
		model.setMarca(domain.getMarca());
		model.setModelo(domain.getModelo());
		model.setMilhasVoadas(domain.getMilhasVoadas());
		model.setUltimoVoo(domain.getUltimoVoo());
		return model;
	}
	
	public static AeronaveResponseDomain toDomain(AeronaveModel model) {
		AeronaveResponseDomain domain = new AeronaveResponseDomain();
		domain.setId(model.getPK().getId());
		domain.setMatricula(model.getPK().getMatricula());
		domain.setMarca(model.getMarca());
		domain.setModelo(model.getModelo());
		domain.setMilhasVoadas(model.getMilhasVoadas());
		domain.setUltimoVoo(model.getUltimoVoo());
		return domain;
	}
	
}
