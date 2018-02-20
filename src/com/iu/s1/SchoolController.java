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
	Scanner sc = new Scanner(System.in);
	
	select = sc.nextInt;
	
	
	public void start() {
		System.out.println("해당하는 번호를 입력하세요.");
		System.out.println("1.학생등록 2.성적입력 3.성적 조회 4.전체 조회 5.프로그램 종료");
		if(select==1) {
			System.out.println("");
		}
		
	}//start
	

}
