package day10.extendTest.test1;

public class Bike extends nonmoto {
    public Bike(){

    }
    public Bike (String type,String color){
        super(type,color);
        System.out.println("自行车测试：这是一辆"+color+"颜色的"+type+"牌的自行车");
    }
}
