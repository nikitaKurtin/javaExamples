/**
 * Created by hackeru on 24/08/2017.
 */
public class Tester {

    public static void main(String[] args) {
        String txt = "Irena Karmitsos 111111118 Shay Ruemi 222222223 Dana Amar 333333330 Ronnie Coleman 444444445";
        String [] names = txt.split("\\s\\d{9}\\s");//split by space + nine digits + space
        for(String n : names) System.out.println(n);

        if(txt.matches("^.*\\d+.*$")){
            System.out.println("Has digits");
        }

        if(txt.matches("^\\d+$")){
            System.out.println("Only digits");
        }

        System.out.println(txt.replaceAll("([A-Za-z]+)\\s([A-Za-z]+)\\s(\\d{9})","ID:$3, Name:$1 $2\n"));

        txt = "apple1";
        if(txt.matches("(?=.*[a-z])(?=.*[0-9]).{5,}")){
            System.out.println("Contains lowercase & digits & at least five chars length");
        }

        //Exercise
        String [] good = {"100", "03", "054321789", "+97254321654", "1800400400", "054-3217-892"};//the last test: "054-3217-892" -> only the brave
        for(String d : good) System.out.println(d+" -> "+validatePhone(d));//must to give true
        String [] bad = {"-100", " ", "++97254321789", "100-", "100+", "1+1", "18004004001800400", "9", "0.0"};
        for(String d : bad) System.out.println(d+" -> "+validatePhone(d));//must to give false

    }

    private static boolean validatePhone(String str){
        //return str.matches("^[+]?\\d{2,14}");//v0
        return str.matches("^[+]?\\d{2,4}([-]?\\d{3,4}){0,2}");//v1
    }

}