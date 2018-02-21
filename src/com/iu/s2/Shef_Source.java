package com.iu.s2;

public class Shef_Source {

	//메서드의 헤더부분
	public Food_Source makeSource(int select) 
	//메서드의 바디부분
	{
			
		Food_Source source=null;
		switch(select) {
		case 1:
			//올리브 소스
			source= new Food_Source();
			source.oilName="Olive";
			source.spiceName="Hub";
			break;
		case 2:
			//크림소스
			source = new Food_Source();
			source.oilName="Milk";
			source.spiceName="Cheese";
			break;
		default:
			
		}//switch
		
		/*Food_Source source = new Food_Source();
		source.oilName="Olive";
		source.spiceName="Hub";*/
		
		//oilName ="Milk"
		//spiceName = "Cheese";	
		return source;
		
	}
}



