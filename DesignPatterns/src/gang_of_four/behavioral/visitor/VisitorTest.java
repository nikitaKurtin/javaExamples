package gang_of_four.behavioral.visitor;

import gang_of_four.behavioral.visitor.computer_parts.Computer;
import gang_of_four.behavioral.visitor.visitor.DisplayVisitor;

public class VisitorTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.accept(new DisplayVisitor());
    }
}
