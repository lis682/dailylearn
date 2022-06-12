package day09.demo14again;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int many) {
        super(name, many);
    }

    public void resiver (ArrayList<Integer> list){
        Random ran =new Random();
        int i3 = ran.nextInt(list.size());
        // todo  此处写代码
        //System.out.println("业务逻辑1");
        int x = 10;
        int i4=list.remove(i3);
    int mony = super.getMany();
    super.setMany(mony+i4);
    }


}
