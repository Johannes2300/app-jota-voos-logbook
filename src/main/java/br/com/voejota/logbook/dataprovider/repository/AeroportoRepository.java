package br.com.voejota.logbook.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.voejota.logbook.dataprovider.model.AeroportoModel;

public interface AeroportoRepository extends JpaRepository<AeroportoModel, Long> {

}
