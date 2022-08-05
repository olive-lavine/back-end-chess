package com.chess.backendchess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
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

    @RequestMapping("/opening")
    public List<Opening> getAllOpenings(){
        return openingService.getOpenings();
    }

    @RequestMapping("/opening/names")
    public List<NameView> getOpenings(){
        return openingService.getNarrowOpenings();
    }

    @RequestMapping("/opening/{id}")
    public Optional<Opening> getOpening(@PathVariable Long id){
        return openingService.getOpening(id);
    }


    @RequestMapping(method= RequestMethod.POST, value="/opening")
    public void addOpening(@RequestBody Opening opening){
        openingService.addOpening(opening);
    }

}
