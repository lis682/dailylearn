package day01020304;

public class demo08 {
    public static void main(String[] args) {
        int[] arrayA = new int[3];//动态创建1
        int[] arrayA1;//动态创建2
        arrayA1 = new int[3];//动态创建2
        int[] arrayB = {3, 4, 5, 6, 4, 8, 5, 5, 6, 5, 6, 5};//静态创建
        arrayA1[0] = 1;
        arrayA1[1] = 2;
        arrayA1[2] = 8;
        int sum = arrayB.length;
        System.out.println(sum);//数组的长度
        for (int j = 0; j < arrayA1.length; j++) {
            System.out.println(arrayA1[j]);
        }//动态数组arrayA1的遍历
        printarray(arrayB);
       float[] result= ldt(arrayB);
        System.out.println("总数是"+result[0]);
        System.out.println("平均数是"+result[1]);

        int max = arrayB[0];
        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] > max) {
                max = arrayB[i];
            }
        }
            System.out.println("arrayB中最大的元素为" + max);
            int min = arrayB[0];
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayB[j] < min) {
                    min = arrayB[j];
                }
            }
            System.out.println("arrayB中最小的元素为" + min);


        }
        public static void printarray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }//静态数组arrayB的遍历
    public static float []ldt (int [] arrray){
        float sum=0,avg=0;
        for(int i=0;i<arrray.length;i++){
          sum=sum+arrray[i] ;
        }
        avg=sum/arrray.length;
        float [] Farray =  {sum,avg};
       return Farray;

    }
    }


