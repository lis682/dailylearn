package day01020304;
import java.util.Arrays;
public class Arrayqvchong {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num2 = {7, 8, 9,10};
        int[] hebing1;
        float f1=0;
        hebing1 = hebing(num1, num2);
        System.out.println(Arrays.toString(hebing1));
        int[] paixuhou= new int[num1.length + num2.length];
        paixuhou = paixv(hebing1);
        System.out.println(Arrays.toString(paixuhou));
        f1=foundzongweinum(paixuhou);
        System.out.println("中位数是"+f1);
    }

    public static int[] hebing(int[] num1, int[] num2) {
        int[] zong = new int[num1.length + num2.length];
        for (int i = 0; i < num1.length; i++) {
            zong[i] = num1[i];
        }
        for (int j = 0; j < num2.length; j++) {
            zong[num1.length + j] = num2[j];
        }
        return zong;
    }

    public static int[] paixv(int[] zong) {
                int temp;
        for (int i = 0; i < zong.length - 1; i++) {
            for (int j = 0; j < zong.length - i - 1; j++) {
                if(zong[j]>=zong[j+1]) {
                    temp = zong[j];
                    zong[j] = zong[j+1];
                    zong[j+1]=temp;
                }

            }
        }
        return zong;
    }
    public static float foundzongweinum(int[] paixuhou){
         float zhongweinumber = 0;
        int length= paixuhou.length;
        if(length%2==0){
            zhongweinumber= (float) ((paixuhou[length/2-1]+paixuhou[length/2])/2.0);

        }else if(length%2!=0){
            zhongweinumber=paixuhou[length/2];
        }
        return zhongweinumber;
    }
}

