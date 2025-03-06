import java.util.ArrayList;
import java.util.Scanner;
class main{
	
	
	
	public static void main(String [] args){
		ArrayList<String> actions = new ArrayList<>();
		actions.add("Start Game");
		actions.add("Resume Game");
		actions.add("Pause Game");
		actions.add("End Game");
		
		
		GameMenu gameMenu = new GameMenu(actions);
		int answer = gameMenu.getAction();
		doAction(answer);
		
	}
	
	public static void doAction(int action){
		String respons;
		switch (action){
			case 1: 
			System.out.println("Starting the game now");
			break; 
			
			case 2:
			System.out.println("Fetching previously saved game data");
			break; 
			
			case 3:
			System.out.println("Game Paused");
			break;
			
			case 4:
			System.out.println("Ending Game");
			break;
			default:
		
	}
}
}