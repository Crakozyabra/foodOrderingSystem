package org.example.controller;

import lombok.Getter;
import org.example.model.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

@Getter
public abstract class Controller{
    private Model model;
    private BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(System.in));

    public Controller(Model model) {
        this.model = model;
    }

    public int readInt(int startIntIncluded, int finishIntIncluded){
        int reedInt;
        while (true) {
            try {
                reedInt = Integer.parseInt(bufferedInputStream.readLine());
            } catch (IOException | NumberFormatException e) {
                continue;
            }
            if (reedInt >= startIntIncluded && reedInt <= finishIntIncluded)
                return reedInt;
        }
    }


    public String readString(String... allowedStrings){
        String reedString = "";
        while (true) {

            try {
                reedString = bufferedInputStream.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if(Arrays.stream(allowedStrings).anyMatch(Predicate.isEqual(reedString)))
                    return reedString;
        }
    }

    public abstract void choiceCuisine();
    public abstract void orderMainCourse();
    public abstract void orderDesserts();
    public abstract void orderDrinks();




}
