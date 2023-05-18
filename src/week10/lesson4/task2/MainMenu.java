package week10.lesson4.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student = new Student();

        while(true){
            System.out.println("-------------------------------------");
            System.out.println("PRESS 1 TO ASSIGN COURSE TO STUDENT");
            System.out.println("PRESS 2 TO LIST COURSES OF STUDENT");
            System.out.println("PRESS 3 TO REMOVE COURSE FROM STUDENT");
            System.out.println("PRESS 4 TO SETUP NAME OF STUDENT");
            System.out.println("PRESS 5 TO VIEW STUDENT DATA");
            System.out.println("PRESS 0 TO EXIT");
            System.out.println("-------------------------------------");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name of course:");
                String course = in.next();
                student.addCourse(course);
                System.out.println("Course assigned successfully!");

            }else if(choice.equals("2")){

                student.listCourses();

            }else if(choice.equals("3")){

                System.out.println("Insert name of course to remove: ");
                String course = in.next();
                if(student.getCourses().contains(course)) {
                    student.removeCourse(course);
                    System.out.println("Course removed successfully!");
                }else{
                    System.out.println("Course " + course + " doesn't exist in database");
                }

            }else if(choice.equals("4")){

                System.out.println("Insert new name of student:");
                String studentName = in.next();
                student.setName(studentName);
                System.out.println("Student renamed successfully!");

            }else if(choice.equals("5")){

                System.out.println(student);

            }else if(choice.equals("0")){

                break;

            }else{

                System.out.println("Incorrect command!");

            }

        }

    }
}
