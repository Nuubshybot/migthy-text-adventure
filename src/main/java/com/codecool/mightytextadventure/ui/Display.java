package com.codecool.mightytextadventure.ui;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Inventory;
import com.codecool.mightytextadventure.logic.Action;

import java.util.List;

public class Display {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printList(List<Inventory> list) {
        for (Inventory s : list) {
            System.out.println(s.getName());
        }
    }

    public void printLocation(Area areas) {
        System.out.println("itt vagyunk : " + areas.getName());
    }

    public void printChoices(List<Action> choices) {
        for (Action a : choices) {
            System.out.println(a.getName());
        }
    }

    public void printAreas(List<Area> areas) {
        for (Area a : areas) {
            System.out.println(a.getName());
        }
    }

}
