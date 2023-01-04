package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> orderedDishesToEat = new ArrayList<>();
        ArrayDeque<Integer> dishesToEat = new ArrayDeque<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishesToEat.add(i);
        }

        int i = 1;
        while (!dishesToEat.isEmpty()) {

            if (i % everyDishNumberToEat == 0) {
                orderedDishesToEat.add(dishesToEat.pollFirst());
            } else {
                dishesToEat.add(dishesToEat.pollFirst());
            }

            i++;
        }

        return orderedDishesToEat;
    }
}
