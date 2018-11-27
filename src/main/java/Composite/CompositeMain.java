package main.java.Composite;

/**
 * Main class for the Composite pattern.
 * @author Dakota
 * @version 1.0
 */

public class CompositeMain {

    public static void main(String[] args) {
        
     System.out.println("Composite Main");
     System.out.println("///////////////////////////////////////////////////");
     System.out.println("");
        
     Bee queen1 = new QueenBee("QueenB", "Drone");
     Bee queen2 = new QueenBee("Queen", "Warrior");
     Bee worker1 =new WorkerBee("Worker1", "Drone");
     Bee worker2 =new WorkerBee("Worker2", "Drone");
     queen1.add(worker1);
     queen1.add(worker2);
     Bee queen3 = new QueenBee("Elaine", "Digger");
     Bee queenmain = new QueenBee("QueenBee", "Warrior");
     queenmain.add(queen3);
     queenmain.add(queen1);
     queenmain.print();
    }
   }

