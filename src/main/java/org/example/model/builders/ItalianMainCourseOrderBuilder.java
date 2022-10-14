package org.example.model.builders;

import org.example.model.lunch.MainCourse;
import org.example.model.storage.MenuItemMainCourseStorage;
import org.example.model.storage.Menu;

public class ItalianMainCourseOrderBuilder extends OrderBuilder<MainCourse>{
    public ItalianMainCourseOrderBuilder() {
        super(new MenuItemMainCourseStorage<MainCourse>(Menu.ITALIAN_MAIN_COURSES.getPathToFile().toString()), new MainCourseOrder());
    }
}
