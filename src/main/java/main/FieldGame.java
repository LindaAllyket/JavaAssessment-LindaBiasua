package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FieldGame extends Directions{
	//String command;
	String output;
	String command1, Coord, Coord2="0", Coord3, Coord4="0";
	FieldCoordinates fieldcoordinates = new FieldCoordinates();
	
	

	public static void main(String[] args) {
		FieldGame F = new FieldGame();
		System.out.println("******SWAMP FIELD GAME*****");
		System.out.println("++++++++++++++++++++++++++++");
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a command (Start/Pause/Restart/Quit): ");
		String command1 = s.nextLine();
		F.commandGame(command1);	
					
	}
	 

	
	public boolean commandGame(String commandentered) {
		
		String[] commandlist = {"start","pause","restart","quit"};
		
		Map <String,Integer> commandMap = new HashMap<>();
			commandMap.put("",0);
			commandMap.put("start",1);
			commandMap.put("pause",2);
			commandMap.put("restart",3);
			commandMap.put("quit",4);
			
		int command = commandMap.get(commandentered);
		
		 switch (command){
			 case 1:{
				 output = "The Game is on!";
				 break;
			 } 
			 case 2:{
				 output = " Game paused!";
				 break;
			 }
			 case 3:{
				 output = "Restarting Game!";
				 break;
			 }
			 case 4:{
				 output = "Game ended!";
				 break;
			 }
			 case 0:{
				 output = "Enter command!";
				 break;
				 
			 }
			
		 }
		 
		
		if (commandentered.equals("start")) {
			
				System.out.println(output);
				System.out.println("---------:-)--------");
				FieldGame F = new FieldGame();
				
				int n=0;
				int Coord2int;
				int Coord4int ;
				
				
				while (n<5) {
					n++;
					
					Scanner question2 = new Scanner(System.in);
					System.out.println("Do you wish to turn North or South? : " );
					
					
					String Coord = question2.nextLine();
					
					System.out.println("How far " + Coord + " : " );
					String Coord2 = question2.nextLine();
					Coord2int =+ Integer.parseInt(Coord2);
					
					System.out.println("Do you wish to turn East or West? : " );
					String Coord3 = question2.nextLine();
					
					System.out.println("How far " + Coord3 + " : " );		
					String Coord4 = question2.nextLine();
					Coord4int =+ Integer.parseInt(Coord4);
					
					F.PlayerPositionPointer(Coord2int, Coord4int);
					
					 Coord2int =+ Integer.parseInt(Coord2);
					 Coord4int =+ Integer.parseInt(Coord4);
					
					System.out.println("-------------------------------------");
					System.out.println("Please Enter your next coordinates");
						
				}
				
			
		}
		
		return true;
		
		
	} 
	
	public void PlayerPositionPointer(int pointer1, int pointer2) {
		int longi = pointer1;
		int largi = pointer2; 
		fieldcoordinates.fieldMap(longi, largi);
	}
	
	

}


