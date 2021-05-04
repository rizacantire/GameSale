package concretes;

import abstracts.UserCheckService;
import entities.User;

import java.rmi.RemoteException;

public class UserCheckManager implements UserCheckService {
    @Override
    public boolean CheckIfRealPerson(User user) {
        EDevletManager eDevletManager = new EDevletManager();
        boolean result = true;
        try {
            result = eDevletManager.check(user);
        } catch  (NumberFormatException e) {
            e.printStackTrace();
        }

        return result;
    }
}
