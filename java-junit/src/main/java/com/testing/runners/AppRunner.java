package com.testing.runners;

import com.testing.domain.Game;
import com.testing.domain.GameFactory;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class AppRunner {

    private int numberOfGames;
    private GameFactory factory;
    private List<Game> games;

    public AppRunner(int numberOfGames, GameFactory factory) {
        this.numberOfGames = numberOfGames;
        this.factory = factory;
        this.games = generateGames();
    }

    public Game filterMostRankedGame() {
        return games.stream()
                .filter(Game::isInPossession)
                .max(Comparator.comparing(Game::getRank))
                .get();
    }

    public Game filterBestGame() {
        return games.stream()
                .filter(Game::isInPossession)
                .filter(g -> g.getRank() > 5.0d)
                .min(Comparator.comparing(Game::getPrice))
                .get();
    }

    private List<Game> generateGames() {
        List<Game> games = new ArrayList<>();
        for (int i = 0; i < numberOfGames; i++) {
            games.add(factory.createGame());
        }
        return games;
    }
}
