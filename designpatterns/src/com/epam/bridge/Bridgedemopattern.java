package com.epam.bridge;

public class Bridgedemopattern {

	public static void main(String[] args) 
	{
		Shape Circlered = new Circle(100,100,10,new Circlered());
		Shape Circlegreen = new Circle(100,100,10,new Circlegreen());
		
		Circlered.draw();
		Circlegreen.draw();
	}

}
