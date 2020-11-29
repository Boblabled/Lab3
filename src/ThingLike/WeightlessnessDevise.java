package ThingLike;
import Thing.Thing;

public class WeightlessnessDevise extends Thing {
    private boolean work = false;
    private final int range;

    public WeightlessnessDevise(int range) {
        this.range = range;
        name = "Прибор невесомости";
        System.out.println(toString());
    }

    public void turnOn() {
        if (!this.work) {
            this.work = true;
            System.out.println("Вкючение объекта " + this.name);
            System.out.println("Сила тяжести начинает ощущаться на расстоянии " + this.range + " шагов");
        }
        else {
            System.out.println(this.name + " и так включен");
        }
    }

    public void turnOff() {
        if (this.work) {
            this.work = false;
            System.out.println("Выкючение объекта " + this.name);
            System.out.println("Сила тяжести перестаёт ощущаться");
        }
        else {
            System.out.println(this.name + " и так выключен");
        }
    }

}
