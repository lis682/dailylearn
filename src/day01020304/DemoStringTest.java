package day01020304;

//**构建字符串常见的有3+1种方法
// 三种构造方法：
//public String ()    ：创建一个空白字符串不含任何内容
//public String (char[] array)  ：根据字符数组来构造字符串
//public String (byte[] array)  ：根据字节数组来构造字符串
//============================================================
//一种直接创建：
//String str = "Hello";
public class DemoStringTest {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串" + str1);
        //使用字符数组来构造字符串
        char[] chararray = {'a', 'b', 'c', 'd'};
        String str2 = new String(chararray);
        System.out.println("第二个字符串" + str2);
        //使用字节数组来构造字符串
        byte[] bytearray = {97, 98, 99,100};
        String str3 = new String(bytearray);
        System.out.println("第三个字符串" + str3);
        //============================================以上为三种构造方法
        String str4 = "Hello";
        String str5 = "World";
        String str6 = "!!!!!";
        System.out.println(str4);
        String str7 =(str4.concat(str5));
        System.out.println(str7);
        System.out.println((str4.concat(str5)));
    }

}



