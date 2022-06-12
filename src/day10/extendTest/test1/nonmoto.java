package day10.extendTest.test1;

public class nonmoto {
    private int wheel;
    private int set;
    private String type ;
     private String color;

    public nonmoto() {
    }
    public nonmoto(int wheel) {
        this.wheel = wheel;
    }
    public nonmoto(String type,String color){
     this.type=type;
     this.color=color;
    }

    public nonmoto(String type, String color,int wheel, int set) {
        this.type = type;
        this.color = color;
        this.wheel = wheel;
        this.set = set;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String info (){
        String str = "父亲信息测试：这是一辆"+this.getColor()+"颜色的，"+this.getType()+"牌的非机动车，有"+this.getWheel()+"个轮子"+getSet()+"个座椅";
        return str;
    }
}
