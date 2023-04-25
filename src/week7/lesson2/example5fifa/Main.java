package week7.lesson2.example5fifa;
public class Main {
    public static void main(String[] args) {

        Player messi = new Player();
        messi.fullName = "Leo Messi";
        messi.age = 35;
        messi.country = "Argentina";
        messi.stamina = 80;
        messi.position = "FW";
        messi.power = 80;
        messi.speed = 90;
        messi.height = 169;

        Player mbappe = new Player();
        mbappe.fullName = "Kilian Mbappe";
        mbappe.age = 24;
        mbappe.country = "France";
        mbappe.stamina = 90;
        mbappe.position = "FW";
        mbappe.power = 90;
        mbappe.speed = 100;
        mbappe.height = 180;

        Player vini = new Player();
        vini.fullName = "Vini Jr";
        vini.age = 22;
        vini.country = "Brazil";
        vini.stamina = 100;
        vini.position = "FW";
        vini.power = 80;
        vini.speed = 100;
        vini.height = 176;

        Player valverde = new Player();
        valverde.fullName = "Valverde Federico";
        valverde.age = 24;
        valverde.country = "Uruguay";
        valverde.stamina = 100;
        valverde.position = "MF";
        valverde.power = 90;
        valverde.speed = 90;
        valverde.height = 185;

        Team psg = new Team();
        psg.name = "PSG";
        psg.country = "France";
        psg.ranking = 10;

        Player[] psgPlayers = {messi, mbappe};
        psg.players = psgPlayers;

        Team madrid = new Team();
        madrid.name = "Real Madrid";
        madrid.country = "Spain";
        madrid.ranking = 3;

        Player[] madridPlayers = {vini, valverde};
        madrid.players = madridPlayers;

        Team[] league = {psg, madrid};

        for (int i = 0; i < league.length; i++) {
            System.out.println("########################");
            System.out.println("Team : " + league[i].name);
            System.out.println("Country : " + league[i].country);
            System.out.println("Ranking : " + league[i].ranking);
            System.out.println("----------PLAYERS------------");
            for (int j = 0; j < league[i].players.length; j++) {
                System.out.println(league[i].players[j].getData());
                System.out.println("...........................");
            }
            System.out.println("########################");
        }
    }
}
