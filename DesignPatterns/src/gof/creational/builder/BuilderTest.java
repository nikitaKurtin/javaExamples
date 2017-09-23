package gof.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        builder.setAge(23);
        builder.setUserName("Gal");
        builder.setPassword("Aa123456");
        builder.setEmail("eee@ggg.asd");

        User gal = builder.build();

        System.out.println(gal);
    }
}
