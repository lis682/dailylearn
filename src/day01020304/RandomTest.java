import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
            Random r=new Random();
            int j,k;
        for (int i = 0; i <100 ; i++) {
            j=r.nextInt(9);
            System.out.println("#"+j);
            k=r.nextInt(100);
            System.out.println("*"+k);

        }
    }//

}
///j.nextINT(9)��ʾ��0~8֮��ȡ�����
///j.nextINT(9)+1��ʾ��1~9֮��ȡ�����