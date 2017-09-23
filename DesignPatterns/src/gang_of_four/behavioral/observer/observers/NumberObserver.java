package gang_of_four.behavioral.observer.observers;

import gang_of_four.behavioral.observer.observable.ObservableNumber;
import gang_of_four.behavioral.observer.observable.PropertyChanged;

abstract class NumberObserver implements Observer {
    ObservableNumber subject;

    NumberObserver(PropertyChanged subject) {
        this.subject = (ObservableNumber) subject;
        subject.attach(this);
    }

}
