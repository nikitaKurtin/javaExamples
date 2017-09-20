
public class Tester {
    public static void main(String [] args){
        Gens g = new Gens();
        //*
        Cat c = new Cat();
        Phone p = new Phone();
        Cat c2 = g.some(c);
        Phone p2 = g.some(p);
        System.out.println(g.some(c2) instanceof Cat);
        /*/
        g.printIt("Katya");
        g.printIt(9);
        g.printIt(new Cat());
        //*/
    }
}

