import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class Game {
	public static String comPlay;
	public static String yourPlay;
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	
		
		boolean quit = false;
		
		while(!quit) {
			System.out.println("Choose an even number greater than 1");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			System.out.println("6");
			System.out.println("7");
			System.out.println("8");
			System.out.println("9");
			yourPlay = scanner.nextLine();
		if(yourPlay.equals("3"))	{			
			Logic game3 = new Logic();
			game3.game3();
		}else if(yourPlay.equals("5")){
			Logic game5 = new Logic ();
			game5.game5();
		}
		else if(yourPlay.equals("7")){
			Logic game7 = new Logic ();
			game7.game7();
		}
		else {
			System.out.println("Error");
		}
		}
	}
}
	



