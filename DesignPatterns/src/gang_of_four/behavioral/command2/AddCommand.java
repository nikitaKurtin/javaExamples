package gang_of_four.behavioral.command2;

public class AddCommand implements MathCommand {

    private NumberReceiver mReceiver;
    private double mOperand;

    AddCommand(NumberReceiver mReceiver, double operand) {
        this.mReceiver = mReceiver;
        this.mOperand = operand;
    }

    @Override
    public void execute() {
        double new_number = mReceiver.getNumber();

        mReceiver.setNumber(new_number + mOperand);
    }

    @Override
    public void undo() {
        mReceiver.setNumber(mReceiver.getNumber() - mOperand);
    }
}
