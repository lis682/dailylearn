package day01020304;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class AarrayList03again {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> biglist= new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = ran.nextInt(30);//*********//
            biglist.add(num);
        }
        System.out.println(biglist);
        System.out.println("�󼯺���"+biglist.size()+"λ");
        ArrayList<Integer> smallist = getsmalllist(biglist);//*****/
        System.out.println(smallist);
        System.out.println("С������"+smallist.size()+"λ");
    }
    public static ArrayList<Integer>getsmalllist(ArrayList<Integer> biglist){
        ArrayList<Integer> smalllist = new ArrayList<>();///**************/
        for (int i = 0; i < biglist.size(); i++) {
            int num= biglist.get(i);
            if(num%2==0){
                smalllist.add(num);
            }
        }
            return smalllist;
    }
}
