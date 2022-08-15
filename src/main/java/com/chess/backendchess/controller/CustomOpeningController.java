package com.chess.backendchess.controller;


import com.chess.backendchess.models.CustomOpening;
import com.chess.backendchess.service.CustomOpeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
public class CustomOpeningController {

    @Autowired
    private CustomOpeningService customOpeningService;

    CustomOpeningController(CustomOpeningService customOpeningService){
        this.customOpeningService = customOpeningService;
    }

    @GetMapping("/players/{id}/custom")
    public Set<CustomOpening> getPlayersOpenings(@PathVariable Long id){
        return customOpeningService.getPlayersOpenings(id);
    }

    @PostMapping("/players/custom")
    public void addOpening(@RequestBody CustomOpening newOpening){
        customOpeningService.addOpening(newOpening);
    }
}
