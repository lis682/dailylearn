package day09.demo14again;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger man =new Manger("群主",100);
        Member one = new Member("赵1",10);
        Member two= new Member("赵2",100);
        Member three = new Member("赵3",30);
        ArrayList<Integer> str = new ArrayList<>();
   str = man.send(35,3);
   one.resiver(str);
   two.resiver(str);
   three.resiver(str);
   man.show();
   one.show();
   two.show();
   three.show();


    }
}