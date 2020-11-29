package Thing;

public abstract class Thing{
    public String name = "name";

    @Override
    public String toString() {
        return "Появился объект " + this.name;
    }
}
