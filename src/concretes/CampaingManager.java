package concretes;

import abstracts.CampaignService;
import entities.Game;

public class CampaingManager implements CampaignService {
    private Game game;
    private double price;


    public CampaingManager(Game game) {
        this.game = game;
        this.price = game.getPrice();
    }


    @Override
    public void add(Game game) {
        double discount = 0.72;
        game.setPrice(game.getPrice() * discount);
        System.out.println(game.getName() + " isimli oyun için yeni kapanya eklendi");
        System.out.println("Oyunun yeni fiyatı " + game.getPrice());
    }
    @Override
    public void update(Game game) {
        double discount = 0.50;
        game.setPrice(game.getPrice() * discount);
        System.out.println(game.getName() + " isimli oyun için yeni kapanya eklendi");
        System.out.println("Oyunun yeni fiyatı " + game.getPrice());
    }
    @Override
    public void delete(Game game) {

        game.setPrice(this.price);
        System.out.println(game.getName() + " isimli oyun için kapanya silindi");
        System.out.println("Oyunun yeni fiyatı " + game.getPrice());
    }
}
