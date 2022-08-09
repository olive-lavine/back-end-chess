package com.chess.backendchess;

import antlr.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
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
//        Optional<Opening> opening = openingRepository.findById(id);
//        return opening != null ? Optional.of(opening) : Optional.empty();
    }

    public void addOpening(Opening opening){
        openingRepository.save(opening);
    }

    public void updateOpening(Long id, Opening opening){
        Opening update = openingRepository.findById(id).orElseThrow();
//        update.setId(opening.getId());
//        update.setName(opening.getName());
//        update.setParent(opening.getParent());
        update.setParentId(opening.getParentId());
        openingRepository.save(update);


    }

    public void deleteOpening(Long id){
        openingRepository.deleteById(id);
    }

}


//    public List<NameView> getNarrowOpenings(){
//        return openingRepository.findBy();
//    }

