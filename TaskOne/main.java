
class Main{

    public static void main (String [] args){

    
    Team teamA = new Team("Dependable Octopus");
    teamA.setRank(1);
    teamA.addPlayer("bo");
    System.out.println(teamA);
    
    Team teamB = new Team("Suspicius Fox");
    teamB.setRank(2);
    teamB.addPlayer("jens");
    System.out.println(teamB);
    teamA.setRank(2);

    Team teamC = new Team("Trustworthy Racoon");
    teamC.addPlayer("sylvester");
    teamC.setRank(3);
    System.out.println(teamC);
    
    Team teamD = new Team("David");
    teamD.addPlayer("jacob");
    teamD.setRank(4);
    System.out.println(teamD);
    
    Team teamE = new Team("Angry Snail");
    teamE.addPlayer("jensigen");
    teamE.setRank(5);
    System.out.println(teamE);

    Team teamF = new Team("Hungry Salamander");
    teamE.addPlayer("habibi");
    teamF.setRank(6);
    System.out.println(teamF);

   // for (String x:)
   //  System.out.println(teamA);
    
}
}