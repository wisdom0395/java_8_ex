package com.iu.s1;

import java.util.Scanner;

public class StudentService {


	//학생추가 메서드
	//메서드명은 addStudent
	//학생인원수 입력
	//학생수만큼
	//이름입력
	//번호입력
	
	//1.학생 등록
	//학생의 정보를 입력하는 메서드 입니다. addStudent
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
	
	//2. 학생 입력
	//각 학생의 점수를 입력하는 메서드 입니다. addPoint
	//
	
	public void addPoint(Student [] students) {
		Scanner sc = new Scanner(System.in);
				
		for(int i=0;i<students.length;i++) 
		{
			System.out.println(students[i].name+ " 의 국어 점수 입력");
			students[i].kor=sc.nextInt();
			System.out.println(students[i].name+ " 의 영어 점수 입력");
			students[i].eng=sc.nextInt();
			System.out.println(students[i].name+ " 의 수학 점수 입력");
			students[i].math=sc.nextInt();
			//total
			students[i].total=students[i].kor+students[i].eng+students[i].math;
			//avg
			students[i].avg = students[i].total/3.0;
		}
		
		
		
	}
	
	//3. 학생 조회
	//search 메서드명
	//번호를 입력 받아서 학생 한명을 찾아서
	//해당 출력은 StudentView 클래스의 viewStudent 메서드만들어서 출력하자.
	//
	public void search(Student [] students) {
		Scanner sc = new Scanner(System.in);
		//학생의 번호를 입력 받습니다.
		System.out.println("조회할 학생의 번호를 입력하세요");
		int select = sc.nextInt();
		boolean pleg = true;
		
		for(int i=0;i<students.length;i++) {
			if(select==i) 
			{
				System.out.println(students[i]);
				pleg = false;
			}
			else if(pleg) 
			{
				System.out.println("해당번호와 일치하는 학생이 없습니다.");
			}
		}//for
	}
}
