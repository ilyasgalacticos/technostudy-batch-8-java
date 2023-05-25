package week11.files;

import java.io.*;

public class Example1 {

    public static void main(String[] args) {

        try {

            File file = new File("input.ini");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String text;
            while ((text = bufferedReader.readLine()) != null) { // nextLine();
                System.out.println(text);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
