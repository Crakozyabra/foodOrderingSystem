package org.example.model.builders;

import lombok.Data;
import org.example.model.menu.AbstractMenuItem;
import org.example.model.storage.MenuItemStorage;

@Data
public abstract class  OrderBuilder <E extends AbstractMenuItem>{
    private final MenuItemStorage<E> menuItemStorage;
    private final Order order;

    public OrderBuilder(MenuItemStorage<E> menuItemStorage,Order order) {
        this.menuItemStorage = menuItemStorage;
        this.order = order;
    }

    public OrderBuilder<E> addAdditionalMenuItemToLastOrderItem(int menuItemId){
        return this;
    };

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
