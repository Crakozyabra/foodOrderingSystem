package org.example.model.storage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public enum Menu implements EnumChoices {
    CUISINES("cuisines.txt"),
    POLISH_MAIN_COURSES("maincourses/polish_main_courses.txt"),
    MEXICAN_MAIN_COURSES("maincourses/mexican_main_courses.txt"),
    ITALIAN_MAIN_COURSES("maincourses/italian_main_courses.txt"),
    POLISH_DESSERTS("desserts/polish_desserts.txt"),
    MEXICAN_DESSERTS("desserts/mexican_desserts.txt"),
    ITALIAN_DESSERTS("desserts/italian_main_courses.txt"),
    DRINKS("drinks/drinks.txt");

    private final Path pathToMenu;

    @Override
    public Path getPathToFile() {
        return pathToMenu;
    }

    Menu(String pathToFileInMenu){
        this.pathToMenu = Paths.get(new File("").getAbsolutePath()).
                resolve("src/main/java/org/example/model/menu/").
                resolve(Paths.get(pathToFileInMenu));
    }
}
