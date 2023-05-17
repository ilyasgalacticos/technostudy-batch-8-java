package week10.lesson3.example5;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Contact> memory = new ArrayList<>();

    public void addContact(Contact contact){
        this.memory.add(contact);
    }

    public void printContactList(){
        for(int i = 0; i < this.memory.size(); i++){
            System.out.println((i+1) + ") " + this.memory.get(i));
        }
    }

    public void deleteContact(int index){
        this.memory.remove(index-1);
    }

}
