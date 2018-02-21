package com.iu.s2;

import java.util.Scanner;

public class Shef_Pasta {
	// 메서드명은 makePasta
	// 1. 크림파스타 15000원 소스는2번
	// 2. 로제파스타 20000원 소스는 1번
	// 3. 알리오올리오 30000원 소스는 1번

	public Food_Pasta makePasta(int select) {
		
		Food_Pasta pasta = new Food_Pasta();
		Shef_Source shef = new Shef_Source();
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		
		switch (select) {
	
		case 1:
			// 크림파스타 만들기
			pasta.name = "크림 파스타";
			pasta.price = 15000;
			pasta.source = shef.makeSource(2);
			break;
		case 2:
			// 로제파스타 만들기
			pasta.name="로제파스타";
			pasta.price=20000;
			pasta.source=shef.makeSource(1);
			break;
		case 3:
			// 알리오올리오 만들기
			pasta.name="알리오올리오";
			pasta.price=30000;
			pasta.source=shef.makeSource(1);
			break;
		default:

		}
		return pasta;
	}
	
}
