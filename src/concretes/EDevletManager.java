package concretes;

import entities.User;

public class EDevletManager {
    String firstName = "Rıza Can";
    String surName = "Tire";
    int birthYear = 1987;
    String nationalityId = "2125413659";

    public boolean check(User user){

        if(user.getFirstName() == this.firstName && user.getLastName() == surName &&
            user.getBirthOfDate().getYear() == this.birthYear && user.getNationalityId() ==
                this.nationalityId
        ){
            return  true;
        }
        else {
            return false;
        }
    }
}
