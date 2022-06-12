package day01020304;

import java.util.ArrayList;

public class AarrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student one = new Student("a" ,20);
        Student two = new Student("b",21);
        Student three = new Student("c",22);
        Student four = new Student("d",23);
        arr.add(one);
        arr.add(two);
        arr.add(three);
        arr.add(four);
        Student stu1 = arr.get(0);
        System.out.println(stu1.getName());
        for (int i = 0; i < arr.size(); i++) {
            Student su = arr.get(i);
            System.out.println("ĞÕÃû"+su.getName()+"ÄêÁä"+su.getAge());

        }


    }
}
