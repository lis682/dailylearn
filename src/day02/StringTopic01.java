//**
// 题目
// 从键盘输入得到一个字符串统计数字，大写字母，小写字母，其他，各种字符出现的cishu
//
//
// /

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class StringTopic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countelse = 0;
        char[] charArrary = input.toCharArray();
        for (int i = 0; i < charArrary.length; i++) {
            char ch = charArrary[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            }
            else if ('a' <= ch && ch <= 'z') {
                countLower++;
            }
            else if ('0' <= ch && ch <= '9') {
                countNumber++;
            }
            else {
                countelse++;

            }
        }
            System.out.println("大写" + countUpper);
            System.out.println("小写" + countLower);
            System.out.println("数字" + countNumber);
            System.out.println("其他" + countelse);

    }
}
