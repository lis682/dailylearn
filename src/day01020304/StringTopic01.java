//**
// ��Ŀ
// �Ӽ�������õ�һ���ַ���ͳ�����֣���д��ĸ��Сд��ĸ�������������ַ����ֵ�cishu
//
//
// /

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class StringTopic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ���");
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
            System.out.println("��д" + countUpper);
            System.out.println("Сд" + countLower);
            System.out.println("����" + countNumber);
            System.out.println("����" + countelse);

    }
}
