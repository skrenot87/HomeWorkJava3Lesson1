import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }
        return weight;
    }

    public void addFruits(T fruits) {
        fruits.add(fruits);
        fruits.add(fruits);
        fruits.add(fruits);
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }

    public void pourFruitsIntoAnotherBox(Box<T> another) {
        if (this == another) {
            return;
        }
        for (int i = 0; i < this.fruits.size(); i++) {
            another.addFruits(this.fruits.get(i));
        }
        this.fruits.clear();
    }

}
