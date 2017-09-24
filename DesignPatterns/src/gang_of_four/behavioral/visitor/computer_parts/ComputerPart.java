package gang_of_four.behavioral.visitor.computer_parts;

import gang_of_four.behavioral.visitor.visitor.ComputerVisitor;

public interface ComputerPart {
    void accept(ComputerVisitor visitor);
}
