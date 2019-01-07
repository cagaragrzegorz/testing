package domain;

import lombok.Builder;

@Builder
public class Game {
    public String name;
    public Double price;
    public Double rank;
    public GameType type;
    public boolean isInPossession;


    @Override
    public String toString() {
        return String.format("Game Name: %s, Price: %.2f, Rank: %.1f, Type: %s, Do I have it?: %s",
                name, price, rank, type, isInPossession);
    }
}
