package com.iu.s1;

public class StudentView {

	public Student [] view(Student [] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println("이름 : "+ students[i].name);
			System.out.println("번호 : "+ students[i].num);
			System.out.println("국어 : "+ students[i].kor);
			System.out.println("영어 : "+ students[i].eng);
			System.out.println("수학 : "+ students[i].math);
			System.out.println("총점 : "+ students[i].total);
			System.out.println("평균 : "+ students[i].avg);
		}//for
		
		return students;
	}//view
		
	public void viewStudent(Student [] students) {
		
	}	
	
	
	
	
}
