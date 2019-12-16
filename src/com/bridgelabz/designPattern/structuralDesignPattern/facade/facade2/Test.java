package com.bridgelabz.designPattern.structuralDesignPattern.facade.facade2;

public class Test 
{
	public static void main(String[] args) 
	{
		ShapeMaker shapemaker=new ShapeMaker();
		shapemaker.drawCircle();
		shapemaker.drawRectangle();
		shapemaker.drawSquare();
	}

}
