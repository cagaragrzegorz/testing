package com.testing.domain;

import util.RandomEnum;

import java.util.Random;

public class GameFactory {

    private RandomEnum<GameType> randomGameType = new RandomEnum<>(GameType.class);
    private Random random = new Random();

    public Game createGame() {
        return Game.builder()
                .name("Carcassonne" + random.nextInt(100))
                .price(random.nextDouble() * 100)
                .rank(random.nextDouble() * 10)
                .type(randomGameType.random())
                .isInPossession(random.nextBoolean())
                .build();
    }


}
