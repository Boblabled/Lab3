package ThingLike;

import Thing.Thing ;

public class Rocket extends Thing {
    public Rocket(String name) {
        setName(name);
        System.out.println(toString());
    }

    public void bind(String object){
        System.out.println("Объект " + getName() + " был привязан объектом " + object);
    }

    public void separate(String place){
        System.out.println("Объект " + getName() + " отделился от объекта " + place);
    }

    public void rise(String direction){
        System.out.println("Объект " + getName() + " поднялся " + direction);
    }
}
