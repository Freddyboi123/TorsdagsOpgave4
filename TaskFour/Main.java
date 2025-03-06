import java.util.ArrayList;
class main{
	
	
	
	public static void main(String [] args){
		ArrayList<String> actions = new ArrayList<>();
		actions.add("Start Game");
		actions.add("Resume Game");
		actions.add("Pause Game");
		actions.add("End Game");
		
		
		GameMenu gameMenu = new GameMenu(actions);
		gameMenu.displayMenu();
	}
}