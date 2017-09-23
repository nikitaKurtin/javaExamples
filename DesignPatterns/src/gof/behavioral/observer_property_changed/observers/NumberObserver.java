package gof.behavioral.observer_property_changed.observers;

import gof.behavioral.observer_property_changed.observable.ObservableNumber;
import gof.behavioral.observer_property_changed.observable.PropertyChanged;

abstract class NumberObserver implements Observer {
    ObservableNumber subject;

    NumberObserver(PropertyChanged subject) {
        this.subject = (ObservableNumber) subject;
        subject.attach(this);
    }

}
