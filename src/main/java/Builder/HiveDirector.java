package main.java.Builder;

/**
 * The HiveDirector controls the construction of
 * the builder Design pattern that only needs to 
 * knows the type of object it is to create
 * @author Dakota
 *  @version 1.0
 *
 */

public class HiveDirector {

    /**
     * Tells the hive to build
     * @param builder will be building the hive
     */
    
    public void buildHive(HiveBuilder builder) {
        builder.AddRooms();
        builder.AddBees();
        builder.AddQueen();
    }
}
