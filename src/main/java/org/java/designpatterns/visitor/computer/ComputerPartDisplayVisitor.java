package org.java.designpatterns.visitor.computer;

import org.apache.log4j.Logger;

/**
 * Created by mgupta on 1/23/17.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    private static final Logger LOGGER = Logger.getLogger(ComputerPartDisplayVisitor.class);

    @Override
    public void visit(Computer computer) {
        LOGGER.info("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        LOGGER.info("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        LOGGER.info("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        LOGGER.info("Displaying Monitor.");

    }
}
