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
    void getMenuItems() {
        Restaurant restaurant = new Restaurant();
        List<MenuItem> menu = restaurant.getMenuItems();
        for (MenuItem menuItem: menu) {
            System.err.println(menuItem);
        }
    }
}