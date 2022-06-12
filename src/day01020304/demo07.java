package day01020304;

public class demo07 {
    public static void main(String[] args) {
        method1();
        System.out.println(method2(3, 4));
        System.out.println(method2(3, 3));
        System.out.println(method3(3, 6));
    }

    public static void method1() {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }

    public static boolean method2(int a, int b) {
        return (a == b);
    }

    public static int method3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}


