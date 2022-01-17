package br.com.voejota.logbook.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.voejota.logbook.dataprovider.model.VooModel;

public interface VooRepository extends JpaRepository<VooModel, Long> {

}
