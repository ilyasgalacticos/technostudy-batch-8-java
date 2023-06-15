package socialnet;

import java.util.ArrayList;

public class Database {

    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Friend> friends = new ArrayList<>();

    static {
        users.add(new User(1L, "ilyas@gmail.com", "qwerty", "Ilyas Zhuanyshev"));
        users.add(new User(2L, "caroline@gmail.com", "asdasd", "Caroline Arantes"));
        users.add(new User(3L, "cankut@gmail.com", "qweqwe", "Cankut Sogancilar"));
        users.add(new User(4L, "ozgur@gmail.com", "asdasd", "Ozgur Gogersin"));
        users.add(new User(5L, "luba@gmail.com", "qweqwe", "Luba Avakova"));

        friends.add(new Friend(users.get(0), users.get(1)));
        friends.add(new Friend(users.get(1), users.get(0)));

        friends.add(new Friend(users.get(0), users.get(3)));
        friends.add(new Friend(users.get(3), users.get(0)));

        friends.add(new Friend(users.get(1), users.get(4)));
        friends.add(new Friend(users.get(4), users.get(1)));

        friends.add(new Friend(users.get(0), users.get(4)));
        friends.add(new Friend(users.get(4), users.get(0)));

        friends.add(new Friend(users.get(0), users.get(2)));
        friends.add(new Friend(users.get(2), users.get(0)));

    }

    public static ArrayList<User> getAllUsers() {
        return users;
    }

    public static User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public static User getUserByEmailAndPassword(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static User getUserById(Long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public static ArrayList<Friend> getFriends() {
        return friends;
    }

    public static void updateUserFullName(User user, String fullName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.get(i).setFullName(fullName);
                break;
            }
        }
    }


}