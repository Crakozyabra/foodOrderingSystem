package org.example.model.storage;

import org.example.model.drink.Drink;

public class MenuAdditionalItemForDrinkStorage<E extends Drink> extends MenuItemStorage<Drink>{
    public MenuAdditionalItemForDrinkStorage(String pathToMenuItemStorage) {
        super(pathToMenuItemStorage, Drink.class);
    }
}
