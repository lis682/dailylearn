package day01020304;

public class DemoStringTest01 {
    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println("��һ���ַ���"+str1);
        String str2 = "abc";
        System.out.println("�ڶ����ַ���"+str2);
        char [] chararray={'a','b','c'};
        String str3 = new String(chararray);
        System.out.println("�������ַ���"+str3);
        System.out.println(str1==str2);
        System.out.println(str1==str3 );
        System.out.println(str2==str3);
        //str1==str2 �Ƚϵ���str1��str2֮��ĵ�ֵַ
        //�����������������ַ����ĳ������У���new���ַ��������ַ����ĳ�������
        // ���ߵ�ַ��ͬ���շ���false

    }
}
