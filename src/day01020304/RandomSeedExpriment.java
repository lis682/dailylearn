//Random(seed)seed 值不变在多次调用的时候Random的返回值不变
import java.util.ArrayList;
import java.util.Random;

public class RandomSeedExpriment {
    public static void main(String[] args) {
        ArrayList<Integer> list3 =Random1();
        ArrayList<Integer> list4 = Random2();
        System.out.println(list3);
        System.out.println(list4);
    }

        public static  ArrayList<Integer> Random1 () {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                Random ran = new Random(30);
                int num = ran.nextInt(30);
                list.add(num);
            }
            return list;

        }
            public static ArrayList<Integer> Random2 () {
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    Random ran = new Random(30);
                    int num = ran.nextInt(30);
                    list1.add(num);


                }
                return list1;



            }


        }

