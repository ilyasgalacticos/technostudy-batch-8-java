package week11.lesson4.example4;

public class Main {

    public static void main(String[] args) {

        School school = School.SAT;
        System.out.println(school.getDayText() + " - " + school.getDayNum());
        school.tasks();

    }

}
