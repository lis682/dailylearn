package day10.ExtendTes02;

public class Fruits {
    private  String shape;
    private  String taste;

    public Fruits() {
    }

    public Fruits(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public void eat(){
        System.out.println("水果可供人食用");
    }


    public boolean equals (String shape,String taste){
        if(shape==taste){
            return true;
        }
        else{
            return false;
        }
    }
}
