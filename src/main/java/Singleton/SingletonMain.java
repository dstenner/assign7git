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
        
        apiary.createHive(new Hive());
        
        System.out.println("In this apiary, there are hives located at " 
                + apiary.getHives());
    }
}
