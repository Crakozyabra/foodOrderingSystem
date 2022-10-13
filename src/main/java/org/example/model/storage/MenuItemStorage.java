package org.example.model.storage;

import org.example.model.menu.AbstractMenuItem;
import org.example.model.menu.MenuItem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class MenuItemStorage <E extends AbstractMenuItem> {
    private final Path pathToMenuItemStorage;
    private List<E> menuItems;


    public MenuItemStorage(String pathToMenuItemStorage, Class<E> clazz) {
        this.pathToMenuItemStorage = Paths.get(pathToMenuItemStorage);
        initMenuItemStorage(clazz);
    }

    public MenuItem getMenuItemById(int id){
        id -= 1;
        try{
            return menuItems.get(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void initMenuItemStorage(Class<E> clazz){
        try {
            List<String> productStringNotesFromFile = Files.readAllLines(pathToMenuItemStorage);
            menuItems = productStringNotesFromFile.stream().
                    skip(2).
                    map(productStringNoteFromFile -> {
                        List<String> productListNoteFromFile =
                                Arrays.
                                        stream(productStringNoteFromFile.
                                                split(",")).
                                        map(String::trim).collect(Collectors.toList());

                        int id = Integer.parseInt(productListNoteFromFile.get(0));
                        String name = productListNoteFromFile.get(1);
                        Double price = Double.parseDouble(productListNoteFromFile.get(2));
                        return createReflectGenericInstance(id, name, price, clazz);
                    }).collect(Collectors.toList());
        } catch (Exception e){
            throw  new RuntimeException(e);
        }
    }

    private E createReflectGenericInstance(Integer id, String name, Double price, Class<E> clazz){
        Constructor<E> constructor = null;
        E instance = null;
        try {
            constructor = clazz.getConstructor(Integer.class, String.class, Double.class);
            instance = constructor.newInstance(id, name, price);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return instance;
    }
}
