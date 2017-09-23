package gof.behavioral.observer;

import gof.behavioral.observer.observable.ObservableNumber;
import gof.behavioral.observer.observers.DecimalObserver;
import gof.behavioral.observer.observers.PositiveObserver;

public class ObserverTest {
    public static void main(String[] args) {
        ObservableNumber oNumber = new ObservableNumber(10);

        new DecimalObserver(oNumber);
        new PositiveObserver(oNumber);

        oNumber.setNumber(10.3);

        oNumber.setNumber(-180.80008);

    }
}
