package main.java.Composite;

/**
 * Component interface for the bee classes. It contains all
 * common operations that will be applicable to both
 * the QueenBee class and the WorkerBee.
 * @author Dakota
 * @version 1.0
 */

public interface Bee {

    public void add(Bee bee);
    public void remove(Bee bee);
    public Bee getChild(int i);
    public String getName();
    public String getSpecies();
    public void print();
 }
