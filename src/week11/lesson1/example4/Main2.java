package week11.lesson1.example4;

public class Main2 {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setLogin("ilyas");
        user1.setPassword("qwerty");
        user1.addRole("Admin");
        user1.addRole("User");
        user1.addRole("Moderator");
        user1.addRole("Security");
        user1.addRole("Security");
        user1.addRole("Security");

        System.out.println(user1);

        User user2 = new User();
        user2.setLogin("admin");
        user2.setPassword("admin");
        user2.addRole("Admin");
        user2.addRole("Admin");
        user2.addRole("Admin");
        user2.addRole("Admin");

        System.out.println(user2);
    }
}
