package com.kh.hw.shape.mode.vo;

public class Shape {
    private int type;
    private double height;
    private double width;
    private String color="white";

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(){

    }
    public Shape(int type, double height, double width){
        this.type = type;
        this.height = height;
        this.width = width;
    }

    public String information(){
        return height + " " + width + " " + color;
    }

}
