package com.chess.backendchess.service;

import com.chess.backendchess.models.CustomOpening;
import com.chess.backendchess.models.Player;
import com.chess.backendchess.repository.CustomOpeningRepository;
import com.chess.backendchess.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class CustomOpeningService {
    @Autowired
    private CustomOpeningRepository customOpeningRepository;
    @Autowired
    private PlayerRepository playerRepository;

    public void addOpening(CustomOpening newOpening){
        customOpeningRepository.save(newOpening);
    }
    
    public void deleteOpening(Long id){
        customOpeningRepository.deleteById(id);

    }

    public Set<CustomOpening> getPlayersOpenings(Long id) {
        Optional<Player> player = playerRepository.findById(id);
        return customOpeningRepository.findCustomOpeningsByPlayer(player);
    }
}
