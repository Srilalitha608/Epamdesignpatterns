package com.epam.facade;

public class Facadepattern {

	public static void main(String[] args) 
	{
		Makeshape shape = new Makeshape();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}

}
