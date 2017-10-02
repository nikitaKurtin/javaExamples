package other.dependency_injection;

public class Service {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println(getState());
    }
}
