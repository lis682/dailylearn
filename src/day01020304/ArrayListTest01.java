package day01020304;
/***
 * ��Ŀ
 * ����6��1~33֮������������ӵ����ϣ�����������
 * ����
 * ��Ҫ�洢6�����ִ���һ������<Integer>
 * �����������Ҫ�õ�Random
 * ѭ��6�β���6������� forѭ��
 * ѭ���ڲ���Ҫ���� Random r.nextInt(int n);������Χ0~32 ����+1����0~33
 * ��������ӵ������� add
 * �������� for size get
 *
 */
import java.util.ArrayList;
import java.util.Random;
public class ArrayListTest01 {
    public static void main(String[] args) {
        Random ren = new Random();
        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = ren.nextInt(33)+1;
            list.add(num);

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}





