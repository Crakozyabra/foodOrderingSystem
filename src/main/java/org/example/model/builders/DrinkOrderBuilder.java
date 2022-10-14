package org.example.model.builders;

import org.example.model.drink.Drink;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuAdditionalItemForDrinkStorage;
import org.example.model.storage.MenuItemDrinkStorage;
import org.example.model.storage.MenuItemStorage;

public class DrinkOrderBuilder extends OrderBuilder<Drink>{
    private final MenuItemStorage<Drink> menuAdditionalItemStorage;

    public DrinkOrderBuilder() {
        super(new MenuItemDrinkStorage<Drink>(Menu.DRINKS.getPathToFile().toString()), new DrinksOrder());
        menuAdditionalItemStorage = new MenuAdditionalItemForDrinkStorage<Drink>(Menu.ADDITIONAL_FOR_DRINK.getPathToFile().toString());
    }

    @Override
    public OrderBuilder<Drink> addAdditionalMenuItemToLastOrderItem(int menuItemId) {
        if (getOrder().getMenuItems().isEmpty()) return this;
        getOrder().getMenuItems().get(getOrder().getMenuItems().size()-1).addAdditionalMenuItem(menuAdditionalItemStorage.getMenuItemById(menuItemId));
        return this;
    }
}
