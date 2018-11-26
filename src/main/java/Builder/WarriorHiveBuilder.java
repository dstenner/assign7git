package main.java.Builder;

import main.java.Hive;
import main.java.Builder.Warrior;

/**
 * The warrior bee is responsible for protecting the hive from
 * enemy hives.
 * @author Dakota
 * @version 1.0
 */

public class WarriorHiveBuilder extends HiveBuilder {
    private Hive _hive = new Hive();
    
    @Override
    public void AddRooms() {
        _hive.AddRooms(5, 10);
    }
    
    @Override
    public void AddBees() {
        Hive _warrior = new Warrior();
        _hive.AddBees(50, _warrior);
    }
    
    @Override
    public void AddQueen() {
        _hive.AddQueen(new Warrior());
    }

    @Override
    public Hive GetHive() {
        return _hive;
    }
}
