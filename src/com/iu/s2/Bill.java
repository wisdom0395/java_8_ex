package com.iu.s2;

public class Bill {

	//영수증
	//2개 (스테이크, 파스타)
	
	//Steak
	public void billSteak(Food_Steak steak) {
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilName);
		System.out.println(steak.source.spiceName);
		
		
	}
	
	//Pasta
	public void billPasta(Food_Pasta pasta) {
		System.out.println(pasta.name);
		System.out.println(pasta.price);
		System.out.println(pasta.source.oilName);
		System.out.println(pasta.source.spiceName);
		
		
	}
}
