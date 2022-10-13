package org.example.controller;

import org.example.model.Model;
import org.example.model.builders.*;
import org.example.model.lunch.MainCourse;
import org.example.model.storage.Questions;

public class FoodOrderingSystemController extends Controller{

    public FoodOrderingSystemController(Model model) {
        super(model);
    }

    @Override
    public void choiceCuisine(){
        getModel().getCuisinesMenu();
        getModel().setCuisineId(readInt());
        setOrderBuilders(getModel().getCuisineId());
    }

    @Override
    public void seeDesertsMenu(){
        getModel().getDesertMenu();
    }




    @Override
    public void seeMainCoursesMenu() {
        getModel().getMainCourseMenu();
    }

    @Override
    public void orderMainCourse() {
        getModel().getMainCourseOrderBuilder().addMenuItem(readInt());
        getModel().getContinueOrFinishQuestion();
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