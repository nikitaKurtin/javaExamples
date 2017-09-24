package gang_of_four.behavioral.visitor.visitor;

import gang_of_four.behavioral.visitor.computer_parts.Computer;
import gang_of_four.behavioral.visitor.computer_parts.Keyboard;
import gang_of_four.behavioral.visitor.computer_parts.Monitor;
import gang_of_four.behavioral.visitor.computer_parts.Mouse;

public interface ComputerVisitor {
    void visit(Mouse part);

    void visit(Keyboard part);

    void visit(Monitor part);

    void visit(Computer part);
}
