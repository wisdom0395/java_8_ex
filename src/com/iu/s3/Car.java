package com.iu.s3;

public class Car {
	
	String color;
	String brand;
	int cc;
	
	public Car() {
		//default , 기본, 빈, 생성자
		this("Red");//자신의 또다른 생성자를 호출
		//생성자라인의 첫줄에 기술
	}
	
	
	public Car(String color) {
		this(color, "Audi");
		System.out.println("dfdfd");	//이 문장이 this문장보다 먼저 오면 안된다.
	}
	
	public Car(String color, String brand) {
		this(color, brand, 3000);
	}
	
	public Car(String color, String brand, int cc) {
		this.color=color;
		this.brand=brand;
		this.cc=cc;
	}
	
	
	public void info() {
		System.out.println("Color : "+this.color);
		System.out.println("Brand : "+this.brand);
		System.out.println("Cc : "+this.cc);
		this.make();
	}
	
	public void make() {
		System.out.println("자동차 제작 완료");
	}

}
