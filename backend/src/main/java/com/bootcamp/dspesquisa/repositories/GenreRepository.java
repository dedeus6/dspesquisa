package com.bootcamp.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
