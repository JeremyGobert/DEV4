package be.ehb.multec.data.iterator;

import org.junit.jupiter.api.Test;

import java.util.List;

class RestaurantTest {

    @Test
    void testToString() {
        Restaurant restaurant = new Restaurant();
        System.err.println(restaurant);
    }

    @Test
    void getMenuItems() { //SRP?
        Restaurant restaurant = new Restaurant();
        List<MenuItem> menu = restaurant.getMenuItems();
        /*double total = 0.0;*/
        for (MenuItem menuItem: menu) {
            System.err.println(menuItem);
            /*total += menuItem.getPrice();*/
        }
        /*System.err.println("Total €" + total);*/
    }

    /*@Test
    void superAggregate() {
        Restaurant restaurant = new Restaurant();
        double total = 0.0;
        for (MenuItem menuItem: restaurant) {
            total += menuItem.getPrice();
        }
        System.err.println("Total €" + total);
    }*/
}