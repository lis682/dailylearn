package day10.ExtendTes03;

import java.util.ArrayList;
import java.util.Random;

public class Number extends User{
    public Number() {
    }
    public Number(String name, int many) {
        super(name, many);
    }
    public void recive (ArrayList<Integer> list){
        Random ran = new Random();
        int i1=ran.nextInt(list.size());
        int i2=list.remove(i1);
        int i3= super.getMany();
        super.setMany(i2+i3);
    }

}
