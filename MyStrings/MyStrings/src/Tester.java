
public class Tester {
    public static void main(String [] args){
		/*
		//String is a sequence of chars - there for it can be converted back and forward
        char [] data = {'J','a','v','a'};
        String str = new String(data);//convert array of chars to String
        System.out.println(str);
        data = str.toCharArray();//convert String to array of chars
		byte [] data2 = {74, 97, 118, 97};
		str = new String(data2);//convert array of bytes to String
        System.out.println(str);
        data2 = str.getBytes();//convert String to array of bytes
        //Useful methods - good to remember
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str+" something ");
        System.out.println(str.concat(" another "));
        System.out.println(str);
        str = str + " & Android";
        System.out.println(str);
        System.out.println(str.substring(5));//
        System.out.println(str.substring(5,10));//
        System.out.println(str.indexOf('&'));//
        System.out.println(str.indexOf("And"));//
        System.out.println(str.lastIndexOf('&'));
        System.out.println(str.lastIndexOf("a"));
        //Common boolean checks
        System.out.println(str.startsWith("Java"));
        System.out.println(str.endsWith("roid"));
        System.out.println(str.contains("And"));
        System.out.println(str.equalsIgnoreCase("java & android"));
        //Since String is an Object - and Object has toString() -> we can
        System.out.println("Bubu".toString().toString().toString().toString());
		//Trim -> remove leading & trailing spaces
        System.out.println("\n Groot    ".trim());
        
		/*/
		//String VS StringBuilder
        String str1=new String("My String");//String is immutable
        str1.concat("bubu");//returns a new concatenation result
        System.out.println(str1);//not changing current str1
        
        StringBuilder str2=new StringBuilder("My StrBuilder");//StringBuilder is mutable
        str2.append("bubu");//appends to current char sequence
        System.out.println(str2);//changing current str2
        /*
        //StringBuilder -> useful methods
        StringBuilder str3 = new StringBuilder();
        str3.append("Nikita").append(" is awesome").append(" & very humble");
        str3.insert(0,"Secret agent ").insert(22," very");
        System.out.println(str3);
        str3.deleteCharAt(5);
        str3.delete(0,6);
        str3.insert(5,'a');
        System.out.println(str3);
        /*
        //StringBuffer-> synchronized StringBuilder
        StringBuffer str4 = new StringBuffer();
        str4.append("Nikita").append(" is awesome").append(" & very humble");
        str4.insert(0,"Secret agent ").insert(22," very");
        System.out.println(str4);
        str4.deleteCharAt(5);
        str4.delete(0,6);
        str4.insert(5,'a');
        System.out.println(str4);
        System.out.println(str4.reverse());
        
        /*/
		//Performance considerations
        long time;
		
        {//String
            String st = new String();
            time = System.currentTimeMillis();//current starting timestamp
            for(int i=0;i<20000;i++)st+=i;//change value of `st` 
            time = System.currentTimeMillis()-time;//current ending timestamp
            System.out.println("String: "+time);
        }
        
        {//StringBuilder
            StringBuilder sb = new StringBuilder();
            time = System.currentTimeMillis();//current starting timestamp
            for(int i=0;i<20000;i++)sb.append(i);//change value of `sb` 
            time = System.currentTimeMillis()-time;//current ending timestamp
            System.out.println("String Builder: "+time);
        }
        
        {//StringBuffer
            StringBuffer sb = new StringBuffer();
            time = System.currentTimeMillis();//current starting timestamp
            for(int i=0;i<20000;i++)sb.append(i);//change value of `sb` 
            time = System.currentTimeMillis()-time;//current ending timestamp
            System.out.println("String Buffer: "+time);
        }
		
    }
}
