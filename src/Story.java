import HumanLike.Fucsia;
import HumanLike.Znayka;
import ThingLike.*;

import static Interfaces.Methods.MATHEMATICAL;
import static Interfaces.Methods.PRACTICAL;

public class Story {
    public static void main(String[] args) {
        Znayka znayka = new Znayka();
        Cord cordHave = new Cord("Шнур", 40);
        Cord cordNeed = new Cord("Шнур который нужен", 240);

        if (cordHave.hashCode() != cordNeed.hashCode()){
            System.out.println();
            znayka.calculate(MATHEMATICAL, cordHave.name);
            cordHave.lengthTriple();
            if (!cordHave.equals(cordNeed)){
                System.out.println();
                znayka.calculate(PRACTICAL, cordHave.name);
                cordHave.lengthDouble();
                System.out.println();
            }
            else {
                System.out.println("шнуры равны");
                System.out.println();
            }
        }
        else {
            System.out.println("шнуры равны");
            System.out.println();
        }

        Rocket rocket = new Rocket();
        Cave cave = new Cave();

        System.out.println();

        rocket.bind(cordHave.name);
        znayka.toved(rocket.name, cave.name);
        znayka.take(cordHave.name);
        znayka.move(240);

        System.out.println();

        Fucsia fucsia = new Fucsia();
        WeightlessnessDevise weightlessnessDevise = new WeightlessnessDevise(240);
        String command = "Включить " + weightlessnessDevise.name;

        System.out.println();

        znayka.giveCommand(command);
        fucsia.executeCommand(command);
        weightlessnessDevise.turnOn();

        System.out.println();

        Moon moon =new Moon();
        rocket.separate(moon.name);
        rocket.rise("вверх");
    }
}
