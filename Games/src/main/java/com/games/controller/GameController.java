package com.games.controller;


import com.games.entity.Games;
import com.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController
{
    @Autowired
    private GameService service;

    @PostMapping("/save")
    public Games saveGames(@RequestBody Games games)
    {
        return service.saveGames(games);
    }

    @GetMapping("/findByAll")
    public List<Games> findAll()
    {
        return service.findAll();
    }

    @GetMapping("/findById")
    public Games findById(@RequestParam int id)
    {
        return service.findById(id);
    }

    @PutMapping("/update")
    public Games updateGames(@RequestBody Games games)
    {
        return service.updateGames(games);
    }

    @DeleteMapping("/delete")
    public void deleteGame(@RequestParam int id)
    {
        service.deleteGame(id);
    }


    @GetMapping("/country")
    public List<Games> findAllByCountry(@RequestParam String country)
    {
        return service.findAllByCountry(country);
    }

    @GetMapping("/wins")
    public List<Games> findAllByTotalWins(@RequestParam int totalWins)
    {
        return service.findAllByTotalWins(totalWins);
    }





}
