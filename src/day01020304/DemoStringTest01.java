package day01020304;

public class DemoStringTest01 {
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println("第一个字符串"+str1);
        String str2 = "abc";
        System.out.println("第二个字符串"+str2);
        char [] chararray={'a','b','c'};
        String str3 = new String(chararray);
        System.out.println("第三个字符串"+str3);
        System.out.println(str1==str2);
        System.out.println(str1==str3 );
        System.out.println(str2==str3);
        //str1==str2 比较的是str1和str2之间的地址值
        //用引号引起来的在字符串的常量池中，而new的字符串不在字符串的常量池中
        // 二者地址不同最终返回false

    }
}
