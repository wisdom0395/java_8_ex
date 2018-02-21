package com.iu.s2;

import java.util.Scanner;

public class Shef_Steak {

	public Food_Steak makeSteak(int select) {
		/*
		 * Shef_Source s = new Shef_Source();
		 * 
		 * Food_Steak steak = new Food_Steak(); steak.name = ""; steak.price = 40000;
		 * steak.source = s.makeSource(1);
		 */

		// 1. 안심스테이크, 30000원, 1번소스
		// 2. 등심스테이크, 40000원, 2번소스
		// 3. 립스테이크, 50000원, 1번소스

		Food_Steak steak = null;
		Shef_Source shef = new Shef_Source();
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		
		switch (select) {
		case 1:
			//안심스테이크
			steak = new Food_Steak();
			steak.name = "안심";
			steak.price = 30000;
			steak.source = shef.makeSource(1); 
			break;
		case 2:
			break;
		case 3:
			break;

		default:

		}// switch

		return steak;
	}
}
