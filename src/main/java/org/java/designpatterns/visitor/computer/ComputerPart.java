package org.java.designpatterns.visitor.computer;

/**
 * Created by mgupta on 1/23/17.
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
