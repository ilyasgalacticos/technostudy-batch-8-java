package constr;

public class AClass {

    private String name;

    public AClass(){
        System.out.println("I am using default constructor of AClass");
    }

    public AClass(String name){
        System.out.println("I am using parametrized constructor of AClass");
        this.name = name;
    }

}
