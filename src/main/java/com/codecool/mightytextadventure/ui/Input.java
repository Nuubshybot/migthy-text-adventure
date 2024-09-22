package com.codecool.mightytextadventure.ui;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.logic.Action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    Display display = new Display();


    public String getNameFromUser() {
        return scanner.nextLine();
    }

    public List<Area> getSelectedArea(List<Action> input) {
        boolean isValidChoice = false;
        String choice;
        List<Area> selectedArea = null;
        display.printChoices(input);
        display.printMessage("Select from the action above:");

        while (!isValidChoice) {
            choice = scanner.nextLine().toLowerCase();
            for (Action action : input) {
                if (action.getName().toLowerCase().contains(choice)) {
                    isValidChoice = true;
                    display.printMessage(action.getName());
                    selectedArea = action.getArea();
                }
            }
            display.printMessage("Please select from the action above.");
        }

        return selectedArea;
    }

    public List<Action> getSelectedActionFromUser(List<Area> selectedArea,Player player) {
        boolean isValidChoice = false;
        String choice;
        List<Action> selectedAction = null;
        display.printAreas(selectedArea);
        display.printMessage("Select from the areas above:");
        while (!isValidChoice) {
            choice = scanner.nextLine().toLowerCase();
            for (Area area : selectedArea) {
                if (area.getName().toLowerCase().contains(choice)) {
                    isValidChoice = true;
                    selectedAction = area.getActions();
                    player.setLocation(area);
                }
            }
                display.printMessage("Please select from the areas above.");
        }
        return selectedAction;
    }
}
