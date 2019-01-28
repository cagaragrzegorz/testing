package com.testing;

import com.testing.domain.Game;
import com.testing.domain.GameFactory;

public class JavaJUnitMain {

    private static final GameFactory gameFactory = new GameFactory();

    public static void main(String[] args) {
        Game game = gameFactory.createGame();

        System.out.println(game.toString());
    }
}
