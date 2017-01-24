package org.java.designpatterns.decorator.graphics;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mgupta on 8/7/16.
 */
public class TextField implements GraphicalComponent {

    private List<String> lines = new LinkedList<String>();

    @Override
    public void paint() {
        System.out.println("# Start TextField.....");
        lines.forEach(l -> System.out.println(l));
        System.out.println("# End TextField....");
    }

    @Override
    public GraphicalComponent addContent(Object content) {
        assert (content instanceof String);
        this.lines.add((String) content);
        if (this.lines.size() > 2) {
            return new ScrollBarDecorator(this);
        }
        return this;
    }
}
