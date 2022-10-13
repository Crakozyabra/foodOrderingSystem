package org.example.model.builders;

import org.example.model.lunch.MainCourse;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuItemMainCourseStorage;

public class MexicanMainCourseOrderBuilder extends OrderBuilder<MainCourse>{
    public MexicanMainCourseOrderBuilder() {
        super(new MenuItemMainCourseStorage<MainCourse>(Menu.MEXICAN_MAIN_COURSES.getPathToFile().toString()));
    }
}
