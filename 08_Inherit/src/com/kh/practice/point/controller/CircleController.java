package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		String result = Double.toString(Math.PI * radius * radius);
		return c.toString() + " / " + result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		String result = Double.toString(Math.PI * radius * 2);
		return c.toString() + " / " + result;
	}
}
