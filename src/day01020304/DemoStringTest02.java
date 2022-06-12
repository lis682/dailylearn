package day01020304;

public class DemoStringTest02 {


    public static void main(String[] args) {
        //字符串的长度
        int length = "jjfhofjdjghpsskfof".length();
        System.out.println(length);
        //字符串的拼接
        String str1 = "Hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //字符串指定位置的字符
        char ch = str1.charAt(1);
        System.out.println("在一号位置上的字符为" + ch);
        //指定字符串在主字符串中第一次出现的索引位置
        int location = str1.indexOf("llo");
        System.out.println("第一次出现的位置是" + location);
        //从给定位置到末尾截取字符串
        String str4 = "IHSIFJANKEGJBNDAMVSSNGKSC";
        String str5 = str4.substring(3);
        System.out.println("从3往后截取的字符串为" + str5);
        //截取begain到end之间的字符串
        String str6 = str4.substring(3, 10);
        System.out.println("3到10之间截取的字符串为" + str6);
        //字符串hello和java未发生改变
        //变得是str7中的地址值
        //其地址值有hello的地址变为Java的地址
        String str7 = "Hello";
        System.out.println(str7);
        str7 = "java";
        System.out.println(str7);
        //将字符串转化为字符数组
        char[] chararry1 = str4.toCharArray();
        System.out.println(chararry1[0]);
        System.out.println(chararry1.length);
        //将字符串转化为字节数组
        byte[] bytearrary1 = str4.getBytes();
        for (int i = 0; i < bytearrary1.length; i++) {
            System.out.println(bytearrary1[i]);
        }
        //用新的字符串替代主字符串中的某些字符
        String str8=str4.replace("I","o");
        System.out.println("原来的字符串为"+str4);
        System.out.println("替换后的字符串为"+str8);
        String str9="你到底会不会玩游戏啊，你个笨蛋！大笨蛋！";
        System.out.println(str9);
        String str10=str9.replace("笨蛋","**");
        System.out.println(str10);
        //按照特定规则将字符串分割为字符数组
        //注意事项：split的参数是一个正则表达式，如果需要根据英文的句号来切割时
        //不能直接用“.”而应该用“\\.”来切割
        String str11="aaaaa,bbbb,adsdf,frgrfr,";
        System.out.println(str11);
        System.out.println("================================");
        System.out.println("分割后的字符数组为");
        String[] str12=str11.split(",");
        for (int i = 0; i < str12.length; i++) {
            System.out.println(str12[i]);
        }
        System.out.println("=========================================分割线");
        String str13="aaaaa.bbbb.adsdf.frgrfr.";
        System.out.println(str11);
        System.out.println("================================");
        System.out.println("分割后的字符数组为");
        String[] str14=str13.split("\\.");
        for (int i = 0; i < str14.length; i++) {
            System.out.println(str12[i]);
        }





    }
}
