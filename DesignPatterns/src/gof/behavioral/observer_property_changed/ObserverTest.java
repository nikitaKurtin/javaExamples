package gof.behavioral.observer_property_changed;

import gof.behavioral.observer_property_changed.observable.ObservableNumber;
import gof.behavioral.observer_property_changed.observers.DecimalObserver;
import gof.behavioral.observer_property_changed.observers.PositiveObserver;

public class ObserverTest {
    public static void main(String[] args) {
        ObservableNumber oNumber = new ObservableNumber(10);

        new DecimalObserver(oNumber);
        new PositiveObserver(oNumber);

        oNumber.setNumber(10.3);

        oNumber.setNumber(-180.80008);

    }
}
