package com.games.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Games_Data")
public class Games
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Game_Name")
    private String gameName;

    @Column(name = "Total_Players")
    private int totalPlayers;

    @Column(name = "Country" )
    private String country;

    @Column(name = "Total_Wins")
    private int totalWins;

    @Column(name = "Total_Losts")
    private int totalLosts;

    @Column(name = "Game_Ranking")
    private int gameRanking;

    @Column(name = "Game_Prize")
    private int gamePrize;

}
