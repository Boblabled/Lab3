package ThingLike;

import Thing.Thing;

public class Place extends Thing {
    public Place(String name) {
        setName(name);
        System.out.println(toString());
    }
}
