package be.ehb.multec.data.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Restaurant implements Iterable<MenuItem> {
    private static List<MenuItem> Menu;

    public Restaurant() {
        Menu = new ArrayList<>();
        Menu.add(new MenuItem("KipCoery"));
        Menu.add(new MenuItem("Kip"));
        Menu.add(new MenuItem("Prepare"));
    }

    public static List<MenuItem> getMenuItems() {
        List<MenuItem> menu = new ArrayList<>(Menu);
        return menu;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(MenuItem menuItem: Menu) {
            res.append(menuItem);
            res.append('\n');
        }
        return res.toString();
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new MenuIterator(Menu);
    }
}
