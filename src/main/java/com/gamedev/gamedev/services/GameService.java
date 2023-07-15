package com.gamedev.gamedev.services;

import com.gamedev.gamedev.dto.GameMinDTO;
import com.gamedev.gamedev.entities.Game;
import com.gamedev.gamedev.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
