package com.oop.practice02;

public class Triangle extends Shape implements Resize{

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight() + size);
	}


	@Override
	public String toString() {
		return super.toString() + getArea();
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() / 2.0;
	}

	
	
	
	
}
