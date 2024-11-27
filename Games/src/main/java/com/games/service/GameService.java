package com.games.service;


import com.games.entity.Games;
import com.games.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService
{
    @Autowired
    private GameRepository repo;

    public Games saveGames(Games games)
    {
        return repo.save(games);
    }

    public List<Games> findAll()
    {
        return repo.findAll();
    }

    public Games findById(int id)
    {
        Optional<Games> games = repo.findById(id);

        if(games.isEmpty())
        {
            throw new RuntimeException("Games not found...!");
        }
        return games.get();
    }

    public Games updateGames(Games games)
    {
        Optional<Games> gamesUpdate = repo.findById(games.getId());

        if(gamesUpdate.isEmpty())
        {
            throw new RuntimeException("Games not updated...!");
        }

        Games exist = gamesUpdate.get();
        exist.setGameName(games.getGameName());
        exist.setCountry(games.getCountry());
        exist.setTotalLosts(games.getTotalLosts());
        return repo.save(exist);
    }

    public void deleteGame(int id)
    {
        Optional<Games> games = repo.findById(id);

        if(games.isEmpty())
        {
            throw new RuntimeException("Games deleted...!");
        }
        repo.delete(games.get());
    }

    public List<Games> findAllByCountry(String country)
    {
        return repo.findAllByCountry(country);
    }

    public List<Games> findAllByTotalWins(int totalWins)
    {
        return repo.findAllByTotalWins(totalWins);
    }



}
