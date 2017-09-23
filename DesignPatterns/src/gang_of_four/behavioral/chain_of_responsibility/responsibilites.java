package gang_of_four.behavioral.chain_of_responsibility;

class Manager extends PurchasePower {

    protected double getAllowable() {
        return BASE * 10;
    }

    protected String getRole() {
        return "Manager";
    }
}

class Director extends PurchasePower {

    protected double getAllowable() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }
}

class VicePresident extends PurchasePower {

    protected double getAllowable() {
        return BASE * 40;
    }

    protected String getRole() {
        return "Vice President";
    }
}

class President extends PurchasePower {

    protected double getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}
