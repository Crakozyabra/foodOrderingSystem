package org.example.model.storage;

import org.example.model.lunch.Desert;

public class MenuItemDesertStorage <E extends Desert> extends MenuItemStorage<Desert>{
    public MenuItemDesertStorage(String pathToMenuItemStorage) {
        super(pathToMenuItemStorage, Desert.class);
    }
}
