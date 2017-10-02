package other.dependency_injection;

class Client {
    private Service service;

    Client(Service service) {
        this.service = service;
    }

    void doWork() {
        System.out.println("changing state of service from client");
        service.setState("new state");
    }
}
