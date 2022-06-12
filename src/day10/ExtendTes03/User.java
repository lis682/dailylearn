package day10.ExtendTes03;

public class User {
    private String name;
    private int many;

    public User() {
    }

    public User(String name, int many) {
        this.name = name;
        this.many = many;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }

    public void show(){
        String str= "我叫"+this.getName()+"我有"+this.getMany()+"钱";

    }

}
