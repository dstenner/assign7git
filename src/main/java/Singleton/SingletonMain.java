package main.java.Singleton;

import main.java.Hive;

/**
 * This is the main function of the Singleton pattern.
 * @author Dakota
 * @version 1.0
 */

public class SingletonMain {

    public static void main(String[] args) {
        Apiary apiary = Apiary.getApiary();
        
        apiary.createHive(5);
        
        System.out.println("Singleton Main");
        System.out.println("///////////////////////////////////////////////////");
        System.out.println("");
        System.out.println("In this apiary, there are " 
                + apiary.getHives() + " hives.");
        
        System.out.println("////////////////////////////////");
        System.out.println("");
    }
}
