package com.testing;

import com.testing.domain.Game;
import com.testing.domain.GameFactory;
import com.testing.runners.AppRunner;

import java.util.List;

public class JavaJUnitMain {

    private static final GameFactory gameFactory = new GameFactory();
    private static final AppRunner runner = new AppRunner(10, gameFactory);


    public static void main(String[] args) {
        List<Game> games = runner.getGames();

        games.forEach(System.out::println);
        System.out.println("-----------------------------");
        System.out.println(runner.filterMostRankedGame());
        System.out.println("-----------------------------");
        System.out.println(runner.filterBestGame());
    }
}
