package gang_of_four.behavioral.chain_of_responsibility;

class PurchaseRequest {
    private double amount;
    private String purpose;

    PurchaseRequest(double amount, String purpose) {
        setAmount(amount);
        setPurpose(purpose);
    }

    double getAmount() {
        return this.amount;
    }

    void setAmount(double amount) {
        this.amount = amount;
    }

    String getPurpose() {
        return this.purpose;
    }

    void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
