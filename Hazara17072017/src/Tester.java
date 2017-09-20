import zoo2.*;

/**
 * Created by hackeru on 17/07/2017.
 */
public class Tester {
    public static void main(String[] args) {

        Cat mizi = new Cat();
        Cow burenka = new Cow();
        mizi.drink(burenka.giveMilk());
        mizi.drink("Water");
        mizi.drink("Beer");
        Mouse jerry = new Mouse();
        mizi.eat(jerry);

        Lion simba = new Lion();
        simba.eat(burenka);
        mizi.drink(burenka.giveMilk());

        Dog shuki = new Dog();
        shuki.bark();

        simba.die();

        simba.eat(burenka);

    }
}
