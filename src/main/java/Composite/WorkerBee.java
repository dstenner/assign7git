package main.java.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Leaf node for the Bee class. Any operations releating to children
 * will be empty because the worker bee has no children.
 * @author Dakota
 * @version 1.0
 */
public class WorkerBee implements Bee{

    private String name;
    private String species;

    public WorkerBee(String name, String species){
      this.name = name;
      this.species = species;
    }
    public void add(Bee bee) {
      //this is leaf node so this method cannot be implemented by the child.
    }

    public Bee getChild(int i) {
      //this is leaf node so this method cannot be implemented by the child.
      return null;
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
    }

    public void remove(Bee bee) {
      //this is leaf node so this method cannot be implemented by the child.
    }

  }