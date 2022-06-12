package day10.extendTest.test1;
public class DianDong {
    private String dianchi;
    public DianDong(){

    }

    public String getDianchi() {
        return dianchi;
    }

    public void setDianchi(String dianchi) {
        this.dianchi = dianchi;
    }
    public DianDong (String dianchi){
        super();
        this.dianchi=dianchi;
        System.out.println("电动车测试:这是一辆使用"+this.dianchi +"牌子电池的电动车");//this.dianchi
    }
}
