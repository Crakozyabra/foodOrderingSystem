package org.example.model.builders;

import lombok.Data;
import org.example.model.menu.AbstractMenuItem;
import org.example.model.storage.MenuItemStorage;

@Data
public abstract class  OrderBuilder <E extends AbstractMenuItem>{
    private final MenuItemStorage<E> menuItemStorage;
    private final Order order = new Order();

    public OrderBuilder(MenuItemStorage<E> menuItemStorage) {
        this.menuItemStorage = menuItemStorage;
    }


    public OrderBuilder<E> addMenuItems(Order order){
        this.order.getMenuItems().addAll(order.getMenuItems());
        return this;
    }

    public OrderBuilder<E> addMenuItem(int menuItemId){
        this.order.addMenuItemToOrder(this.menuItemStorage.getMenuItemById(menuItemId));
        return this;
    }

    public Order build(){
        return order;
    }
}
