package concretes;

import abstracts.SaleService;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService {
    CampaingManager campaingManager;

    @Override
    public void add(User user, Game game) {
        System.out.println(game.getName() + " : oyununu " + user.getUserName() +
                " kullanıcı adı ile kayıtlı üye satın aldı.");
    }

    @Override
    public void update(User user, Game game) {
        System.out.println(game.getName() + " : oyununu " + user.getUserName() +
                " kullanıcı adı ile kayıtlı üye tarafından güncellendi.");
    }


    @Override
    public void delete(User user, Game game) {
        System.out.println(game.getName() + " : oyununu " + user.getUserName() +
                " kullanıcı adı ile kayıtlı üye tarafından satış silindi.");
    }

    @Override
    public void saleWithCampaing(User user, Game game) {
        this.add(user,game);
        CampaingManager campaingManager;
        this.campaingManager.add(game);
    }
}
