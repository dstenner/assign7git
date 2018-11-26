package main.java.Singleton;

import java.util.ArrayList;
import main.java.Hive;

/**
 * The apiary is of type Singleton. In an apiary, there is
 * are beehives which contain rooms that can spawn bees.
 * @author Dakota
 * @version 1.0
 */

public class Apiary {

    private static Apiary _instance;
    private ArrayList<Hive> hives;
    
    private Apiary() {
        hives = new ArrayList<Hive>();
    }
    
    public static Apiary getApiary() {
        if (_instance == null) {
            _instance = new Apiary();
        }
        return _instance;
    }
    
    public void createHive(Hive add) {
        hives.add(add);
    }
    
    public ArrayList<Hive> getHives() {
        return hives;
    }
}
