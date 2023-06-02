package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();
	private double PI = 3.14;
	
	public String clacArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "원의 면적 : " + (double)(PI * c.getRadius() * c.getRadius());
	}
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "원의 둘레 : " + (double)(PI * c.getRadius() * 2);
	}
}
