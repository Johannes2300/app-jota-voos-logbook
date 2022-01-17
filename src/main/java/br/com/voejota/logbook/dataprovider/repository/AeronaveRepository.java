package br.com.voejota.logbook.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.voejota.logbook.dataprovider.model.AeronaveModel;
import br.com.voejota.logbook.dataprovider.model.AeronaveModelId;

@Repository
public interface AeronaveRepository extends JpaRepository<AeronaveModel, AeronaveModelId> {

}
