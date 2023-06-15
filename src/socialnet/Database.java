package socialnet;

import java.util.ArrayList;

public class Database {

    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User(1L, "ilyas@gmail.com", "qwerty", "Ilyas Zhuanyshev"));
        users.add(new User(2L, "caroline@gmail.com", "asdasd", "Caroline Arantes"));
        users.add(new User(3L, "cankut@gmail.com", "qweqwe", "Cankut Sogancilar"));
        users.add(new User(4L, "ozgur@gmail.com", "asdasd", "Ozgur Gogersin"));
        users.add(new User(5L, "luba@gmail.com", "qweqwe", "Luba Avakova"));
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }

    public static User getUserByEmail(String email){
        for(User user : users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public static User getUserByEmailAndPassword(String email, String password){
        for(User user : users){
            if(user.getEmail().equals(email)
                    && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User getUserById(Long id){
        for(User user : users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }


}