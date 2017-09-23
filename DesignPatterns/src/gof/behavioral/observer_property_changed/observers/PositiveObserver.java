package gof.behavioral.observer_property_changed.observers;

import gof.behavioral.observer_property_changed.observable.ObservableNumber;

public class PositiveObserver extends NumberObserver {

    public PositiveObserver(ObservableNumber subject) {
        super(subject);
    }

    @Override
    public void onPropertyChanged() {
        if (subject.getNumber() > 0)
            System.out.println("Number is now positive");
    }

}
