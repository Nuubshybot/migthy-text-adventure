package com.codecool.mightytextadventure.data;

import java.util.List;

public class Player {
    private String name;
    private List<Inventory> inventory;
    private Area location;

    public Player(List<Inventory> inventory, Area location) {

            this.inventory = inventory;
            this.location = location;
    }
    public String getName() {
        return name;
    }
    public List<Inventory> getInventory() {
        return inventory;
    }
    public Area getLocation() {
        return location;
    }
    public void setLocation(Area location) {
        this.location = location;
    }

    public void addInventory(Inventory inventory) {
        this.inventory.add(inventory);
    }

    public void removeInventory(Inventory inventory) {
        this.inventory.remove(inventory);
    }

    public void setName(String name) {
        this.name = name;
    }
}
