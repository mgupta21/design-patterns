package org.java.designpatterns.visitor.computer;

/**
 * Created by mgupta on 1/23/17.
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
