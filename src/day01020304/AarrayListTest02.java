package day01020304;

import java.util.ArrayList;

public class AarrayListTest02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        System.out.println(list);
        mathod(list);
    }

    public static void mathod(ArrayList<String> list) {
        String str = "{";
        for (int i = 0; i < list.size(); i++) {
            String str1 = list.get(i);
            if (i == list.size() - 1) {
                str += str1 + "}";

            } else {
                str += "@" + str1;
            }
        }
            System.out.println(str);


    }
}
