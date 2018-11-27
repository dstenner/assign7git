package main.java.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Composite class for the Composite design pattern. The
 * Queen Bee will delegate all common methods to its child (leaf) nodes.
 * QueenBee has methods to access and modify the WorkerBees.
 * @author Dakota
 * @version 1.0
 */

public class QueenBee implements Bee{

 private String name;
 private String species;

 public QueenBee(String name, String species){
  this.name = name;
  this.species = species;
 }
 
 List<Bee> bees = new ArrayList<Bee>();
 public void add(Bee bee) {
    bees.add(bee);
 }

 public Bee getChild(int i) {
  return bees.get(i);
 }

 public String getName() {
  return name;
 }
 
 public String getSpecies() {
  return species;
}

 public void print() {
  System.out.println("Name = "+getName());
  System.out.println("Species = "+getSpecies());
  System.out.println("///////////////////////////////////////////////////");
  System.out.println("");

  Iterator<Bee> beeIterator = bees.iterator();
    while(beeIterator.hasNext()){
     Bee bee = beeIterator.next();
     bee.print();
    }
 }

 public void remove(Bee bee) {
  bees.remove(bee);
 }

}
