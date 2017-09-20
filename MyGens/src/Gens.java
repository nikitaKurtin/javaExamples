
public class Gens {
    //generic method - accepts Generic type <Temp> and returns it to caller
    <Temp> Temp some(Temp s){
        return s;
    }
    //generic method - accepts Generic type <Temp> and prints it's String representation
    <Temp> void printIt(Temp it){
        System.out.println("generic: "+it.toString());
    }
}
