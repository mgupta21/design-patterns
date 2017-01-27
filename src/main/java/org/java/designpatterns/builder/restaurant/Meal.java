package org.java.designpatterns.builder.restaurant;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/26/17.
 */
public class Meal {

    private static Logger LOGGER = Logger.getLogger(Meal.class);

    private List<Item>    items  = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public double getBill() {
        return items.stream().mapToDouble(i -> i.price()).reduce(0, Double::sum);
    }

    public void showItems() {
        items.forEach(i -> LOGGER.info("\nItem : " + i.name() + "\nPacking : " + i.packing().pack() + "\nPrice : $" + i.price()));
    }

}
