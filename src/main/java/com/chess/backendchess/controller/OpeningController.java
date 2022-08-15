package com.chess.backendchess.controller;

import com.chess.backendchess.models.Opening;
import com.chess.backendchess.service.OpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class OpeningController {

    @Autowired
    private OpeningService openingService;

    OpeningController(OpeningService openingService){
        this.openingService = openingService;
    }

    @GetMapping("/openings")
    public List<Opening> getAllOpenings(){
        return openingService.getOpenings();
    }

    @GetMapping("/openings/parent")
    public List<Opening> getStartingOpenings(){
        return openingService.getNextOpenings(null);
    }
    @GetMapping("/openings/parent/{parentId}")
    public List<Opening> getNextOpenings(@PathVariable Long parentId){
        return openingService.getNextOpenings(parentId);
    }

    @GetMapping("/openings/{id}")
    public Optional<Opening> getOpening(@PathVariable Long id){
        return openingService.getOpening(id);
    }

    @PostMapping("/openings")
    public void addOpening(@RequestBody Opening opening){
        openingService.addOpening(opening);
    }

    @PatchMapping("/openings/{id}")
    public void updateOpening(@PathVariable Long id, @RequestBody Opening opening){
        openingService.updateOpening(id, opening);
    }

    @DeleteMapping("/openings/{id}")
    public void deleteOpening(@PathVariable Long id){
        openingService.deleteOpening(id);
    }

}




