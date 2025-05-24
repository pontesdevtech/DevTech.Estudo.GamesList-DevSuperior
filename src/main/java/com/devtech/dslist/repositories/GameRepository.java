package com.devtech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtech.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
}
