package com.step.abstractClasses;

public class Square extends Polygon{

    private Double side;


    public Square(Double side, String color){
        //initializam constructorul clasei abstracte
        //aceasta era nevoie ca sa nu putem accesa parametrii clasei abstracte in clasa de baza
        super("Square", color);
        this.side = side;
    }

    public Double getPerimeter(){
        return 4*side;
    }

    public Double getSurface(){
        return side*side;
    }

}
