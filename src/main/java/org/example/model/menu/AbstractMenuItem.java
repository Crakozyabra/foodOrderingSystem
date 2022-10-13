package org.example.model.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractMenuItem implements MenuItem{
    private Integer id;
    private String name;
    private Double price;
    private List<MenuItem> additionalMenuItems = new ArrayList<>();

    public AbstractMenuItem(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + "\t" + price + "\n" +
                additionalMenuItems.
                        stream().
                        map(e -> "\t" + e.toString()+ "\n").
                        collect(Collectors.joining(""));
    }
}
