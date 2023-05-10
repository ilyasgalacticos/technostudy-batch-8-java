package week9.lesson3.example3;

public class Main {
    public static void main(String[] args) {
//        User user = new User();
        Programmer programmer = new Programmer();
        programmer.setNick("ilyas");
        programmer.setLevel("middle");
        programmer.setSalary(8000);

        Programmer developer = new Programmer();
        developer.setNick("john");
        developer.setSalary(9000);
        developer.setLevel("senior");

        Teacher teacher = new Teacher();
        teacher.setFullName("Albert Zuckerberg");
        teacher.setDegree("PhD");
        teacher.setStage(9);

        Teacher math = new Teacher();
        math.setFullName("Leonardo Fibonacci");
        math.setStage(40);
        math.setDegree("Post PhD");

        User workers[] = {teacher, programmer, developer, math};

        for (int i = 0; i < workers.length; i++) {
            workers[i].work();
        }

    }
}
