package org.example.model.storage;

import org.example.model.drink.Drink;
import org.example.model.lunch.MainCourse;

public class MenuItemMainCourseStorage <E extends MainCourse> extends MenuItemStorage<MainCourse>{
    public MenuItemMainCourseStorage(String pathToMenuItemStorage) {
        super(pathToMenuItemStorage, MainCourse.class);
    }
}
