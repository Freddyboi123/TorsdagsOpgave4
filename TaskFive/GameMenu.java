import java.util.ArrayList;
import java.util.Scanner;
class GameMenu {
	private  ArrayList<String> actions = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	GameMenu (ArrayList<String> actions){
		// vi har lavet en constructer, der modtager et ArrayList som parameter
		// constructeren løber igennem alle værdier af dette ArrayList og tilføger dem til ArrayListen (actions)
		for (String action: actions){
			this.actions.add(action);
			
			
		}
		
	}
	int getAction(){
		System.out.println("Please type a number to select your option");
		displayMenu();
		int input = scanner.nextInt();
		return input;
	}
	
	void displayMenu(){
		int i = 1;
		for(String actions: actions){
			
			System.out.println(i+ " "+actions);
			i += 1;
		}
		
	}
}