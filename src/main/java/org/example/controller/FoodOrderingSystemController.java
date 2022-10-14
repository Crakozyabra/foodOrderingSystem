package org.example.controller;

import org.example.model.Model;
import org.example.model.builders.*;

public class FoodOrderingSystemController extends Controller{

    public FoodOrderingSystemController(Model model) {
        super(model);
    }

    @Override
    public void choiceCuisine(){
        getModel().getCuisinesMenu();
        getModel().setCuisineId(readInt(1,3));
        setOrderBuilders(getModel().getCuisineId());
    }

    @Override
    public void orderMainCourse() {
        getModel().getMainCourseMenu();
        while (true) {
            getModel().getMainCourseOrderBuilder().addMenuItem(readInt(1,7));
            getModel().getMainCourseOrder();
            getModel().getContinueOrFinishQuestion();
            String choiceOnTheQuestion = readString("Continue", "C", "Finish", "F");
            if (choiceOnTheQuestion.equals("Finish") || choiceOnTheQuestion.equals("F")) {
                break;
            } else {
                getModel().getMainCourseMenu();
            }
        }
    }

    @Override
    public void orderDesserts() {
        getModel().getDesertMenu();
        while (true) {
            getModel().getDesertOrderBuilder().addMenuItem(readInt(1,7));
            getModel().getDessertsOrder();
            getModel().getContinueOrFinishQuestion();
            String choiceOnTheQuestion = readString("Continue", "C", "Finish", "F");
            if (choiceOnTheQuestion.equals("Finish") || choiceOnTheQuestion.equals("F")) {
                break;
            } else {
                getModel().getDesertMenu();
            }
        }
    }

    @Override
    public void orderDrinks() {
        getModel().getDrinkMenu();
        while (true) {
            getModel().getDrinkOrderBuilder().addMenuItem(readInt(1,3));
            getModel().getDrinksOrder();
            while (true) {
                getModel().getAdditionalMenu();
                getModel().getDrinkOrderBuilder().addAdditionalMenuItemToLastOrderItem(readInt(1,2));
                getModel().getDrinksOrder();
                getModel().getContinueOrFinishQuestion();
                String choiceOnTheQuestion = readString("Continue", "C", "Finish", "F");
                if (choiceOnTheQuestion.equals("Finish") || choiceOnTheQuestion.equals("F")) break;
            }
            getModel().getDrinksOrder();
            getModel().getDrinkMenu();
            getModel().getContinueOrFinishQuestion();
            String choiceOnContinueOrFinishQuestion = readString("Continue", "C", "Finish", "F");
            if (choiceOnContinueOrFinishQuestion.equals("Finish") || choiceOnContinueOrFinishQuestion.equals("F")) {
                break;
            } else {
                getModel().getDrinkMenu();
            }
        }
    }

    private void setOrderBuilders(int cuisineId){
        switch (cuisineId){
            case 1 -> {
                getModel().setMainCourseOrderBuilder(new PolishMainCourseOrderBuilder());
                getModel().setDesertOrderBuilder(new PolishDessertOrderBuilder());
            }
            case 2 -> {
                getModel().setMainCourseOrderBuilder(new MexicanMainCourseOrderBuilder());
                getModel().setDesertOrderBuilder(new MexicanDessertOrderBuilder());
            }
            case 3 -> {
                getModel().setMainCourseOrderBuilder(new ItalianMainCourseOrderBuilder());
                getModel().setDesertOrderBuilder(new ItalianDessertOrderBuilder());
            }
        }
        getModel().setDrinkOrderBuilder(new DrinkOrderBuilder());
    }
}