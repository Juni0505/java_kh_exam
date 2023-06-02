package com.kh.practice.point.model.vo;

public class Circle extends Point{
	private int radius;
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public Circle() {
		
	}
	public Circle(int x, int y, int radius) {
		this.getX();
		this.getY();
		this.radius = radius;
	
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
