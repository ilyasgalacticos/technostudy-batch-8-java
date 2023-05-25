package week11.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Example2 {

    public static void main(String[] args) {

        try{

            File file = new File("output.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Ilyas\n"); // System.out.println("Ilyas");
            bufferedWriter.write("John\n");
            bufferedWriter.write("Conor\n");
            bufferedWriter.write("Cankut\n");
            bufferedWriter.write("Ozgur\n");

            bufferedWriter.close();
            fileWriter.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
