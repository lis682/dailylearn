package day01020304;

//**�����ַ�����������3+1�ַ���
// ���ֹ��췽����
//public String ()    ������һ���հ��ַ��������κ�����
//public String (char[] array)  �������ַ������������ַ���
//public String (byte[] array)  �������ֽ������������ַ���
//============================================================
//һ��ֱ�Ӵ�����
//String str = "Hello";
public class DemoStringTest {
    public static void main(String[] args) {
        //ʹ�ÿղι���
        String str1 = new String();
        System.out.println("��һ���ַ���" + str1);
        //ʹ���ַ������������ַ���
        char[] chararray = {'a', 'b', 'c', 'd'};
        String str2 = new String(chararray);
        System.out.println("�ڶ����ַ���" + str2);
        //ʹ���ֽ������������ַ���
        byte[] bytearray = {97, 98, 99,100};
        String str3 = new String(bytearray);
        System.out.println("�������ַ���" + str3);
        //============================================����Ϊ���ֹ��췽��
        String str4 = "Hello";
        String str5 = "World";
        String str6 = "!!!!!";
        System.out.println(str4);
        String str7 =(str4.concat(str5));
        System.out.println(str7);
        System.out.println((str4.concat(str5)));
    }

}



