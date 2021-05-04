package abstracts;

import entities.Game;
import entities.User;

public interface SaleService {
    void add(User user, Game game);

    void update(User user, Game game);

    void delete(User user, Game game);

    void saleWithCampaing(User user, Game game);

}
