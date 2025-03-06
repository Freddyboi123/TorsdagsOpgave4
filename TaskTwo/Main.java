import java.util.Scanner;

class Main{

    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please state your name");
	
	String input = scanner.nextLine();
	
	System.out.println("Hellow "+ input);
	System.out.println("Please state your age");
	
	int ageInput = scanner.nextInt();
	
	System.out.println("You are " + ageInput + " years old ");
	
	int yearsTilRetierment = 67 - ageInput;
	
	System.out.println("You have " + yearsTilRetierment + " till you can retire :)");
} 
}