package Human;
import Interfaces.Command;

public abstract class Human implements Command {
    private String name = "Имя";

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Появился объект " + this.name;
    }

    public void take(String object) {
        System.out.println(this.name + " взял в руки объект " + object);
    }

    public void move(int distance) {
        System.out.println(this.name + " отошёл на " + distance + " шагов" );
    }

    public void toved(String object, String place) {
        System.out.println(this.name + " отбуксировал объект " + object + " к месту " + place);
    }

    public void giveCommand(String command) {
        System.out.println("Объект " + this.name + " подал команду: " + command);
    }

    public void executeCommand(String command){
        System.out.println("Объект " + this.name + " выполнил команду: " + command);
    }
}
