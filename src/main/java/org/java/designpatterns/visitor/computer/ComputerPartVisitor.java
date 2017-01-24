package org.java.designpatterns.visitor.computer;

/**
 * Created by mgupta on 1/23/17.
 */
// Interface for different visitors to implement
public interface ComputerPartVisitor {

    // Overloaded visit for each element object
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
