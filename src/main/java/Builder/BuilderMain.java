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
        
        DroneHiveBuilder droneBuilder = new DroneHiveBuilder();
        director.buildHive(droneBuilder);
        Hive droneHive = (Hive)droneBuilder.GetHive();
        System.out.println(droneHive.toString());
        
        DiggerHiveBuilder diggerBuilder = new DiggerHiveBuilder();
        director.buildHive(diggerBuilder);
        Hive diggerHive = (Hive)diggerBuilder.GetHive();
        System.out.println(diggerHive.toString());
        
        WarriorHiveBuilder warriorBuilder = new WarriorHiveBuilder();
        director.buildHive(warriorBuilder);
        Hive warriorHive = (Hive)warriorBuilder.GetHive();
        System.out.println(warriorHive.toString());
    }
}
