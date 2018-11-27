package main.java.Builder;

import main.java.Hive;

/**
 * The main class of the Builder pattern.
 * @author Dakota
 * @version 1.0
 */
public class BuilderMain {
    
    public static void main(String[] args) {
        HiveDirector director = new HiveDirector();
        
        System.out.println("Builder Main");
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
        
        DroneHiveBuilder droneBuilder = new DroneHiveBuilder();
        director.buildHive(droneBuilder);
        Hive droneHive = (Hive)droneBuilder.GetHive();
        System.out.println("Created drone builder.");
        
        DiggerHiveBuilder diggerBuilder = new DiggerHiveBuilder();
        director.buildHive(diggerBuilder);
        Hive diggerHive = (Hive)diggerBuilder.GetHive();
        System.out.println("Created digger builder.");
        
        WarriorHiveBuilder warriorBuilder = new WarriorHiveBuilder();
        director.buildHive(warriorBuilder);
        Hive warriorHive = (Hive)warriorBuilder.GetHive();
        System.out.println("Created warrior builder.");
        
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
    }
}
