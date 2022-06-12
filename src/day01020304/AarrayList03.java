package day01020304;

import java.util.ArrayList;
import java.util.Random;

public class AarrayList03 {
    public static void main(String[] args) {

        Random ran =new Random();//
        ArrayList<Integer> biglist =new ArrayList<>();
        for (int i = 0; i < 20; i++) {
             int num= ran.nextInt(100);
            biglist.add(num);


        }
        System.out.println(biglist);
        ArrayList<Integer> smalllist1=smalllist(biglist);
        System.out.println(smalllist1);

    }
    public static ArrayList<Integer> smalllist (ArrayList<Integer> biglist){
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num= biglist.get(i);
            if(num%2==0){
                smalllist.add(num);

            }


        }
            return smalllist;
    }
}
