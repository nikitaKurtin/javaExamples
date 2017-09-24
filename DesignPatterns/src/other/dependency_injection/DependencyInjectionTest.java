package other.dependency_injection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        Service service = new Service();
        Client client = new Client(service);

        client.doWork();
    }
}
