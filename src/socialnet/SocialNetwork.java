package socialnet;

import java.util.Scanner;

public class SocialNetwork {

    private User currentAuthenticatedUser;

    public SocialNetwork(){
        currentAuthenticatedUser = null;
    }

    public User authenticate(String email, String password){

        User foundUser = Database.getUserByEmailAndPassword(email, password);
        currentAuthenticatedUser = foundUser;
        return foundUser;

    }

    public String getMenu(){
        return "[1] - MY PROFILE\n[2] - MY FRIENDS\n[0] - LOGOUT";
    }

    public User getCurrentAuthenticatedUser(){
        return currentAuthenticatedUser;
    }

    public void logout(){
        currentAuthenticatedUser = null;
    }

}
