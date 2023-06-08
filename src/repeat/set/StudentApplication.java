package repeat.set;

import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Student student = new Student();

        while (true) {

            System.out.println("PRESS 1 TO SET STUDENT FULL NAME");
            System.out.println("PRESS 2 TO ADD SUBJECT");
            System.out.println("PRESS 3 TO REMOVE SUBJECT");
            System.out.println("PRESS 4 TO PRINT STUDENT DATA");
            System.out.println("PRESS 0 TO EXIT");

            String choice = in.next();

            if (choice.equals("1")) {

                System.out.println("Insert name: ");
                student.setName(in.next());
                System.out.println("Insert surname: ");
                student.setSurname(in.next());
                System.out.println("Student full name is set!");

            } else if (choice.equals("2")) {

                while (true){
                    System.out.println("PRESS 1 TO ADD Java SE");
                    System.out.println("PRESS 2 TO ADD Java EE");
                    System.out.println("PRESS 3 TO ADD Spring Framework");
                    System.out.println("PRESS 4 TO ADD Golang Developer");
                    System.out.println("PRESS 5 TO ADD QA Engineer");
                    System.out.println("PRESS 0 TO STOP ADDING SUBJECT");
                    choice = in.next();

                    if(choice.equals("1")){
                        student.addSubject("Java SE");
                    }else if(choice.equals("2")){
                        student.addSubject("Java EE");
                    }else if(choice.equals("3")){
                        student.addSubject("Spring Framework");
                    }else if(choice.equals("4")){
                        student.addSubject("Golang Developer");
                    }else if(choice.equals("5")){
                        student.addSubject("QA Enginneer");
                    }else if(choice.equals("0")){
                        break;
                    }
                }
            }else if (choice.equals("4")) {

                System.out.println(student);

            }else if(choice.equals("0")){
                break;
            }else{
                System.out.println("Wrong command!");
            }
        }
    }
}
