package org.example.model.builders;

import org.example.model.lunch.Desert;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuItemDesertStorage;
import org.example.model.storage.MenuItemStorage;

public class MexicanDessertOrderBuilder  extends OrderBuilder<Desert>{
    public MexicanDessertOrderBuilder() {
        super(new MenuItemDesertStorage<Desert>(Menu.MEXICAN_DESSERTS.getPathToFile().toString()));
    }
}
