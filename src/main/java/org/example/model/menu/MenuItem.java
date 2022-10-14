package org.example.model.menu;


import java.util.List;

public interface MenuItem {
    public int getId();
    public void setId(int id);
    public String getName();
    public Double getPrice();
    public void setName(String name);
    public void setPrice(Double price);
    public String toString();
    public void addAdditionalMenuItem(MenuItem menuItem);
    public List<MenuItem> getAdditionalMenuItems();
}
