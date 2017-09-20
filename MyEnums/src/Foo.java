/**
 * Created by Nikita Kurtin on 21/08/2017.
 */
public enum Foo {
    A(10), B;
    private int x;
    //enum constructor - can only be private
    private Foo(){
        this(0);
    }
    private Foo(int x){
        this.x = x;
    }
}
