import java.util.ArrayList;

class Team{
	private String name;
	private int rank;
	private ArrayList<String> playerNames = new ArrayList<>();

	
	Team(String name){
		this.name = name; 

		
	}

	void setRank(int rank){
		this.rank = rank;
	}
	int getRank(){
		return rank;
	}
	void addPlayer(String player){
		playerNames.add(player);

	}
	@Override
	public String toString(){
		String textBack = "Hold: " + this.name + " Rang: " + rank + "spilere: " + playerNames;
		return textBack;
	}
}