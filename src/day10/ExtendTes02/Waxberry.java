package day10.ExtendTes02;

public class Waxberry extends Fruits {
    private String color;

    public Waxberry() {
    }

    public Waxberry(String shape,String taste,String color) {
        super(shape,taste);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(){

        System.out.println("酸甜适中，很好吃");
    }
    public void show(){
        String str = "杨梅的信息：果实为"+this.getShape()+"|"+this.color+"|"+this.getTaste();
        System.out.println(str);
    }
}
