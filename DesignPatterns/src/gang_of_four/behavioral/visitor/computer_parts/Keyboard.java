package gang_of_four.behavioral.visitor.computer_parts;

import gang_of_four.behavioral.visitor.visitor.ComputerVisitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
