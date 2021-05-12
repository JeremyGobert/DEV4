package be.ehb.multec.data.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Restaurant implements Iterable<MenuItem> {
    private List<MenuItem> Menu;

    public Restaurant() {
        Menu = new ArrayList<>();
        /*breakfastMenu.add(new MenuItem("Pannenkoeken", 11.50));*/
        Menu.add(new MenuItem("KipCoery"));
        Menu.add(new MenuItem("Kip"));
        Menu.add(new MenuItem("Prepare"));
    }

    public List<MenuItem> getMenuItems() {
        List<MenuItem> menu = new ArrayList<>();
        menu.addAll(Menu);
        return menu;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        /*for (int i = 0; i < breakfastMenu.size(); i++) {
            res.append(breakfastMenu.get(i));
            res.append('\n');
        }*/
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
