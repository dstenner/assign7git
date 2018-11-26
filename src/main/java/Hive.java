package main.java;

import java.util.ArrayList;


/**
 * A hive is a buildup of connected rooms in which bees
 * are spawned and complete jobs associated with their
 * species type. Each bee has specific roles and attributes
 * unique to their species type.
 * @author Dakota
 * @version 1.0
 * 
 */
public class Hive {

    private ArrayList<Hive> hive;
    private ArrayList<Room> room;
    private Species species;
    private Hive queen;  

    /**
     * Create a new Hive object
     */
    public Hive() {
        hive = new ArrayList<Hive>();
        room = new ArrayList<Room>();
        species = null;
    }
    
    public Hive(Species species) {
        this.species = species;
    }

    public void AddBees(int amount, Hive species) throws UnsupportedOperationException {
        Hive temp;
        Species speciesType = species.getSpecies();
        
    }
    
    public void AddRooms(int amount, int ticks) {
        for (int i = 0; i < amount; i++) {
            room.add(new Room(ticks));
        }
    }
    
    public void AddQueen(Hive queen) {
        this.queen = queen;
    }
    
    public ArrayList<Hive> getHive() {
        return hive;
    }
    
    public ArrayList<Room> getRoom() {
        return room;
    }
    
    public Species getSpecies() {
        return species;
    }

    private class Room {
        private int buildTime;
    
        private Room(int ticks) {
            buildTime = ticks;
        }
    }
}