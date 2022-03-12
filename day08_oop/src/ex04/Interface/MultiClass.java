package ex04.Interface;

import ex02.Abstract.Shape;
import ex04.Interface.Test;
import ex05.Interface.IDraw;


public class MultiClass extends Shape implements Test, IDraw {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("idraw interface");
	}

	@Override
	public double calc(double x) {
		System.out.println("super class");
		return 1000;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		System.out.println("name");
		
	}

	@Override
	public void tView() {
		// TODO Auto-generated method stub
		System.out.println("test interface");
	}

	

	

	
}
