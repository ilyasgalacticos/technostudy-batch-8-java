package week9.lesson2.example7;

public class University {

    private String name;
    private Student [] students = new Student[100000];
    private int index = 0;

    public int getIndex(){
        return index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student){
        students[index] = student;
        index++;
    }

    public void printAllStudents(){
        for(int i = 0; i < index; i++){
            System.out.println(students[i].getFullName() + " - " + students[i].getSpeciality());
        }
    }
}
