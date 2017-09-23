package gang_of_four.behavioral.memento;

class Memento {
    private final String state;

    Memento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}
