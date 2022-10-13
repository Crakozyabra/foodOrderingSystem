package org.example.model.builders;

import org.example.model.drink.Drink;
import org.example.model.lunch.Desert;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuItemDesertStorage;
import org.example.model.storage.MenuItemDrinkStorage;
import org.example.model.storage.MenuItemStorage;

public class DrinkOrderBuilder extends OrderBuilder<Drink>{
    public DrinkOrderBuilder() {
        super(new MenuItemDrinkStorage<Drink>(Menu.DRINKS.getPathToFile().toString()));
    }
}
