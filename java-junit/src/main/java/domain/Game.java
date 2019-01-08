package domain;

import lombok.Builder;

@Builder
public class Game {
    private String name;
    private Double price;
    private Double rank;
    private GameType type;
    private boolean isInPossession;

    @Override
    public String toString() {
        return String.format("Game Name: %s, Price: %.2f, Rank: %.1f, Type: %s, Do I have it?: %s",
                name, price, rank, type, isInPossession);
    }
}
