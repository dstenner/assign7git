package main.java.Decorator;

import main.java.Hive;

/**
 * The drone bee has attributes that allow it to move very quickly.
 * @author Dakota
 * @version 1.0
 */


public class DroneBase extends HiveBase {
    private Hive _hive = new Hive();
    
    @Override
    public void Health(int health) {
        health = 115;
     }
     
    @Override
    public void Defense(int defense) {
        defense = 50;
     }
    
    @Override
    public void CritRate(int critRate) {
        critRate = 10;
     }
    
    @Override
    public void CritDMG(int critDMG) {
        critDMG = 50;
     }
    
    @Override
    public void Speed(int speed) {
        speed = 120;
     }
}
