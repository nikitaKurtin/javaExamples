import myBads.BubuException;
import myBads.GrootException;

public class Tester {
    public static void main(String [] args){
        /*
        //Example 1
        int x=0,y=0;
        try{
            y=10/x;//UnChecked Exception
        }catch(ArithmeticException e){
            System.out.println("Your is - 0 which is bad...");
        }
        /*
        //Example 2
        //try-finally
        try{
            throw new RuntimeException();
        }finally {//do in any case (Success OR Failure)
            //cleanups
            //close opened resources
        }
        /*
        //try-catch
        try{//Success handling
            throw new RuntimeException();
        }catch (RuntimeException e){//Failure handling
            //handle RuntimeException
        }
        /*
        //try-catch-finally
        try{//Success handling

        }catch (RuntimeException e){//Failure handling

        }finally {//always handling - cleanups

        }
        /*
        //Multiple catch
        try{

        }catch (RuntimeException e){

        }catch (Exception e){

        }
        /*/



        try {
            if(true){
                throw new GrootException("Groot is awesome");
            }else{
                throw new BubuException();
            }
        }catch(GrootException e){
            System.out.println("Groot exception - catched");
            System.out.println(e.getMessage());
        } catch (BubuException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("some code");


        //*/
    }
}
