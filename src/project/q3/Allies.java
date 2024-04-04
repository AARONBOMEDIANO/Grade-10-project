/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.q3;

import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public abstract class Allies implements Interactive {
private final String name, type, weak, strong;
protected int maxHP, hp, atk;
private static ArrayList<Allies> allyList = new ArrayList<>();

public Allies( String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strong = s;
        weak = w;
        maxHP = m;
        hp = m;
        atk = base;
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
    public void skill(){
            System.out.printf("");
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
