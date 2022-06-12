package day10.ExtendTes03;
import java.util.ArrayList;

public class Manger extends User {
    public Manger() {

    }

    public Manger(String name, int many) {
        super(name, many);
    }
    public ArrayList<Integer> sendmany(int sendmany,int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftmany = super.getMany();
        super.setMany(leftmany-sendmany);
        if (leftmany < sendmany) {
            System.out.println("余额不足");
        } else {
            int avg = sendmany / num;
            int mood = sendmany % num;
            for (int i = 0; i < num - 1; i++) {
                list.add(avg);
            }
            int sum = avg + mood;
            list.add(sum);

        }
            return list;


    }
}