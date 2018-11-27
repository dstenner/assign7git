package main.java.Decorator;

import main.java.Hive;

/**
 * The warrior bee has attributes that make it combat-ready.
 * @author Dakota
 * @version 1.0
 */

public class WarriorBase extends HiveBase {
    private Hive _hive = new Hive();
    
    @Override
    public void Health(int health) {
        health = 100;
     }
     
    @Override
    public void Defense(int defense) {
        defense = 75;
     }
    
    @Override
    public void CritRate(int critRate) {
        critRate = 15;
     }
    
    @Override
    public void CritDMG(int critDMG) {
        critDMG = 50;
     }
    
    @Override
    public void Speed(int speed) {
        speed = 95;
     }
}
