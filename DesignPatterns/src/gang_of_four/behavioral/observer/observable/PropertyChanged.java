package gang_of_four.behavioral.observer.observable;

import gang_of_four.behavioral.observer.observers.Observer;

public interface PropertyChanged {
    void notifyPropertyChanged();

    void attach(Observer observer);
}
