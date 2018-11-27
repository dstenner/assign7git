package main.java.Builder;

import main.java.Hive;
import main.java.Builder.Drone;

/**
 * The drone bee is responsible for scavenging 
 * for honey and resources.
 * @author Dakota
 * @version 1.0
 */

public class DroneHiveBuilder extends HiveBuilder {
    private Hive _hive = new Hive();
    
    @Override
    public void AddRooms() {
        _hive.AddRooms(5);
    }
    
    @Override
    public void AddBees() {
        Hive _drone = new Drone();
        _hive.AddBees(50, _drone);
    }
    
    @Override
    public void AddQueen() {
        _hive.AddQueen(new Drone());
    }

    @Override
    public Hive GetHive() {
        return _hive;
    }
}
