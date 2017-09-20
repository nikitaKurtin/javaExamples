package myBads;

public class LengthException extends StringException {
    public LengthException(){
        this("Some length exception");
    }
    public LengthException(String msg){
        super(msg);
    }
}
