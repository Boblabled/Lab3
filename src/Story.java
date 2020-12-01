
import Human.Human;
import ThingLike.*;

import static Enum.Methods.MATHEMATICAL;
import static Enum.Methods.PRACTICAL;

public class Story {
    public static void main(String[] args) {
        Human znayka = new Human("Знайка");
        Cord cordHave = new Cord("Шнур", 40);
        Cord cordNeed = new Cord("Шнур который нужен", 240);

        if (cordHave.hashCode() != cordNeed.hashCode()){
            System.out.println();
            znayka.calculate(MATHEMATICAL, cordHave.getName());
            cordHave.lengthTriple();
            if (!cordHave.equals(cordNeed)){
                System.out.println();
                znayka.calculate(PRACTICAL, cordHave.getName());
                cordHave.lengthDouble();
            }
            else {
                System.out.println("шнуры равны");
            }
        }
        else {
            System.out.println("шнуры равны");
        }
        System.out.println();

        Rocket rocket = new Rocket("Ракета");
        Place cave = new Place("Пещера");

        System.out.println();

        rocket.bind(cordHave.getName());
        znayka.toved(rocket.getName(), cave.getName());
        znayka.take(cordHave.getName());
        znayka.move(240);

        System.out.println();

        Human fucsia = new Human("Фуксия");
        WeightlessnessDevise weightlessnessDevise = new WeightlessnessDevise("Прибор невесомости",240);
        String command = "Включить " + weightlessnessDevise.getName();

        System.out.println();

        znayka.giveCommand(command);
        fucsia.executeCommand(command);
        weightlessnessDevise.turnOn();

        System.out.println();

        Place moon = new Place("Луна");
        rocket.separate(moon.getName());
        rocket.rise("вверх");
    }
}
