package org.example;

import org.example.controller.Controller;
import org.example.controller.FoodOrderingSystemController;
import org.example.model.FoodOrderingSystemModel;
import org.example.model.Model;
import org.example.view.FoodOrderingSystemView;
import org.example.view.View;

public class FoodOrderingSystem extends OrderingSystem{

    public FoodOrderingSystem() {
        View view = new FoodOrderingSystemView();
        Model model = new FoodOrderingSystemModel(view);
        Controller controller = new FoodOrderingSystemController(model);
        this.setView(view);
        this.setModel(model);
        this.setController(controller);
    }

    public static void main(String[] args ) {
        OrderingSystem foodOrderingSystem = new FoodOrderingSystem();
        foodOrderingSystem.startOrdering();
    }

    @Override
    public void startOrdering(){
        getController().choiceCuisine();
        getController().orderMainCourse();
        getController().orderDesserts();
        getController().orderDrinks();
    }
}
