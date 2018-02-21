package com.iu.s3;

public class CarMain {

	public static void main(String[] args) {

		
		Car c = new Car();
		c.info();
		
		Car c2 = new Car("Black");
		c2.info();
		
		Car c3 = new Car("Gray", "Benz");
		c3.info();
		
	}

}
