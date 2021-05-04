package abstracts;

import entities.Game;

public interface CampaignService {
    void add(Game game);

    void update(Game game);

    void delete(Game game);
}
