package util;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello " + name;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("David");
        System.out.println(p.getName());
        System.out.println(p.sayHello());

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
