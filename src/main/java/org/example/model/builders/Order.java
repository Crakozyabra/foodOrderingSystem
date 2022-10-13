package org.example.model.builders;

import org.example.model.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private  List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItemToOrder(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "menuItems=" + menuItems +
                '}';
    }
}
