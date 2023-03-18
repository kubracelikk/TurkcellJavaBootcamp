package org.example;

public class Main {
    public static void main(String[] args) {

        Game game1 = new Game(1,"PUBG",120);
        Game game2 = new Game(2,"GTA",150);
        Game game3 = new Game(3,"LOL",360);
        GameManager gameManager = new GameManager();
        gameManager.create(game1);
        System.out.println("***********");


        User user1 = new User(1, "oyuncu1@gmail.com", "p12345", "111222333", "Kübra", "Çelik", 1996);
        User user2 = new User(2, "oyuncu2@gmail.com", "12345a", "222555666", "Ahmet", "Akar", 1998);
        User user3 = new User(3, "oyuncu3@gmail.com", "k12345", "999222333", "Arda", "Çevik", 1993);
        UserManager userManager = new UserManager();
        userManager.save(user1);
        userManager.delete(user2);
        userManager.update(user3);
        System.out.println("***********");


        Sale sale = new Sale();
        sale.sell(user1,game2);


    }
}