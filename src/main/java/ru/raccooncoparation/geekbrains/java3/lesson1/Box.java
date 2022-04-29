package ru.raccooncoparation.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits = new ArrayList<>();

    public Box(Collection<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<?> another) {

        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }

    public void drainToBox(Box<T> another) {
        if (this == another) {
            return;
        }
        for (T fruit : fruits) {
            another.addFruit(fruit);
        }
        this.fruits.clear();
    }

}
