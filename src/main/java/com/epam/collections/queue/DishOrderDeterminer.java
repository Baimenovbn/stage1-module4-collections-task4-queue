package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayList<Integer> orderedDishesToEat = new ArrayList<>();
        ArrayList<Integer> dishesToEat = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            dishesToEat.add(i);
        }

        int i = 0;
        int countIndex = 1;
        while (!dishesToEat.isEmpty() && orderedDishesToEat.size() != numberOfDishes) {

            if (dishesToEat.get(i) != null) {
                if (countIndex % everyDishNumberToEat == 0) {
                    orderedDishesToEat.add(dishesToEat.get(i));
                    dishesToEat.set(i, null);
                    countIndex = 1;
                } else {
                    countIndex++;
                }
            }


            if (i == dishesToEat.size() - 1) {
                i = -1;
            }

            i++;
        }

        return orderedDishesToEat;
    }
}
