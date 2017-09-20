public class Tester {
    public static void main(String [] args){
        /*
        //Example 1
        Monitor m1 = new Monitor();//create new instance of class Monitor
        Monitor m2 = new Monitor();
        System.out.println(m1==m2);//different instances -> false
        /*
        Car c1=new Car();
        Car c2=new Car();
        //Example 2
        c1.year=2010;
        c1.classChar='A';
        c1.isAuto=true;
        System.out.println("C1 is a Car made in "+c1.year);
        Car [] cars={c1,new Car(),new Car()};
        for(Car c : cars) System.out.println("Car of "+c.year);
        /*/
        Citizen cz1 = new Citizen(9);
        cz1.name="Trump";
        Citizen cz2 = new Citizen(5);
        cz2.name="Clinton";
        System.out.println(cz1.id);
        System.out.println(cz2.id);
        //*
        //Behavior:
        Phone p1 = new Phone(cz1);
        Phone p2 = new Phone(cz2);
        p1.makeCall(p2);//Trump use his phone to call Clinton


        //*/
    }
}