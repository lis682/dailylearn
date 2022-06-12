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
///j.nextINT(9)表示在0~8之间取随机数
///j.nextINT(9)+1表示在1~9之间取随机数