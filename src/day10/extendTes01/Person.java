package day10.extendTes01;

public class Person {
    private String name;
    private  int age;
    private  String sex;

    public Person() {
    }
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setNsme(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String toString(){
        String str= new String();
        str = "姓名:"+this.getName()+"年龄："+this.getAge()+"性别:"+this.getSex();
        return str;
    }
    public void toString1(){
        String str= new String();
        str = "姓名:"+this.getName()+"年龄："+this.getAge()+"性别:"+this.getSex();
        System.out.println(str);

    }
}
