package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.controller.Controller;
import org.example.model.Model;
import org.example.view.View;

@Data
public abstract class OrderingSystem {
    private View view;
    private Model model;
    private Controller controller;


    public abstract void startOrdering();
}
