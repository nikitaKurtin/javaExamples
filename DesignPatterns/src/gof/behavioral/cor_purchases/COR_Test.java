package gof.behavioral.cor_purchases;

public class COR_Test {
    public static void main(String[] args) {
        //create requests
        PurchaseRequest request1 = new PurchaseRequest(100, "Bug product");
        PurchaseRequest request2 = new PurchaseRequest(1000, "Bug Share");
        PurchaseRequest request3 = new PurchaseRequest(10000, "Bug Department");
        PurchaseRequest request4 = new PurchaseRequest(25000, "Bug Company");
        PurchaseRequest request5 = new PurchaseRequest(100000, "Bug World");

        //create responsibilities
        Director director = new Director();
        Manager manager = new Manager();
        VicePresident vicePresident = new VicePresident();
        President president = new President();

        //set topping_chain
        director.setSuccessor(manager);
        manager.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);

        //handle request (from head of topping_chain)
        director.processRequest(request1);
        director.processRequest(request2);
        director.processRequest(request3);
        director.processRequest(request4);
        director.processRequest(request5);
    }
}
