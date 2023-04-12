package week5.lesson2;

public class ExampleArray2D {
    public static void main(String[] args) {

        String [][] contacts = {
                {"Ilyas", "Zhuanyshev", "+777777777", "Almaty"},
                {"Michael", "Jordan", "+877343434", "Chicago"},
                {"John", "Smith", "+8888888", "London"}
        };

        for(int i = 0; i < contacts.length; i++){
            System.out.println(contacts[i][0] + " - " + contacts[i][2]);
        }

    }
}
