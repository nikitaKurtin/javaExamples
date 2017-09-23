package gof.behavioral.command2;

import java.util.Stack;

class Invoker {
    private final Stack<MathCommand> history = new Stack<>();

    void callMathCommand(MathCommand cmd) {
        history.push(cmd)
                .execute();
    }

    void undoOperation() {
        if (!history.isEmpty()) {
            history.pop()
                    .undo();
        } else {
            System.out.println("No History");
        }
    }
}
