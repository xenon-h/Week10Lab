package services;

import dataaccess.UserDB;
import models.Role;
import models.User;

public class AccountService {

    public User login(String email, String password) {
        try {
            UserDB userDB = new UserDB();
            User user = userDB.get(email);
            if (password.equals(user.getPassword())) {
                return user;
            }
        } catch (Exception e) {
        }

        return null;
    }

    public Role getRole(String email) {
        try {
            UserDB userDB = new UserDB();
            User user = userDB.get(email);
            return user.getRole();
        } catch (Exception e) {
            return null;
        }

    }
}
