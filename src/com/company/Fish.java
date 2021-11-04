package com.company;

public class Fish extends Animal implements Pet {
    public String Name;
    protected Fish(int legs, String Name) {
        super(legs);
        this.Name =Name;;
    }

    public Fish(){
        this(0,"");
    }

    @Override
    public void eat() {
        System.out.println("Los peces comen algas");
    }

    @Override
    public void walk() {
        System.out.println(Name+" No puede caminar porque tiene "+legs+" patas");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String setName(String Name) {
        return null;
    }

    @Override
    public void play() {
System.out.println("los peces juegan en el agua");
    }

}
