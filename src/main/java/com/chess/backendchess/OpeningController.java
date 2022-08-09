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

    @RequestMapping("/openings")
    public List<Opening> getAllOpenings(){
        return openingService.getOpenings();
    }

    @RequestMapping("/openings/parent")
    public List<Opening> getStartingOpenings(){
        return openingService.getNextOpenings(null);
    }
    @RequestMapping("/openings/parent/{parentId}")
    public List<Opening> getNextOpenings(@PathVariable Long parentId){
        return openingService.getNextOpenings(parentId);
    }

    @RequestMapping("/openings/{id}")
    public Optional<Opening> getOpening(@PathVariable Long id){
        return openingService.getOpening(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/openings")
    public void addOpening(@RequestBody Opening opening){
        openingService.addOpening(opening);
    }

    @RequestMapping(method= RequestMethod.PATCH, value="/openings/{id}")
    public void updateOpening(@PathVariable Long id, @RequestBody Opening opening){
        openingService.updateOpening(id, opening);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/openings/{id}")
    public void deleteOpening(@PathVariable Long id){
        openingService.deleteOpening(id);
    }

}





//    @RequestMapping("/opening/names")
//    public List<NameView> getOpenings(){
//        return openingService.getNarrowOpenings();
//    }

