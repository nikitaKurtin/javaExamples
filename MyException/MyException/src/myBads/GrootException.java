package myBads;

public class GrootException extends RuntimeException {//Unchecked exception
    public GrootException(){
        this("I am groot - exception");
    }
    public GrootException(String msg){
        super(msg);//pass message to super class
    }
}
