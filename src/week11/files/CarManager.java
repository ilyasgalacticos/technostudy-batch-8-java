package week11.files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CarManager {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("PRESS 1 TO ADD CAR");
            System.out.println("PRESS 2 TO LIST CAR");
            System.out.println("PRESS 0 TO EXIT");

            String choice = in.next();

            if (choice.equals("1")) {
                System.out.println("Insert car:");
                String name = in.next();
                ArrayList<String> cars = getCars();
                cars.add(name);
                saveCars(cars);

            } else if (choice.equals("2")) {

                ArrayList<String> cars = getCars();

                for(String car : cars){
                    System.out.println(car);
                }

            } else if (choice.equals("0")) {
                break;
            } else {
                System.out.println("Wrong command!");
            }

        }
    }

    private static ArrayList<String> getCars() {

        ArrayList<String> cars = new ArrayList<>();

        try {

            File file = new File("database.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text;
            while ((text = bufferedReader.readLine()) != null) {
                cars.add(text);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            saveCars(new ArrayList<>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cars;
    }

    private static void saveCars(ArrayList<String> cars) {

        try {

            File file = new File("database.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String car : cars) {
                bufferedWriter.write(car + "\n");
            }

            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
