package gang_of_four.behavioral.memento;

import java.util.ArrayList;

class CareTaker {
    private final ArrayList<Memento> mementos = new ArrayList<>();

    void addMemento(Memento memento) {
        mementos.add(memento);
    }

    Memento getMemento(int index) {
        return mementos.get(index);
    }
}
