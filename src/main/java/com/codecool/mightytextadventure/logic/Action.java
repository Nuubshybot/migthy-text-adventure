package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Area;

import java.util.List;

public class Action {

    private String description;
    private String name;
    private List<Area> area;

    public Action(String description, String name, List<Area> area) {
        this.description = description;
        this.name = name;
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public List<Area> getArea() {
        return area;
    }

    public void addArea(Area area) {
        this.area.add(area);
    }
}
