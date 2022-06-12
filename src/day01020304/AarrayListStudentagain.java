package day01020304;

import java.util.ArrayList;

public class AarrayListStudentagain {
    public static void main(String[] args) {
        Student one = new Student("a",13);
        Student two = new Student("b",14);
        Student three = new Student("c",15);
        Student four = new Student("d",16);
        ArrayList<Student> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student su = list.get(i);
            System.out.println("ĞÕÃû"+su.getName()+",ÄêÁä"+su.getAge());

        }
    }
}
