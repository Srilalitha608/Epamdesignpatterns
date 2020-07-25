package com.epam.facade;

public class Makeshape {
	private Drawshape circle;
	private Drawshape rectangle;
	private Drawshape square;
	public Makeshape() {
		circle = new Circle();
		rectangle = new Shaperectangle();
		square = new Shapesquare();
	}

	public void drawCircle() {
		
		circle.draw();
		
	}

	public void drawRectangle() {
		
			rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
		
	}
}
