package main.java;

import main.java.Singleton.SingletonMain;
import main.java.Builder.BuilderMain;

/**
 * This is the main application of the Design Patterns Assignment.
 * @author Dakota
 * @version 1.0
 */

public class Main {

    /**
     * Main method runs all the deisgn patterns
     * @param args parameters for executing functions
     */
    
    public static void main(String[] args) {
        SingletonMain.main(args);
        BuilderMain.main(args);
    }
}
