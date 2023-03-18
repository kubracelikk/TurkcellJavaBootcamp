package org.example;

public class Campaign {
    private double discount;
    private User user;
    private Game game;

    public Campaign() {
    }

    public Campaign(double discount, User user, Game game) {
        this.discount = discount;
        this.user = user;
        this.game = game;


    }
}
