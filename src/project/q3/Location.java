package project.q3;

import java.util.*;

public class Location implements Interactive {
    private String name;
    private ArrayList<Character> characterList;

    public Location(String n){
        this.name = n;
        this.characterList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Character> getCharacterList(){
        return characterList;
    }
    public void addPerson(Character c){
        characterList.add(c);
    }
    public void removePerson(Character c){
        characterList.remove(c);
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
