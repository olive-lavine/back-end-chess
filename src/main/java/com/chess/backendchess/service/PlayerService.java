package com.chess.backendchess.service;

import com.chess.backendchess.models.Player;
import com.chess.backendchess.repository.PlayerRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    public void addPlayer(Player player){
        playerRepository.save(player);
    }
    public Optional<Player> getPlayer(Long id){
        return playerRepository.findById(id);
    }
}
