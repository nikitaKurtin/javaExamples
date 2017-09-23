package gang_of_four.behavioral.observer;

import gang_of_four.behavioral.observer.observable.ObservableNumber;
import gang_of_four.behavioral.observer.observers.DecimalObserver;
import gang_of_four.behavioral.observer.observers.PositiveObserver;

public class ObserverTest {
    public static void main(String[] args) {
        ObservableNumber oNumber = new ObservableNumber(10);

        new DecimalObserver(oNumber);
        new PositiveObserver(oNumber);

        oNumber.setNumber(10.3);

        oNumber.setNumber(-180.80008);

    }
}
