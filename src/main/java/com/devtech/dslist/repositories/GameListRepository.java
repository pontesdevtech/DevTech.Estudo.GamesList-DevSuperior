package com.devtech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtech.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
