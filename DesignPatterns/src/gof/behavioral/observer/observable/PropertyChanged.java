package gof.behavioral.observer.observable;

import gof.behavioral.observer.observers.Observer;

public interface PropertyChanged {
    void notifyPropertyChanged();

    void attach(Observer observer);
}
