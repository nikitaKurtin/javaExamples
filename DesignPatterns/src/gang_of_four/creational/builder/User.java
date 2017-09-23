package gang_of_four.creational.builder;

public class User {
    private String username;
    private String password;
    private String email;
    private int age;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "first name: " + username + ", last name: " + password + ", age: " + age + ", email: " + email;
    }

    static class Builder {
        private User user;

        Builder() {
            user = new User();
        }

        void setUserName(String name) {
            user.username = name;
        }

        void setPassword(String lastName) {
            user.password = lastName;
        }

        void setEmail(String email) {
            user.email = email;
        }

        void setAge(int age) {
            user.age = age;
        }

        User build() {
            return user;
        }
    }
}
