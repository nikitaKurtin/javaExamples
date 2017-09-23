package gof.behavioral.observer_property_changed.observable;

import gof.behavioral.observer_property_changed.observers.Observer;

public interface PropertyChanged {
    void notifyPropertyChanged();

    void attach(Observer observer);
}
