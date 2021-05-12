package be.ehb.multec.data.iterator;

import java.util.Iterator;
import java.util.List;

public class MenuIterator implements Iterator<MenuItem> {
    private List<MenuItem> Menu;
    private Iterator<MenuItem> MenuIterator;

    public MenuIterator(List<MenuItem> Menu) {
        this.Menu = Menu;
        MenuIterator = Menu.iterator();
    }

    @Override
    public boolean hasNext() {
        if(MenuIterator.hasNext())
            return true;
        else
            return false;
    }

    @Override
    public MenuItem next() {
        if(MenuIterator.hasNext())
            return MenuIterator.next();
        else
            return null;
    }
}
