package org.example.model.builders;

import org.example.model.lunch.MainCourse;
import org.example.model.storage.Menu;
import org.example.model.storage.MenuItemMainCourseStorage;

public class PolishMainCourseOrderBuilder extends OrderBuilder<MainCourse>{
    public PolishMainCourseOrderBuilder() {
        super(new MenuItemMainCourseStorage<MainCourse>(Menu.POLISH_MAIN_COURSES.getPathToFile().toString()), new MainCourseOrder());
    }
}
