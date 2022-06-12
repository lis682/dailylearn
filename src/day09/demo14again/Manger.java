package day09.demo14again;

import java.util.ArrayList;

public class Manger extends User {
    public Manger() {
    }

    public Manger(String name, int many) {
        super(name, many);
    }

    public ArrayList <Integer> send(int sendmany, int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftmany = super.getMany();
        super.setMany(leftmany-sendmany);
        if (sendmany > leftmany) {
            System.out.println("余额不足");
        }
        int avg = sendmany / num;
        int mood = sendmany % num;
        for (int i = 0; i < num; i++) {
            if (i == num - 1) {
                int i1 = avg + mood;
                list.add(i1);

            } else {
                list.add(avg);
            }


        }
        return list;
    }


}
