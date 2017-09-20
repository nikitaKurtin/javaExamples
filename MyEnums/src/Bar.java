/**
 * Created by Nikita Kurtin on 21/08/2017.
 */
public enum Bar {
    A{
		void doSome(){
			System.out.println("A is doing some");
		}
	}, B{
		void doSome(){
			System.out.println("B is having fun");
		}
	};
	abstract void doSome();
}