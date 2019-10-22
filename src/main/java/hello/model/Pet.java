package hello.model;

import org.springframework.data.annotation.Id;

public class Pet{

    public Pet(String name , int age){
        this.name = name;
        this.age = age;
    }
    @Id
    public String Id;
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age=age;
    }
}