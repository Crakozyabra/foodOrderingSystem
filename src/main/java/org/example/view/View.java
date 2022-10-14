package org.example.view;

import org.example.model.builders.Order;
import org.example.model.storage.Menu;
import org.example.model.storage.Orders;
import org.example.model.storage.Questions;

public abstract class View {
    public abstract void printMenu(Menu menu);
    public abstract void printQuestion(Questions question);
    public abstract void printOrder(Order order);
}
