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

    private int hive;
    private int room;
    private Species species;
    private Hive queen;  

    /**
     * Create a new Hive object
     */
    public Hive() {
        hive = 0;
        room = 0;
        species = null;
    }
    
    public Hive(Species species) {
        this.species = species;
    }

    public void AddBees(int amount, Hive species) throws UnsupportedOperationException {
        Hive temp;
        Species speciesType = species.getSpecies();
        
    }
    
    public void AddRooms(int amount) {
        room += room + amount;           
        }
    
    public void AddQueen(Hive queen) {
        this.queen = queen;
    }
    
    public int getHive() {
        return hive;
    }
    
    public int getRoom() {
        return room;
    }
    
    public Species getSpecies() {
        return species;
    }
}