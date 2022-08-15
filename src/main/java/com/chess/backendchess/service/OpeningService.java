package com.chess.backendchess.service;

import com.chess.backendchess.repository.OpeningRepository;
import com.chess.backendchess.models.Opening;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OpeningService {
    @Autowired
    private OpeningRepository openingRepository;

    public List<Opening> getOpenings(){
        return openingRepository.findAll();
    }

    public List<Opening> getNextOpenings(Long parentId){
        return openingRepository.findOpeningsByParentId(parentId);
    }

    public Optional<Opening> getOpening(Long id){
        return openingRepository.findById(id);

    }

    public void addOpening(Opening opening){
        openingRepository.save(opening);
    }

    public void updateOpening(Long id, Opening opening){
        Opening update = openingRepository.findById(id).orElseThrow();
        update.setName(opening.getName());
        update.setParentId(opening.getParentId());
        update.setHasChild(opening.getHasChild());
        openingRepository.save(update);
    }
    public void deleteOpening(Long id){
        openingRepository.deleteById(id);
    }

}

