package com.iu.s1;

import java.util.Scanner;

public class SchoolController {
		
	//메서드명은 start 
	//리턴은 X
	//내용은 
	//1. 학생	등록
	//2. 성적	입력
	//3. 성적	조회
	//4. 전체	조회
	//5. 프로그램 종료
	// 번호 눌러서 실행만 되었다.
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student [] students=null;
		boolean check= true;
		
		while(check) {
			System.out.println("1. 학생  등록");
			System.out.println("2. 학생  입력");
			System.out.println("3. 학생  조회");
			System.out.println("4. 전체  조회");
			System.out.println("5. 프로그램종료");
			
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				
				students=ss.addStudent();
				break;
				
			case 2 :
				break;
			case 3 :
				ss.search(students);
				break;
			case 4 :
				sv.view(students);
				break;
				
			default :
				System.out.println("Finish");
				check=!check;
			}
			
			
		}
	
	}
	
	
	
	

}
