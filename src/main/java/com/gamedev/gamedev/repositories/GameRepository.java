package com.gamedev.gamedev.repositories;

import com.gamedev.gamedev.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
