package org.example.view;

import org.example.model.builders.Order;
import org.example.model.storage.Menu;
import org.example.model.storage.Questions;

import java.io.IOException;
import java.nio.file.Files;

public class FoodOrderingSystemView extends View{


    @Override
    public void printMenu(Menu menu) {
        try {
            Files.readAllLines(menu.getPathToFile()).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printQuestion(Questions question) {
        try {
            Files.readAllLines(question.getPathToFile()).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printOrder(Order order) {
        System.out.println(order.getMenuItems());
    }
}
