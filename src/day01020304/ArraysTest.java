package day01020304;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        String str = "ghfgigrgkhgksmdkfkiukgrjnowk,fkjcsld,mj";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+"*");
        }
            System.out.println();
        System.out.println("===================================================");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]+"#");

        }
    }
}
