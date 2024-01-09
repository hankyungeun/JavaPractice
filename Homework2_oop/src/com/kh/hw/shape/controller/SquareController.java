package com.kh.hw.shape.controller;

import com.kh.hw.shape.mode.vo.Shape;

public class SquareController {
    private Shape s = new Shape();
    
    //둘레
    public double calcPerimeter(double height, double width){
        s.setType(4);
        s.setHeight(height);
        s.setWidth(width);
        return height * 2 + width * 2;
    }
    
    //면적
    public double calcArea(double height, double width){
        s.setType(4);
        s.setHeight(height);
        s.setWidth(width);
        return width * height;
    }
    public void paintColor(String color){
        s.setColor(color);
    }
    public String print(){
        return "사각형" + s.information();
    }
    
}
