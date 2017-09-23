package gof.behavioral.observer.observers;

import gof.behavioral.observer.observable.ObservableNumber;

public class DecimalObserver extends NumberObserver {
    public DecimalObserver(ObservableNumber subject) {
        super(subject);
    }

    @Override
    public void onPropertyChanged() {
        System.out.printf("Showing value after decimal point %.2f\n", subject.getNumber() % 1);
    }
}
