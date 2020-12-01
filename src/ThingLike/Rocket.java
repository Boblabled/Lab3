package ThingLike;

import Thing.Thing ;

public class Rocket extends Thing {
    public Rocket() {
        setName("Ракета");
        System.out.println(toString());
    }

    public void bind(String object){
        System.out.println("Объект " + getName() + " был привязан объектом " + object);
    }

    public void separate(String object){
        System.out.println("Объект " + getName() + " отделился от объекта " + object);
    }

    public void rise(String direction){
        System.out.println("Объект " + getName() + " поднялся " + direction);
    }
}
