package gang_of_four.behavioral.chain_of_responsibility;

public abstract class PurchasePower {
    static final double BASE = 500;
    private PurchasePower successor;

    abstract protected double getAllowable();

    abstract protected String getRole();

    void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    void processRequest(PurchaseRequest request) {
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount() + " for: " + request.getPurpose());
        } else if (successor != null) {
            System.out.println(this.getRole() + " can't approve purchase, will pass to " + successor.getRole());
            successor.processRequest(request);
        } else {
            System.out.println("purchase can't be approved");
        }
    }
}
