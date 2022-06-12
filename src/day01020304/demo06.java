package day01020304;

public class demo06 {
    public static void main(String[] args) {
        int i, j,sum;
        sum=0;
        i = 10;
        j = 0;
        do{
            sum=sum+i+j;
            i--;
            j++;
            System.out.println(sum);

        }while(i>j);
        System.out.println("sss"+sum);
    }
}
