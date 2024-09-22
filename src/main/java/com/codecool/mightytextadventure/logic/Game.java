package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.Application;
import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Player;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Area[] areas;
    private final Input input;
    private final Display display;

    public Game(Area[] areas, Input input, Display display) {
        this.areas = areas;
        this.input = input;
        this.display = display;
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            isRunning = step();
        }
    }

    private boolean step() {
        List<Area>selectedArea = new ArrayList<Area>();
        selectedArea.add(areas[0]);
        Area area = areas[0];
        Player player = new Player(Application.createInventory(), area);
        List<Action> actions = new ArrayList<>(area.getActions());
        display.printMessage("Whats your name?");
        String name = input.getNameFromUser();
        player.setName(name);
        player.setLocation(selectedArea.get(0));
        while (player.getLocation() != areas[3]) {
            display.printLocation(player.getLocation());
            selectedArea =  input.getSelectedArea(actions);
            display.printLocation(player.getLocation());
            display.printLocation(player.getLocation());
            actions = input.getSelectedActionFromUser(selectedArea,player);
            display.printLocation(player.getLocation());
        }
        //display.printMessage(player.getName());
        //display.printLocation(player.getLocation());
        return false;
    }
}
