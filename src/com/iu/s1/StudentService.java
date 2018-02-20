package com.iu.s1;

import java.util.Scanner;

public class StudentService {


	//학생추가 메서드
	//메서드명은 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	
	public Student [] addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력");
		int num = sc.nextInt();
		Student [] students = new Student[num];
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름 입력");
			student.name=sc.next();
			System.out.println("번호 입력");
			student.num = sc.nextInt();
			students[i]=student;
		}
		
		return students;
		
	}


}
