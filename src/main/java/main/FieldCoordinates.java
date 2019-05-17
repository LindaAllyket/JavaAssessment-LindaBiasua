package main;

public class FieldCoordinates {
	
	static int longitude ;
	static int lattitude ;
	String fieldlocation="";
	String description="";
	int current1, curent2;
	
	public String fieldMap(int x, int y) {
		
		longitude = x;
		lattitude = y;
		
		switch(longitude &  lattitude) {
		
			case 0 & 0: {
				fieldlocation = "Starting position";
				description = "You are in the middle of an infinite grey swamp.";
				
				break;
			}
			
			case 1 & 3: {
				fieldlocation = "Grey foggy clouds";
				description = "You are approaching Grey foggy clouds";
				
				break;
			}
			
			
			case 4 & 5: {
				fieldlocation = "Snakes nest";
				description = "snakes sourrounding";
				break;
			}
			
			case 7 & 7: {
				fieldlocation = "Fire den";
				description = "You are on fire";
				break;
			}	
			
			
			case 13 & 9: {
				description = "Treasure! you win! The end!";
				break;
			}	
					
		}
		//longitude += x;
		//lattitude += y;	
		
		System.out.println(description);
		return description;
	}
 

}
