package main.java.Decorator;

/**
 * Main class for the Decorator pattern.
 * @author Dakota
 * @version 1.0
 */

public class DecoratorMain {

    
    public static void main(String[] args) {
        
        System.out.println("Decorator Main");
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
        
        WarriorBase warrior = new WarriorBase();
        System.out.println("Warrior \n///////////////////////////////////////////////////" +
                 "\nHealth:" + warrior.getHealth() +
                 "\nDefense:" + warrior.getDefense() +
                 "\nCrit Rate:" + warrior.getCritRate() +
                 "\nCrit Damage:" + warrior.getCritDMG() +
                 "\nSpeed:" + warrior.getSpeed());
        
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
        
        DroneBase drone = new DroneBase();
        System.out.println("Drone \n///////////////////////////////////////////////////" +
                 "\nHealth:" + drone.getHealth() +
                 "\nDefense:" + drone.getDefense() +
                 "\nCrit Rate:" + drone.getCritRate() +
                 "\nCrit Damage:" + drone.getCritDMG() +
                 "\nSpeed:" + drone.getSpeed());
        
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
        
        DiggerBase digger = new DiggerBase();
        System.out.println("Digger \n///////////////////////////////////////////////////" +
                 "\nHealth:" + digger.getHealth() +
                 "\nDefense:" + digger.getDefense() +
                 "\nCrit Rate:" + digger.getCritRate() +
                 "\nCrit Damage:" + digger.getCritDMG() +
                 "\nSpeed:" + digger.getSpeed());
        
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");      
    }
}
