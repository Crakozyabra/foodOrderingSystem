package org.example.controller;

import lombok.Getter;
import org.example.model.Model;
import org.example.model.storage.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Getter
public abstract class Controller{
    private Model model;
    private BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(System.in));

    public Controller(Model model) {
        this.model = model;
    }

    public int readInt(){
        int reedInt;
        while (true) {
            try {
                reedInt = Integer.parseInt(bufferedInputStream.readLine());
            } catch (IOException | NumberFormatException e) {
                continue;
            }
            return reedInt;
        }
    }

    public abstract void choiceCuisine();
    public abstract void seeMainCoursesMenu();
    public abstract void orderMainCourse();
    public abstract void seeDesertsMenu();




}
