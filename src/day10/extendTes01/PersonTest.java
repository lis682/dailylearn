package day10.extendTes01;



public class PersonTest {
    public static void main(String[] args) {
        Person per = new Person("li",30,"female");
        System.out.println(per.toString());

        Person per1 = new Person("liming",26,"male");
        System.out.println(per1.toString());
        per.toString1();
        per1.toString1();



    }
}
