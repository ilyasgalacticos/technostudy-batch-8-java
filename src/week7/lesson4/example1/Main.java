package week7.lesson4.example1;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("John Conor", "IT", 3, 3.2);
        Student st2 = new Student("Sarah Conor", "Art", 1, 3.8);
        Student st3 = new Student("Arnold Terminator", "Medicine", 4, 3.0);
        Student st4 = new Student("T-1000 Terminator", "Military", 7, 3.5);
        Student st5 = new Student("Van Damme", "Sport", 2, 3.4);

        Student[] university = {st1, st2, st3, st4, st5};

        Student best = university[0];

        for (int i = 1; i < university.length; i++) {
            if(best.gpa < university[i].gpa){
                best = university[i];
            }
        }

        System.out.println(best.toString());
    }
}
