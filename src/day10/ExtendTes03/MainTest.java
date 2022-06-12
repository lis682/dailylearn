package day10.ExtendTes03;

import day09.demo14again.Member;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        Manger mi = new Manger("123",300);
        Member one = new Member("1",0);
        Member two = new Member("2",30);
        Member three= new Member("3",40);


        mi.show();
        System.out.println("---------------------------------------------");
    ArrayList<Integer> list1= mi.sendmany(100,3);
    one.resiver(list1);
    two.resiver(list1);
    three.resiver(list1);
    mi.show();
    one.show();
    two.show();
    three.show();
    }
}
