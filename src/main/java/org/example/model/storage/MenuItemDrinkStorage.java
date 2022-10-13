package org.example.model.storage;

import org.example.model.drink.Drink;

public class MenuItemDrinkStorage <E extends Drink> extends MenuItemStorage<Drink>{
    public MenuItemDrinkStorage(String pathToMenuItemStorage) {
            super(pathToMenuItemStorage, Drink.class);
    }
}

