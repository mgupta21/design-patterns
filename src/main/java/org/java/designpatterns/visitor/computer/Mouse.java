package org.java.designpatterns.visitor.computer;

/**
 * Created by mgupta on 1/23/17.
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
