package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s.getHeight();
		s.getWidth();
		return (height * 2) + (width*2);
	}
	public double calcArea(double height, double width) {
		s.getHeight();
		s.getWidth();
		return height * width;
	}
	public void paintColor(String color) {
		
	}
	public String print() {
		return "";
	}
}
