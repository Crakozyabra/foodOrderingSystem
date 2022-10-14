package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.storage.Menu;
import org.example.model.storage.Questions;
import org.example.view.View;

@Getter
@Setter
public class FoodOrderingSystemModel extends Model{

    public FoodOrderingSystemModel(View view) {
        super(view);
    }

    public void getCuisinesMenu(){
        getView().printMenu(Menu.CUISINES);
    }

    @Override
    public void getDesertMenu(){
        switch (this.getCuisineId()) {
            case 1 -> getView().printMenu(Menu.POLISH_DESSERTS);
            case 2 -> getView().printMenu(Menu.MEXICAN_DESSERTS);
            case 3 -> getView().printMenu(Menu.ITALIAN_DESSERTS);
        }
    }

    @Override
    public void getMainCourseMenu() {
        switch (this.getCuisineId()) {
            case 1 -> getView().printMenu(Menu.POLISH_MAIN_COURSES);
            case 2 -> getView().printMenu(Menu.MEXICAN_MAIN_COURSES);
            case 3 -> getView().printMenu(Menu.ITALIAN_MAIN_COURSES);
        }
    }

    @Override
    public void getDrinkMenu() {
        getView().printMenu(Menu.DRINKS);
    }

    @Override
    public void getAdditionalMenu() {
        getView().printMenu(Menu.ADDITIONAL_FOR_DRINK);
    }

    @Override
    public void getMainCourseOrder() {
        getView().printOrder(this.getMainCourseOrderBuilder().build());
    }

    @Override
    public void getDessertsOrder() {
        getView().printOrder(this.getDesertOrderBuilder().build());
    }

    @Override
    public void getDrinksOrder(){
        getView().printOrder(this.getDrinkOrderBuilder().build());
    }

    @Override
    public void getContinueOrFinishQuestion() {
        getView().printQuestion(Questions.CONTINUE_OR_FINISH);
    }
}
