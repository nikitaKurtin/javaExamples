package gof.behavioral.observer_property_changed.observable;

import gof.behavioral.observer_property_changed.observers.Observer;

import java.util.ArrayList;

public class ObservableNumber implements PropertyChanged {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private double number;

    public ObservableNumber(int number) {
        setNumber(number);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
        notifyPropertyChanged();
    }

    @Override
    public void notifyPropertyChanged() {
        for (Observer o : observers) {
            o.onPropertyChanged();
        }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }
}
