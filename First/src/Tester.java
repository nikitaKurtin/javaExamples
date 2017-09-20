import myPack.MyClass;

import java.util.Arrays;

/**
 * Created by hackeru on 8/10/2016.
 */
public class Tester {
    MyClass c;//instance variable of type MyClass
    static String x;//class variable of type String

    public static void main(String [] args){
        //Comment line
        /* Comment block */

        /*  Combination:
        System.out.println("Hello world");

        //variables
        int num1;//variable declaration - for primitive integer
        num1=100;//variable initialization
        System.out.println(num1);
        char ot='3';
        boolean isAlive=true;
        double avgGrade=91.5;
        String carName="Mazda";
        System.out.println(carName+ot);
        //Ex1
        String fName="Nikita",lName="Kurtin";
        System.out.println(fName+"\n"+lName);
        //Ex2
        char n='n',i='i',k='k',t='t',a='a',u='u',r='r';
        System.out.println(""+n+i+k+i+t+a+"\n"+k+u+r+t+i+n);
        /*
        //Arrays
        int [] x;//declaration for Array of integers
        x=new int[3];//memory allocation for 3 cells
        x[0]=3;
        x[1]=-2;
        x[2]=56;
        //to print readable Array representation use: Arrays.toString
        System.out.println(Arrays.toString(x));
        String text="Foo enter into a Bar and says Hello world";
        String[] words=text.split(" ");
        System.out.println("Text has "+words.length+" words");
        //Shortcut inline declaration & initialization
        double [] nums = {1.5,5.2,-456.369};
        /*
        //method invocation (call)
        sayHiTo("Bubu");
        sayHiTo("Groot");
        int result=1+giveTen();
        System.out.println("ten is "+giveTen());
        System.out.println("Result is "+result);
        System.out.println(minus(8.0,2.5));
        /*
        //Control flow
        //Conditions:
        //Example 1
        if(true) System.out.println("One");
        //Example 2:
        if(1<2){
            System.out.println("Two");
        }
        //Example 3:
        int grade=69;
        if(grade>70){
            System.out.println("gadol");
        }else if(grade>60){
            System.out.println("60~70");
        }else{
            System.out.println("aheret");
        }
        //Example 4:
        String name=null;
        if(name!=null)if(name.length()<4){
            System.out.println("katan");
        }
        //Example 5:
        String msg=grade>60?"avarta":"lo avarta";

        /*
        //Loops oops
       boolean some=false;
        //Example 1
       while(some){
           System.out.println("Some");
       }
        //Example 2
        do{
            System.out.println("Another some");
        }while(false);
        //Example 3
        while(true){
            if(true)break;
        }
        //Example 4
        int i;
        for(i=0;true;i++){
            if(i==100)break;
        }
        System.out.println(i);
        //Example 5
        for(int x=0;x<10;x++){
            System.out.println(x);
        }
        //Example 6: foreach
        int [] grades={85,90,95,100};
        for(int grade : grades){
            System.out.println(grade);
        }
        /*/
        //Switch
        //Example 1
        switch(2){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("def");
        }
        //Example 2
        String key="two";
        switch(key){
            case "one"://key->1
                key="1"+key;//key=1one
            case "two":
                key+="Number";//twoNumber|1oneNumber
                break;
            case "three":
                key="3";
                break;
            default:
                key="*"+key+"*";
        }
        System.out.println(key);


        //*/

    }
    //Methods:
    //Example 1
    //method declaration
    static void sayHiTo(String name){//method implementation
        System.out.println("Hello to "+name);
    }
    //Example 2
    static int giveTen(){
        return 10;
    }
    //Example 3
    static double minus(double n1, double n2){
        return n1-n2;
    }
    static double plus(double n1, double n2){
        return n1+n2;
    }
    static double divide(double n1, double n2){
        return n1/n2;
    }
    static double multiply(double n1, double n2){
        return n1*n2;
    }
    static double timesTwo(double n){
        return plus(n,n);//recycle use of method plus
    }
    static double square(double n){
        return multiply(n,n);//recycle use of method multiply
    }

	//Ex1
    static void checkStudentGrade(String studentName, int grade){
        String msg="Student "+studentName;
        if(grade>55){//
            if(grade>90){//
                msg+=" excelled";
            }else{//
                msg+=" passed";
            }
        }else{
            msg+=" failed";
        }
        System.out.println(msg);
    }
    //Ex2
    static int biggestFrom(int[]nums){
        int biggest=nums[0];//local variable
        for(int i=1;i<nums.length;i++){
            if(biggest<nums[i])biggest=nums[i];
        }
        return biggest;
    }
    //Ex3
    static int smallestFrom(int[]nums){
        int smallest=nums[0];//local variable
        for(int i=1;i<nums.length;i++){
            if(smallest>nums[i])smallest=nums[i];
        }
        return smallest;
    }
    //Ex4
    static double avg(int [] nums){
        double sum=0.0;//sum of all ints
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum/nums.length;//sum/length == avg
    }
    //Ex5
    //3->[1,3,6]
    //2->1,3
    //4->1,3,6,10
    static int [] triNums(int count){
        int [] triNums = new int[count];
        for(int n=0;n<count;n++){
            triNums[n]=n*(n+1)/2;
        }
        return triNums;
    }
}
