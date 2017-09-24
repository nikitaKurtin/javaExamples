package gang_of_four.behavioral.visitor.visitor;

import gang_of_four.behavioral.visitor.computer_parts.Computer;
import gang_of_four.behavioral.visitor.computer_parts.Keyboard;
import gang_of_four.behavioral.visitor.computer_parts.Monitor;
import gang_of_four.behavioral.visitor.computer_parts.Mouse;

public class DisplayVisitor implements ComputerVisitor {
    @Override
    public void visit(Mouse part) {
        System.out.println("Displaying mouse");
    }

    @Override
    public void visit(Keyboard part) {
        System.out.println("Displaying keyboard");
    }

    @Override
    public void visit(Monitor part) {
        System.out.println("Displaying monitor");
    }

    @Override
    public void visit(Computer part) {
        System.out.println("Displaying Computer");
    }
}
