package week6.lesson2;


public class Example05Methods {
    public static void main(String[] args) { //main method, starting point
        String user1 = addTexts("Ilyas", "Zhuanyshev");
        String user2 = addTexts("Brad", "Pitt");
        String user3 = addTexts("Leonardo", "Di Caprio");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }

    public static String addTexts(String name, String surname){
        return name + " - " + surname;
    }
}
