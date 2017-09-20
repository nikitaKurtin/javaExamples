import java.util.*;
import java.util.Map.Entry;

public class Tester {
    public static void main(String [] args){
        /* //Example 1
        Collection c;
        //ArrayList(concrete subClass) <- List(interface) <- Collection(interface) - so we can:
        c = new ArrayList();
        c.add("Katya");
        c.add(150);
        c.add(36.26);
        c.add(true);
        System.out.println(c.size());//Every Collection has size (.length)
        System.out.println(c);//Every Collection has readable String representation
        for(Object val:c){//Every Collection is Iterable (can be used within foreach)
            System.out.println(val);
        }
        /* //Example 2
        List list = new ArrayList();
        //Default type is Object - we can parse any type
        list.add("Bubu");
        list.add(123);
        list.add("Bubu");//duplicated values - allowed
        list.add(321);
        list.add("Groot");
        list.add(123);
        System.out.println(list.get(2));//Retrieve value by index
        /*
        //Example 3
        List<String> names = new ArrayList();
        names.add("Bubu");
        names.add("Groot");
        names.add("Deadpool");
        //names.add(1);//Compiler error - names works only with String
        names.add("Bubu");
        System.out.println(names);
        /*
        //Example 4
        LinkedList <Integer> nums = new LinkedList();
        nums.add(100);
        nums.add(200);
        nums.add(50);
        nums.add(200);
        //Every List has toArray method - to be converted to Array
        Integer [] ints = new Integer[nums.size()];
        ints = nums.toArray(ints);
        for(Integer i : ints){
            System.out.println(i);
        }
        /*
        //Example 5 -
        Set set = new HashSet();
        //Default type is Object - we can parse any type
        set.add("Bubu");
        set.add(123);
        set.add("Bubu");//duplicated values - disallowed
        set.add(321);
        set.add("Groot");
        set.add(123);
        System.out.println(set.size());
        System.out.println(set);
        for(Object val:set){
            System.out.println(val);
        }
        /*
        //Example 6
        Set <Integer> tSet = new TreeSet();
        tSet.add(50);
        tSet.add(60);
        tSet.add(40);
        tSet.add(8);
        tSet.add(8);
        tSet.add(40);
        System.out.println(tSet);

        /*

        //Example 7 - combinations:
        //Some data - array of String
        String [] strs = {"Spiderman","Bubu","Groot","Deadpool"};
        List <String> data = new ArrayList();
        data.addAll(Arrays.asList(strs));
        System.out.println(data);//Before sorting
        Collections.reverse(data);
        System.out.println(data);//Reversed - Before sorting
        TreeSet <String> tData = new TreeSet();
        tData.addAll(data);//Ascending sorting with TreeSet
        data=new ArrayList();
        data.addAll(tData);
        System.out.println(tData);
        System.out.println(data);//After sorting ASC
        Collections.reverse(data);
        System.out.println(data);//After Reverse&sortingASC => Desc
        /*/
        //Example 8
        Map <String,Integer> grades;
        //grades = new HashMap();
        grades = new TreeMap();
        grades.put("Rocket",100);
        grades.put("Asaf",99);
        grades.put("Bubu",85);
        grades.put("Groot",70);
        grades.put("Gamora",99);
        grades.put("Drax",55);
        System.out.println(grades.get("Gamora"));//
        System.out.println(grades.get("Star lord"));//
        grades.remove("Drax");//
        System.out.println(grades.size());//
        //iterate over keys
        for (String name:grades.keySet()) {
            System.out.println(name);
        }
        //iterate over values
        for (Integer grade: grades.values()){
            System.out.println(grade);
        }
        //iterate over keys & values - 1
        for (String key:grades.keySet()){
            System.out.println("student: "+key+" has grade: "+grades.get(key));
        }
        //iterate over keys & values - 2
        for(Entry<String,Integer> entry : grades.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //*/
    }
}
