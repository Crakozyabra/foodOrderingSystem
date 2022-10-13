package org.example.model.storage;

import org.example.model.storage.EnumChoices;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public enum Questions implements EnumChoices {
    CONTINUE_OR_FINISH("questions/continue_or_finish.txt");

    private final Path pathToQuestion;

    @Override
    public Path getPathToFile() {
        return pathToQuestion;
    }

    Questions(String pathToFileInMenu){
        this.pathToQuestion = Paths.get(new File("").getAbsolutePath()).
                resolve("src/main/java/org/example/model/menu/").
                resolve(Paths.get(pathToFileInMenu));
    }
}
