package f1project;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FerrariEngine leclercEngine = new FerrariEngine(1.6, 8, 200);
        FerrariEngine sainzEngine = new FerrariEngine(1.8, 6, 220);
        FerrariEngine vettelEngine = new FerrariEngine(2.4, 8, 300);
        FerrariEngine kimiEngine = new FerrariEngine(1.6, 8, 200);
        FerrariEngine schumacherEngine = new FerrariEngine(3.2, 10, 400);

        RenaultEngine alonsoEngine = new RenaultEngine(3.2, 10, 380, 1000);
        RenaultEngine riccardoEngine = new RenaultEngine(1.6, 6, 180, 1000);
        RenaultEngine verstappenEngine = new RenaultEngine(1.6, 8, 280, 1000);
        RenaultEngine perezEngine = new RenaultEngine(2.4, 10, 280, 1000);
        RenaultEngine webberEngine = new RenaultEngine(2.4, 6, 180, 800);

        ArrayList<Engine> engines = new ArrayList<>();
        engines.add(leclercEngine);
        engines.add(sainzEngine);
        engines.add(vettelEngine);
        engines.add(kimiEngine);
        engines.add(schumacherEngine);
        engines.add(alonsoEngine);
        engines.add(riccardoEngine);
        engines.add(verstappenEngine);
        engines.add(perezEngine);
        engines.add(webberEngine);

        for(Engine engine : engines){
            System.out.println(engine.getMaxSpeed() + " km/h");
        }

    }
}
