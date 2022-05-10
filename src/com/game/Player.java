package com.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
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

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }



    @Override
    public String toString() {
        return "Player " + this.name
                + ", Hit points " + hitPoints
                + ", Strength " + strength
                + ", Weapon " + weapon;
    }



    @Override
    public List<String> write() {
        List<String> items = new ArrayList<>();

        items.add(name);
        items.add("" + hitPoints);
        items.add("" + strength);
        items.add(weapon);

        return items;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
            weapon = savedValues.get(3);
        }
    }


    @Override
    public List<String> enterValues() {
        List<String> values = new ArrayList<>();
        System.out.print("Enter player name: ");
        values.add(scanner.nextLine());
        System.out.print("Enter player hit points: ");

        while(!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        values.add("" + scanner.nextLine());

        System.out.print("Enter player strength level: ");

        while(!scanner.hasNextInt()) {
            scanner.nextLine();
        }

        values.add("" + scanner.nextLine());

        System.out.print("Enter player weapon: ");
        values.add(scanner.nextLine());


        return values;
    }

}
