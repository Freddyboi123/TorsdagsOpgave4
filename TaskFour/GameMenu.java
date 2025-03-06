import java.util.ArrayList;
class GameMenu {
	private  ArrayList<String> actions = new ArrayList<>();
	
	GameMenu (ArrayList<String> actions){
		// vi har lavet en constructer, der modtager et ArrayList som parameter
		// constructeren løber igennem alle værdier af dette ArrayList og tilføger dem til ArrayListen (actions)
		for (String action: actions){
			this.actions.add(action);
			
		}
		
	}
	void displayMenu(){
		for(String actions: actions){
			System.out.println(actions);
			
		}
		
	}
}