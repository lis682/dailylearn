package day01020304;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void listen() {
        System.out.println(this.name + "Ìý");
    }

    public void speak() {
        System.out.println(this.name + "Ëµ");
    }

    public Person() {

    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static class Demo01FengZhuang {
        Person one =new Person();


    }
}
