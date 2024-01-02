package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		
		String result = Integer.toString(width * height);
		return r.toString() + " / " + result;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		
		String result = Integer.toString((width + height)*2);
		return r.toString() + " / " + result;
		
	}
	

}
