package org.example;

public class Sale {
    private User user;
    private Game game;
    private Campaign campaign;

    public Sale() {
    }

    public Sale(User user, Game game, Campaign campaign) {
        this.user = user;
        this.game = game;
        this.campaign = campaign;
    }

    public void sell(User user, Game game) {
        System.out.println("***********");
        System.out.println(user.getFirstName() + " oyuncusu "
                + game.getName() + " oyununu "
                + game.getPrice() + " fiyatıyla satın aldı." );
        System.out.println("***********");
    }
}
