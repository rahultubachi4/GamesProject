package com.games.repository;


import com.games.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Games, Integer> {

     List<Games> findAllByCountry(String country);

     List<Games> findAllByTotalWins(int totalWins);



}
