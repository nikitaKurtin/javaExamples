package other.method_chaining;

class Person {
    private String name;
    private int age;

    Person setAge(int age) {
        this.age = age;
        return this;
    }

    Person setName(String name) {
        this.name = name;
        return this;
    }

    void printPerson() {
        System.out.println("name: " + name + ", age: " + age);
    }
}
