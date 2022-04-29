public class Fruit {

    private float wight;

    public Fruit(float wight) {
        this.wight = wight;
    }

    public float getWeight() {
        return wight;
    }

    public <T extends Fruit> void add(T fruits) {
    }
}

