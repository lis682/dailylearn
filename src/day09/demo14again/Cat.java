package day09.demo14again;
//面向对象思想
//  抽象化--->

/**
 *   描述 现实  中 事务     可以语言
 *    计算机语言 去描述现实中 事物   去抽象
 *    描述一下成绩
 *    科目  分数   姓名  学号
 *
 *
 * 模板  class
 */
class Score {
    int score ;
    String name;
    String suject;
    public Score(String name ,int score1){
        this.name = name;
        score = score1;
        //局部变量的作用域
    }

     public Score(){

     }
}
public  class Cat{
    public static void main(String[] args) {
        Score li = new Score();
        li.name="li";
        li.score=100;
        Score sun = new Score();  //地址引用
        sun.name="sun";
        sun.score=80;
        Score wang = new Score("wang",99);

        reference();
    }

    public static void reference(){
        int a = 1;
        int b = a;
        a =2;
        // 值引用
        System.out.println(a+" b:"+b);
        // 地址引用
        Score x =  new Score("wang",99);
        Score y = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----------");
        x = new Score("x",0);
        System.out.println(x);
        System.out.println(y);
        y =null;
        //JVM 垃圾回收        ----->内存泄露
         //引用
        // 句柄

    }
}