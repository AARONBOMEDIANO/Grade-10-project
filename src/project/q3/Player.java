/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.q3;

/**
 *
 * @author Aaron
 */
public class Player implements Interactive {
private final String name, type;
protected int maxHP, hp, atk;
public Location currentLocation;



public Player( String n, String t, int m, int base){
        name = n;
        type = t;
        maxHP = m;
        hp = m;
        atk = base;
        currentLocation = null;
    }
    public Player(String n, String t, int m, int base, Location l){
        name = n;
        type = t;
        maxHP = m;
        hp = m;
        atk = base;
        this.currentLocation = l;
    }
    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public int getAtk() {
        return atk;
    }
    public String getType() {
        return type;
    }
    public void attack(){
            System.out.printf("");
    }
    public void command(){
            System.out.printf("");
    }
    public void receiveAid(){
            System.out.printf("");
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public void travel(Location destination){
    Character i = null; //WIP
        currentLocation.removePerson(i);
        destination.addPerson(i);
        currentLocation = destination;
        System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
    }
@Override
    public void interact(){
            System.out.printf("");
    }
@Override
    public void analyze(){
            System.out.printf("");
    }
}
