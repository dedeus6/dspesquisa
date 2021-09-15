package com.bootcamp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
