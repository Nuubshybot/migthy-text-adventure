package com.codecool.mightytextadventure;

import com.codecool.mightytextadventure.data.Area;
import com.codecool.mightytextadventure.data.Inventory;
import com.codecool.mightytextadventure.logic.Action;
import com.codecool.mightytextadventure.logic.Game;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input();

        display.printMessage("Starting Mighty Text Adventure!");

        Area[] areas = loadAreas();

        Game game = new Game(areas, input, display);
        game.run();


        display.printMessage("Exiting from Mighty Text Adventure!");
    }



    private static Area[] loadAreas(){
        List<Action> actions = createActions();
        List<Action> area1Actions = new ArrayList<>();
        List<Action> area2Actions = new ArrayList<>();
        List<Action> area3Actions = new ArrayList<>();
        List<Action> area4Actions = new ArrayList<>();
        List<Action> area5Actions = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            area1Actions.add(actions.get(i));
        }
        for (int i = 3; i < 5; i++) {
            area2Actions.add(actions.get(i));
        }

        area3Actions.add(actions.get(1));
        area3Actions.add(actions.get(5));


        List<Area> area1Neighbor = new ArrayList<>();
        List<Area> area2Neighbor = new ArrayList<>();
        List<Area> area3Neighbor = new ArrayList<>();
        List<Area> area4Neighbor = new ArrayList<>();
        List<Area> area5Neighbor = new ArrayList<>();

        Area[] areas =   new Area[5];
        areas[0] = new Area("Vegyi Keri", area1Actions,area1Neighbor);
        areas[1] = new Area("Dugó",area2Actions,area2Neighbor);
        areas[2] = new Area("Margaret Island", area3Actions, area3Neighbor);
        areas[3] = new Area("Gellért Hill", area4Actions, area4Neighbor);
        areas[4] = new Area("Police station", area5Actions, area5Neighbor);
        area1Neighbor.add(areas[1]);
        area2Neighbor.add(areas[0]);
        area2Neighbor.add(areas[2]);
        area3Neighbor.add(areas[0]);
        area3Neighbor.add(areas[1]);
        area3Neighbor.add(areas[3]);
        area4Neighbor.add(areas[2]);
        area5Neighbor.add(areas[0]);

        actions.get(1).addArea(areas[1]);
        actions.get(1).addArea(areas[2]);
        actions.get(2).addArea(areas[2]);
        actions.get(3).addArea(areas[2]);
        actions.get(4).addArea(areas[3]);
        actions.get(5).addArea(areas[3]);
        return areas;
    }

    private static  List<Action> createActions() {
        List<Action> actions = new ArrayList<>();
        actions.add( new Action("You don't smoke anything", "No smoke", new ArrayList<Area>()));
        actions.add(new Action("You smoke herbal", "Smoke herbal", new ArrayList<Area>()));
        actions.add(new Action("You smoke civilian cigarette", "Smoke Civilian Cigarette", new ArrayList<Area>()));
        //actions.add(new Action("You are going to meet with the dugó", "Dugó"));
        actions.add(new Action("You are going to buy herbál from dugó", "Buy herbál", new ArrayList<Area>()));
        actions.add(new Action("You don' buy anything from the dugó", "Buy nothing", new ArrayList<Area>()));
        actions.add(new Action("You drink some kanás wine", "Drink wine", new ArrayList<Area>()));
        //actions.add(new Action("You are going to the Margaret Island", "Margaret Island"));
        //actions.add(new Action("You are going to the Gellért Hill", "Gellért Hill"));
        return actions;
    }

    public static List<Inventory> createInventory() {
        List<Inventory> inventory = new ArrayList<>();
        inventory.add(new Inventory("Canned wine"));
        inventory.add(new Inventory("Radio"));
        inventory.add(new Inventory("Herbal cig"));
        inventory.add(new Inventory("Civilian cig"));
        return inventory;
    }
}
