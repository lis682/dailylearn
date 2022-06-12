package day01020304;

public class MathTest {
    public static void main(String[] args) {
        int num = 0;
        double min = -10.8;
        double max = 5.9;
        for(int i=(int)min;i<(int)max;i++){
            int abs = Math.abs(i);
            if(abs>6||abs<2.1){
                System.out.println(i);
                num++;
            }
        }
        System.out.println(num);
    }
}
