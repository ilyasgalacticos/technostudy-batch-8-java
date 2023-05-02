package week8.lesson2.example1;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Ilyas Zhuanyshev", 150000, "Finance");
        Worker w2 = new Worker("Ozgur Gogersin", 200000, "Management");
        Worker w3 = new Worker("Hidayet Boya", 120000, "Development");
        Worker w4 = new Worker("Ogulcan Avcu", 110000, "Development");
        Worker w5 = new Worker("Kenan Ahmed", 130000, "PR");
        Worker w6 = new Worker("Yaren Sanli", 140000, "Marketing");
        Worker w7 = new Worker("Elvira Nazir", 120000, "Cyber Security");

        Company technoStudy = new Company();

        technoStudy.setName("Techno Study LLP");
        technoStudy.setCeo(w2);
        technoStudy.setFinanceDirector(w1);
        technoStudy.setRentCost(10000);

        Worker workers[] = {w3, w4, w5, w6, w7};
        technoStudy.setStuff(workers);
        technoStudy.printData();

    }
}
