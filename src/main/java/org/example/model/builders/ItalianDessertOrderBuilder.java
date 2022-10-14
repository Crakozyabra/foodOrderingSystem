package org.example.model.builders;

import org.example.model.lunch.Desert;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuItemDesertStorage;

public class ItalianDessertOrderBuilder extends OrderBuilder<Desert>{
    public ItalianDessertOrderBuilder() {
        super(new MenuItemDesertStorage<Desert>(Menu.ITALIAN_DESSERTS.getPathToFile().toString()), new DessertsOrder());
    }
}
