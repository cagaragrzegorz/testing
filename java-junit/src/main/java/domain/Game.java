package domain;

import lombok.Builder;

@Builder
public class Game {
    public String name;
    public Double price;
    public Double rank;
    public GameType type;
    public boolean isInPossession;
}
