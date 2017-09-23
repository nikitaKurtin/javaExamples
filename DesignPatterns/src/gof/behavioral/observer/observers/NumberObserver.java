package gof.behavioral.observer.observers;

import gof.behavioral.observer.observable.ObservableNumber;
import gof.behavioral.observer.observable.PropertyChanged;

abstract class NumberObserver implements Observer {
    ObservableNumber subject;

    NumberObserver(PropertyChanged subject) {
        this.subject = (ObservableNumber) subject;
        subject.attach(this);
    }

}
