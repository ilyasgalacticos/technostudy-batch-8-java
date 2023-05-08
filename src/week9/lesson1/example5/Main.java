package week9.lesson1.example5;

public class Main {

    public static void main(String[] args) {

        Company technoStudy = new Company();
        technoStudy.setName("Techno Study LLP");
        technoStudy.setCity("Florida");

        Programmer ilyas = new Programmer();
        ilyas.setNick("ilyas.zhuanyshev");
        ilyas.setGithub("https://github.com/ilyasgalacticos");
        ilyas.setLevel("senior");

        Programmer john = new Programmer();
        john.setNick("jankraus");
        john.setLevel("middle");
        john.setGithub("http://github.com/johny");

        Manager ozgur = new Manager();
        ozgur.setFullName("Ozgur Gogersin");
        ozgur.setStage(8);

        Accountant cankut = new Accountant();
        cankut.setName("Cankut");
        cankut.setSurname("Sogancilar");
        cankut.setCategory("A");

        User[] workers = {ilyas, john, ozgur, cankut};
        technoStudy.setWorkers(workers);
        technoStudy.printWorkers();

    }

}
