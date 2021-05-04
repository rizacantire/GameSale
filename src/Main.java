import abstracts.CampaignService;
import abstracts.SaleService;
import abstracts.UserService;
import concretes.CampaingManager;
import concretes.SaleManager;
import concretes.UserCheckManager;
import concretes.UserManager;
import entities.Game;
import entities.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Game game1 = new Game(1,"Mafia 2",300);
        User user1 = new User(1,"riza","Rıza Can","Tire",
                "riza@riza.com","1234",
                LocalDate.parse("1987-11-17"),"21254123659");
        CampaignService campaingManager = new CampaingManager(game1);
        campaingManager.update(game1);
        campaingManager.delete(game1);

        SaleService saleManager = new SaleManager();
        saleManager.add(user1,game1);
        saleManager.delete(user1,game1);
        saleManager.update(user1,game1);

        UserManager userManager = new UserManager(new UserCheckManager());
        userManager.registry(user1);





    }
}
