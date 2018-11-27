package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Singleton.Apiary;
import main.java.Hive;
import main.java.Species;
import main.java.Builder.Drone;
import main.java.Builder.Digger;
import main.java.Builder.Warrior;
import main.java.Composite.Bee;
import main.java.Composite.QueenBee;
import main.java.Composite.WorkerBee;
import main.java.Decorator.DroneBase;
import main.java.Decorator.DiggerBase;
import main.java.Decorator.WarriorBase;



public class BeeTest {
    
    @Test
    public void testSingleton() {
        Apiary singletontest1 = null;
        
        // test if apiary is empty
        assertNull(singletontest1);
        
        singletontest1 = Apiary.getApiary();
        
        //test if apiary is not empty after creating an instance
        assertTrue(singletontest1 != null);
        
        Apiary singletontest2 = Apiary.getApiary();
        
        // test if both apiaries are equivalent of each other.
        assertEquals(singletontest1, singletontest2);
    }
    
    @Test
    public void testBuilder() {
        Hive dronetest = new Hive();
        
        dronetest.AddBees(5, new Drone());
        
        // test if hive is created with proper number of bees and species
        assertEquals(5, dronetest.getHive());
        assertEquals(Species.DRONE, dronetest.getSpecies());
        
        Hive diggertest = new Hive();
        
        diggertest.AddBees(10, new Digger());
        
        // test if hive is created with proper number of bees and species
        assertEquals(10, diggertest.getHive());
        assertEquals(Species.DIGGER, diggertest.getSpecies());
        
        Hive warriortest = new Hive();
        
        warriortest.AddBees(15, new Warrior());
        
        // test if hive is created with proper number of bees and species
        assertEquals(15, warriortest.getHive());
        assertEquals(Species.WARRIOR, warriortest.getSpecies());
    }
    
    @Test
    public void testComposite() {
        Bee queentest = new QueenBee("Test queen", "Drone");
        Bee workertest =new WorkerBee("Test worker", "Warrior");
        
        // test if queen is created with proper name and species
        assertTrue(queentest.getName() == "Test queen");
        assertTrue(queentest.getSpecies() == "Drone");
        
        // test if worker is created with proper name and species
        assertTrue(workertest.getName() == "Test worker");
        assertTrue(workertest.getSpecies() == "Warrior");
    }
    
    
    @Test
    public void testDecorator() {
        DroneBase dronetest1 = new DroneBase();
        int healthtest = dronetest1.getHealth();
        
        // Test if drone is created with proper health
        assertEquals(0, healthtest);
        
        DiggerBase diggertest1 = new DiggerBase();
        int defensetest = dronetest1.getDefense();
        
        // Test if digger is created with proper defense
        assertEquals(0, defensetest);
        
        DroneBase dronetest2 = new DroneBase();
        int critRatetest = dronetest2.getCritRate();
        
        // Test if drone is created with proper critical rate
        assertEquals(0, critRatetest);
        
        DiggerBase diggertest2 = new DiggerBase();
        int critDMGtest = dronetest2.getCritDMG();
        
        // Test if digger is created with proper critical damage
        assertEquals(0, critDMGtest);
        
        WarriorBase warriortest = new WarriorBase();
        int speedtest = warriortest.getSpeed();
        
        // Test if warrior is created with proper speed
        assertEquals(0, speedtest);
    }
}