package day01020304;

public class DemoStringTest02 {


    public static void main(String[] args) {
        //�ַ����ĳ���
        int length = "jjfhofjdjghpsskfof".length();
        System.out.println(length);
        //�ַ�����ƴ��
        String str1 = "Hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //�ַ���ָ��λ�õ��ַ�
        char ch = str1.charAt(1);
        System.out.println("��һ��λ���ϵ��ַ�Ϊ" + ch);
        //ָ���ַ��������ַ����е�һ�γ��ֵ�����λ��
        int location = str1.indexOf("llo");
        System.out.println("��һ�γ��ֵ�λ����" + location);
        //�Ӹ���λ�õ�ĩβ��ȡ�ַ���
        String str4 = "IHSIFJANKEGJBNDAMVSSNGKSC";
        String str5 = str4.substring(3);
        System.out.println("��3�����ȡ���ַ���Ϊ" + str5);
        //��ȡbegain��end֮����ַ���
        String str6 = str4.substring(3, 10);
        System.out.println("3��10֮���ȡ���ַ���Ϊ" + str6);
        //�ַ���hello��javaδ�����ı�
        //�����str7�еĵ�ֵַ
        //���ֵַ��hello�ĵ�ַ��ΪJava�ĵ�ַ
        String str7 = "Hello";
        System.out.println(str7);
        str7 = "java";
        System.out.println(str7);
        //���ַ���ת��Ϊ�ַ�����
        char[] chararry1 = str4.toCharArray();
        System.out.println(chararry1[0]);
        System.out.println(chararry1.length);
        //���ַ���ת��Ϊ�ֽ�����
        byte[] bytearrary1 = str4.getBytes();
        for (int i = 0; i < bytearrary1.length; i++) {
            System.out.println(bytearrary1[i]);
        }
        //���µ��ַ���������ַ����е�ĳЩ�ַ�
        String str8=str4.replace("I","o");
        System.out.println("ԭ�����ַ���Ϊ"+str4);
        System.out.println("�滻����ַ���Ϊ"+str8);
        String str9="�㵽�׻᲻������Ϸ��������������󱿵���";
        System.out.println(str9);
        String str10=str9.replace("����","**");
        System.out.println(str10);
        //�����ض������ַ����ָ�Ϊ�ַ�����
        //ע�����split�Ĳ�����һ��������ʽ�������Ҫ����Ӣ�ĵľ�����и�ʱ
        //����ֱ���á�.����Ӧ���á�\\.�����и�
        String str11="aaaaa,bbbb,adsdf,frgrfr,";
        System.out.println(str11);
        System.out.println("================================");
        System.out.println("�ָ����ַ�����Ϊ");
        String[] str12=str11.split(",");
        for (int i = 0; i < str12.length; i++) {
            System.out.println(str12[i]);
        }
        System.out.println("=========================================�ָ���");
        String str13="aaaaa.bbbb.adsdf.frgrfr.";
        System.out.println(str11);
        System.out.println("================================");
        System.out.println("�ָ����ַ�����Ϊ");
        String[] str14=str13.split("\\.");
        for (int i = 0; i < str14.length; i++) {
            System.out.println(str12[i]);
        }





    }
}
