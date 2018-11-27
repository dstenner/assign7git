package main.java.Decorator;

import main.java.Species;

public abstract class HiveBase {

    public int health;
    public int defense;
    public int critRate;
    public int critDMG;
    public int speed;
    
    public void Health(int health) {
       this.health = health;
    }
    
    public void Defense(int defense) {
        this.defense = defense;
     }
    
    public void CritRate(int critRate) {
        this.critRate = critRate;
     }
    
    public void CritDMG(int critDMG) {
        this.critDMG = critDMG;
     }
    
    public void Speed(int speed) {
        this.speed = speed;
     }
    
    public int getHealth() {
        return health;
     }
     
     public int getDefense() {
         return defense;
      }
     
     public int getCritRate() {
         return critRate;
      }
     
     public int getCritDMG() {
         return critDMG;
      }
     
     public int getSpeed() {
         return speed;
      }
}
