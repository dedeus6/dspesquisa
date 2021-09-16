package com.bootcamp.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.dspesquisa.dto.RecordDTO;
import com.bootcamp.dspesquisa.dto.RecordInsertDTO;
import com.bootcamp.dspesquisa.repositories.GameRepository;
import com.bootcamp.dspesquisa.repositories.RecordRepository;
import com.bootcamp.dspesquisa.entities.Game;
import com.bootcamp.dspesquisa.entities.Record;;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getById(dto.getGameId());
		entity.setGame(game);
		
		entity = recordRepository.save(entity);
		return new RecordDTO(entity);
	}
}
