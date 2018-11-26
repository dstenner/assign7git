package main.java.Builder;

import main.java.Hive;

/**
 * This is the abstract builder class in which all other builders inherit from
 * @author Dakota
 * @version 1.0
 *
 */

public abstract class HiveBuilder {

    public abstract void AddRooms();
    public abstract void AddBees();
    public abstract void AddQueen();
    
    public abstract Hive GetHive();
}
