package ThingLike;

import Thing.Thing ;

public class Cord extends Thing {
    private int length;

    public Cord(String name, int length) {
        this.length = length;
        this.name = name;
        System.out.println(toString());
    }

    public void lengthDouble() {
        this.length = this.length * 2;
        System.out.println(this.name + " увеличить вдвое до значения " + this.length + " шагов");
    }

    public void lengthTriple() {
        this.length = this.length * 3;
        System.out.println(this.name + " увеличить втрое до значения " + this.length + " шагов");
    }

    @Override
    public int hashCode() {
        return length;
    }

    @Override
    public boolean equals(Object object) {
        Cord cord = (Cord) object;
        return length == cord.length;
    }
}
