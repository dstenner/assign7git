package main.java.Builder;

import main.java.Hive;
import main.java.Builder.Digger;

/**
 * The digger bee is responsible for digging new rooms 
 * into the hives.
 * @author Dakota
 * @version 1.0
 */

public class DiggerHiveBuilder extends HiveBuilder {
    private Hive _hive = new Hive();
    
    @Override
    public void AddRooms() {
        _hive.AddRooms(5);
    }
    
    @Override
    public void AddBees() {
        Hive _digger = new Digger();
        _hive.AddBees(50, _digger);
    }
    
    @Override
    public void AddQueen() {
        _hive.AddQueen(new Digger());
    }

    @Override
    public Hive GetHive() {
        return _hive;
    }
}
