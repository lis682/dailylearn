package day10.ExtendTes02;

public class Bannana extends Fruits {
    private String type;

    public Bannana() {
    }

    public Bannana(String shape, String taste,String type) {
        super(shape,taste);
        this.type = type;
    }

    public void show(){
        String str = "品种是"+type+"形状"+this.getShape()+"味道"+this.getTaste();
        System.out.println(str);
    }
    public void show(String color){
        String str = "颜色是"+color;
        System.out.println(str);
    }
}
