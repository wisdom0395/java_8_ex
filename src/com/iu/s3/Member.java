package com.iu.s3;

public class Member {
	
	String name;
	int age;
	//생성자 입니다.
	public Member() {
		System.out.println("생성자 실행");
		System.out.println("멤버변수의 초기화담당");
		name = "iu";
		age = 26;
	}
	
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}//info
	
}//Member

