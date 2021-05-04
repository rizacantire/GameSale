package concretes;

import abstracts.UserCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService {

    public UserManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    UserCheckService userCheckService;


    @Override
    public void registry(User user) {
        if(userCheckService.CheckIfRealPerson(user)){
            System.out.println("Üye katıt oldu");
        }
        else {
            System.out.println("Bilgiler geçersiz");
        }
    }

    @Override
    public void update(User user) {
        System.out.println("Üye bilgileri güncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println("Üye kaydı silindi");
    }
}
