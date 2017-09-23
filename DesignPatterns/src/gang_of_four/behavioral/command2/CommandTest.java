package gang_of_four.behavioral.command2;

public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        NumberReceiver number = new NumberReceiver();
        MathCommand add10 = new AddCommand(number, 10);
        MathCommand divide2 = new DivideCommand(number, 2);

        NumberReceiver otherNum = new NumberReceiver(50);
        MathCommand divide16 = new DivideCommand(otherNum, 16);

        System.out.println(number);

        //Calling commands
        invoker.callMathCommand(add10);
        System.out.println(number);

        invoker.callMathCommand(divide2);
        System.out.println(number);

        invoker.callMathCommand(add10);
        System.out.println(number);

        //Undoing operations
        invoker.undoOperation();
        System.out.println(number);

        invoker.undoOperation();
        System.out.println(number);

        //with another receiver
        System.out.println(otherNum);
        invoker.callMathCommand(divide16);
        System.out.println(otherNum);

        invoker.undoOperation();
        System.out.println(number);

        invoker.undoOperation();
        System.out.println(number);

    }
}
