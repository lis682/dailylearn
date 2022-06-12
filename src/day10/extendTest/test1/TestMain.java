package day10.extendTest.test1;

import day10.extendTest.test1.Bike;
import day10.extendTest.test1.DianDong;
import day10.extendTest.test1.SanLun;
import day10.extendTest.test1.nonmoto;

public class TestMain {
    public static void main(String[] args) {
        nonmoto nonmoto= new nonmoto("保时捷","红色",4,2);
        System.out.println(nonmoto.info());
        Bike bike = new Bike("捷安特","黑色");
        DianDong yadi = new DianDong("小刀");
        SanLun C = new SanLun();
        System.out.println(C.sl());



    }
}
