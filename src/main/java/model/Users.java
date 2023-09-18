package model;

import java.util.ArrayList;

public class Users {
    ArrayList<User> users = new ArrayList<>();

    public void add(String ID, String PW, String nickname) {
        User user = new User(ID, PW, nickname);
        users.add(user);
    }

    public boolean matchID(String ID) {
        for(User user : users)
            if(user.getID().equals(ID))
                return true;
        return false;
    }
}
