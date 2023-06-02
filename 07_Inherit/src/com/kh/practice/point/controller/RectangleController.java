package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "사각형의 면적 : " + (double)(r.getHeight() * r.getWidth());
	}
	
	public String calcPerimerther(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return "사각형의 둘레 : " + 2 * (double)(r.getHeight() + r.getWidth()) ;
	}
}
