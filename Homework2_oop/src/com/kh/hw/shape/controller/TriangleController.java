package com.kh.hw.shape.controller;

import com.kh.hw.shape.mode.vo.Shape;

public class TriangleController {
    private Shape s = new Shape();
   
    //면적
    public double calcArea(double height, double width){
        s.setType(3);
        s.setHeight(height);
        s.setWidth(width);
        return (width * height)/2;
    }
    public void paintColor(String color){
        s.setColor(color);
    }
    public String print(){
        return "삼각형" + s.information();
    }
    
}
