package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private Scanner scanner = new Scanner(System.in);

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> items = new ArrayList<>();

        items.add(name);
        items.add("" + hitPoints);
        items.add("" + strength);

        return items;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public void saveObject(ISaveable objectToSave) {

    }

    @Override
    public List<String> enterValues() {
        List<String> values = new ArrayList<>();
        System.out.print("Enter monster name: ");
        values.add(scanner.nextLine());
        System.out.print("Enter monster hit points: ");

        while(!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        values.add("" + scanner.nextLine());

        System.out.print("Enter monster strength level: ");

        while(!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        values.add("" + scanner.nextLine());

        return values;
    }

    @Override
    public String toString() {
        return "com.game.Monster " + this.name
                + ", Hit points " + hitPoints
                + ", Strength " + strength;
    }
}
