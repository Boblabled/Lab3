package ThingLike;
import Thing.Thing;

public class WeightlessnessDevise extends Thing {
    private boolean work = false;
    private final int range;

    public WeightlessnessDevise(String name, int range) {
        this.range = range;
        setName(name);
        System.out.println(toString());
    }

    public void turnOn() {
        if (!this.work) {
            this.work = true;
            System.out.println("Вкючение объекта " + getName());
            System.out.println("Сила тяжести начинает ощущаться на расстоянии " + this.range + " шагов");
        }
        else {
            System.out.println(getName() + " и так включен");
        }
    }

    public void turnOff() {
        if (this.work) {
            this.work = false;
            System.out.println("Выкючение объекта " + getName());
            System.out.println("Сила тяжести перестаёт ощущаться");
        }
        else {
            System.out.println(getName() + " и так выключен");
        }
    }

}
