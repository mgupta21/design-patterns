package org.java.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mgupta on 1/6/17.
 */
public class Observable {

    private Set<Observer> observers;

    public Observable() {
        this.observers = new HashSet<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    protected void notifyDependents() {
        observers.forEach(o -> o.update(this));
    }

}
