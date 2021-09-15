package com.bootcamp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
