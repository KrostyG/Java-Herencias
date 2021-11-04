package com.company;

public class Spider extends Animal{
    public String Name;
    protected Spider(int legs, String Name) {
        super(legs);
        this.Name =Name;
    }
    public Spider(){
        this(8,"");
    }

    @Override
    public void walk() {
        System.out.println("Las arañas caminan con "+legs+" patas");
    }

    @Override
    public void eat() {
        System.out.println("Las aranas comen insectos");
    }

}
