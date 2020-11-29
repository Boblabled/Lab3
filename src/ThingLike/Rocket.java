package ThingLike;

import Thing.Thing ;

public class Rocket extends Thing {
    public Rocket() {
        name = "Ракета";
        System.out.println(toString());
    }

    public void bind(String object){
        System.out.println("Объект " + this.name + " был привязан объектом " + object);
    }

    public void separate(String object){
        System.out.println("Объект " + this.name + " отделился от объекта " + object);
    }

    public void rise(String direction){
        System.out.println("Объект " + this.name + " поднялся " + direction);
    }
}
