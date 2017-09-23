package gang_of_four.behavioral.memento;

class Test {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Originator obj = new Originator();
        obj.setState("first state");
        System.out.println(obj);
        obj.setState("second state");
        careTaker.addMemento(obj.saveMemento());

        obj.setState("third state");
        obj.restore(careTaker.getMemento(0));
        System.out.println(obj);
    }
}
