package repeat.set;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String name;
    private String surname;
    private Set<String> subjects;

    public Student(){
        this.subjects = new HashSet<>();
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addSubject(String subject){
        this.subjects.add(subject);
    }

    @Override
    public String toString() {
        String subjectsText = "";
        for(String subj : this.subjects){
            subjectsText+=subj+"\n";
        }
        return this.name + " " + surname + "\nSUBJECT LIST:\n"+subjectsText;
    }
}
