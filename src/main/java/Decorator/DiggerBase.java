package main.java.Decorator;

import main.java.Hive;

/**
 * The digger bee has attributes that make it 
 * well-rounded in all attributes. 
 * @author Dakota
 * @version 1.0
 */

public class DiggerBase extends HiveBase {
    private Hive _hive = new Hive();
    
    @Override
    public void Health(int health) {
        health = 120;
     }
     
    @Override
    public void Defense(int defense) {
        defense = 25;
     }
    
    @Override
    public void CritRate(int critRate) {
        critRate = 5;
     }
    
    @Override
    public void CritDMG(int critDMG) {
        critDMG = 30;
     }
    
    @Override
    public void Speed(int speed) {
        speed = 110;
     }
}
