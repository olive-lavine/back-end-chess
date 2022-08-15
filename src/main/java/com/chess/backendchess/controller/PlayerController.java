package com.chess.backendchess.controller;

import com.chess.backendchess.models.Player;
import com.chess.backendchess.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @PostMapping("/players")
    public void addPlayer(@RequestBody Player player){
        playerService.addPlayer(player);
    }

    @GetMapping("/players")
    public Player getPlayer(@RequestParam String name){
        return playerService.getPlayer(name);
    }


}
