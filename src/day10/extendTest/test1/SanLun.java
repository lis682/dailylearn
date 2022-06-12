package day10.extendTest.test1;

import day10.extendTest.test1.nonmoto;

public class SanLun extends nonmoto {
    public SanLun(){
        super();
        this.setWheel(3);
    }
    public String sl(){
        String str ="三轮车测试:"+this.getWheel()+"个轮子的车";
        return str;
    }
}
