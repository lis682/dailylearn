package day09.demo14again;

public class User {

    private String name;
        private int many;
    public User() {
    }

    public User(String name, int many) {
        this.name = name;
        this.many = many;
    }
    public void show(){
        System.out.println("我是"+name);
        System.out.println("我有"+many+"钱");
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
}

