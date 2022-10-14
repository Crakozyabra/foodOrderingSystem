package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.model.builders.Order;
import org.example.model.builders.OrderBuilder;
import org.example.model.drink.Drink;
import org.example.model.lunch.Desert;
import org.example.model.lunch.MainCourse;
import org.example.view.View;
@Getter
@Setter
public abstract class Model {
    private View view;
    private int cuisineId;
    private Order order;
    private OrderBuilder<MainCourse> mainCourseOrderBuilder;
    private OrderBuilder<Desert> desertOrderBuilder;
    private OrderBuilder<Drink> drinkOrderBuilder;

    public Model(View view) {
        this.view = view;
    }

    public abstract void getCuisinesMenu();
    public abstract void getDesertMenu();
    public abstract void getMainCourseMenu();
    public abstract void getDrinkMenu();
    public abstract void getAdditionalMenu();
    public abstract void getMainCourseOrder();
    public abstract void getDessertsOrder();
    public abstract void getDrinksOrder();
    public abstract void getContinueOrFinishQuestion();
}
