package other.method_chaining;

public class MethodChainingTest {
    public static void main(String[] args) {
        Integer a = 0;
        int length = new Integer(0).toString().concat(" is zero").length();

        new Person()
                .setAge(30)
                .setName("John")
                .printPerson();
    }
}
