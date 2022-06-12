package day01020304;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest01again {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = ran.nextInt(33)+1;
            list.add(num);

        System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
