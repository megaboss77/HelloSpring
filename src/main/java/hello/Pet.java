package hello;

public class Pet{

    public Pet(String name , int age){
        this.name = name;
        this.age = age;
    }
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}