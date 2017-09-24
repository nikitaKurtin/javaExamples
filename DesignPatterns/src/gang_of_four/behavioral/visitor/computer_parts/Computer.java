package gang_of_four.behavioral.visitor.computer_parts;

import gang_of_four.behavioral.visitor.visitor.ComputerVisitor;

public class Computer implements ComputerPart {

    private ComputerPart[] parts = {new Keyboard(), new Monitor(), new Mouse()};

    @Override
    public void accept(ComputerVisitor visitor) {
        for (ComputerPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
