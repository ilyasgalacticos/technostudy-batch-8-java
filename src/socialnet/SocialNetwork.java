package socialnet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialNetwork {

    private User currentAuthenticatedUser;

    public SocialNetwork() {
        currentAuthenticatedUser = null;
    }

    public User authenticate(String email, String password) {

        User foundUser = Database.getUserByEmailAndPassword(email, password);
        currentAuthenticatedUser = foundUser;
        return foundUser;

    }

    public String getMenu() {
        return "[1] - MY PROFILE\n[2] - EDIT PROFILE\n[3] - MY FRIENDS\n[0] - LOGOUT";
    }

    public User getCurrentAuthenticatedUser() {
        return currentAuthenticatedUser;
    }

    public void logout() {
        currentAuthenticatedUser = null;
    }

    public ArrayList<User> getFriendList() {
        ArrayList<Friend> allFriends = Database.getFriends();
        ArrayList<User> userFriends = new ArrayList<>();
        for (Friend friend : allFriends) {
            if (friend.getUser().getId() == currentAuthenticatedUser.getId()) {
                userFriends.add(friend.getFriend());
            }
        }
        return userFriends;
    }

    public void updateUserFullName(String name, String surname){

        Database.updateUserFullName(currentAuthenticatedUser, name + " " + surname);
        currentAuthenticatedUser.setFullName(name + " " + surname);

    }

}
