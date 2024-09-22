package com.codecool.mightytextadventure.data;

import com.codecool.mightytextadventure.logic.Action;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String name;
    private List<Action> actions;
    private List<Area> neighbourAreas;
    public Area(String description, List<Action> actions, List<Area> neighbourAreas) {
        this.name = description;
        this.actions = actions;
        this.neighbourAreas = neighbourAreas;
    }

    public String getName(){
        return  name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public List<Area> getNeighbourAreas() {
        return neighbourAreas;
    }
}
