package HumanLike;

import Human.Human;
import Interfaces.Calculations;
import Enum.Methods;

public class Znayka extends Human
    implements Calculations{

    public Znayka() {
        setName("Знайка");
        System.out.println(toString());
    }

    public void calculate(Methods calculation, String object) {
        System.out.println(getName() + " произвёл " + calculation + " объекта " + object);
    }
}
