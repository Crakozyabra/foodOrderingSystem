package org.example.model.builders;

import lombok.Getter;
import lombok.Setter;
import org.example.model.menu.MenuItem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
public abstract class Order {
    private List<MenuItem> menuItems = new ArrayList<>();
    private String orderName = "Order";

    public void addMenuItemToOrder(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return orderName + ":\n" +
                menuItems.
                stream().
                map(e -> "\t" + e.toString()).
                collect(Collectors.joining("")) +
                "------------------------\n" +
                orderName + " full cost: " + getFullCost() + "\n";
    }

    private Double getFullCost(){
        return menuItems.
                stream().
                mapToDouble(menuItem -> {
                    return menuItem.getPrice() +
                            menuItem.
                                    getAdditionalMenuItems().
                                    stream().
                                    mapToDouble(
                                            menuItem1 -> {
                                                return menuItem1.getPrice();
                                            }).sum();
                }).sum();
    }
}
