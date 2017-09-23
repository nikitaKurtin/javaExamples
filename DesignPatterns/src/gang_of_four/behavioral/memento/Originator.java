package gang_of_four.behavioral.memento;

class Originator {
    private String state;

    void setState(String state) {
        this.state = state;
        System.out.println("setting state to: " + state);
    }

    Memento saveMemento() {
        System.out.println("Saving memento");
        return new Memento(state);
    }

    void restore(Memento memento) {
        state = memento.getState();
        System.out.println("Restoring from Memento: " + state);
    }

    @Override
    public String toString() {
        return state;
    }
}
