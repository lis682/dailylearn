package day01020304;
/***
 * 题目
 * 生成6个1~33之间的随机数，添加到集合，并遍历集合
 * 分析
 * 需要存储6个数字创建一个集合<Integer>
 * 产生随机数需要用到Random
 * 循环6次产生6个随机数 for循环
 * 循环内部需要调用 Random r.nextInt(int n);参数范围0~32 整体+1才是0~33
 * 把数字添加到集合中 add
 * 遍历集合 for size get
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





