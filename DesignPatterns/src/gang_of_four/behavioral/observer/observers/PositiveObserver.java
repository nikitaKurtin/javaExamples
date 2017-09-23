package gang_of_four.behavioral.observer.observers;

import gang_of_four.behavioral.observer.observable.ObservableNumber;

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
