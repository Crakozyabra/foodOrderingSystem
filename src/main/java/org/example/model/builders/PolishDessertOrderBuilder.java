package org.example.model.builders;

import org.example.model.lunch.Desert;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuItemDesertStorage;

public class PolishDessertOrderBuilder extends OrderBuilder<Desert>{
    public PolishDessertOrderBuilder() {
        super(new MenuItemDesertStorage<Desert>(Menu.POLISH_DESSERTS.getPathToFile().toString()), new DessertsOrder());
    }
}
