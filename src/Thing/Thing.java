package Thing;

public abstract class Thing{
    private String name = "name";

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
}
