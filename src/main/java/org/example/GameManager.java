package org.example;

public class GameManager {
    public GameManager() {
    }

    public void create(Game game) {
        System.out.println(game.getGameId() + " numaralı " + game.getName() + " adlı oyun oluşturuldu ");
    }

}
