package day10.demo02;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {


    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodAbs() {
        System.out.println("接口中都有methodAbs方法在实现类中只需要实现一次");

    }

    @Override
    public void methodDefault() {
        System.out.println("对接口A,B中共有的默认方法进行重写");

    }
}
