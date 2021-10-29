import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.Scanner;

public class Logic {

	public String comPlay;
	public String yourPlay;

	public  void game3() throws NoSuchAlgorithmException {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	String a = "1"; 
	String b = "2"; 
	String c = "3"; 
	String off = "0";
	String v = "?";
	int compPoints = 0;
	int yourPoints = 0;
	
	String [] plays = {a, b, c};
	
	boolean quit = false;
	
	int index = 0;
	while(!quit) {
		System.out.println("Available moves: ");
		System.out.println("1 - rock");
		System.out.println("2 - paper");
		System.out.println("3 - scissors");
		System.out.println("0 - Exit");
		System.out.println("? - Help");
		yourPlay = scanner.nextLine();

		index = random.nextInt(3);
		comPlay = plays[index];
		if(yourPlay.equals(off)) {
			System.out.println("Game over");
			System.exit(0);
		}
		if(yourPlay.equals(v)) {
			Table lgk = new Table();
			lgk.table3();
			Logic game3 = new Logic();
			game3.game3();
			
		}
	
		System.out.println("Your move: " + yourPlay + "     Computer move: " + comPlay);
		
		if(yourPlay.equals(comPlay)) {
			System.out.println("Draw");
		
		}else if(yourPlay.equals(a) && comPlay.equals(b)) {
			compPoints++;
			System.out.println("Computer won!");
			
		}else if(yourPlay.equals(b) && comPlay.equals(c)) {
			compPoints++;
			System.out.println("Computer won!");
		}else if(yourPlay.equals(c) && comPlay.equals(a)) {
			compPoints++;
			System.out.println("Computer won!");
		}else if(yourPlay.equals(b) && comPlay.equals(a)) {
			yourPoints++;
			System.out.println("You won!");
		}else if(yourPlay.equals(c) && comPlay.equals(b)) {
			System.out.println("You won!");
			yourPoints++;
		}else if(yourPlay.equals(a) && comPlay.equals(c)) {
			System.out.println("You won!");
			yourPoints++;
		}		
		else {
			System.out.println("Error choosing a digit from 1 to 3");
		}
		System.out.print("Computer: " + compPoints + " points" + " Your: " + yourPoints + " points");
		System.out.println();
		SHA sha = new SHA();
		sha.sha(comPlay);	
		
		SHA key = new SHA();
		key.key(comPlay);
		}

	}	
	
	public  void game5() throws NoSuchAlgorithmException {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String a = "1";
		String b = "2"; 
		String c = "3"; 
		String d = "4"; 
		String e = "5"; 
		String off = "0";
		String v = "?";
		int compPoints = 0;
		int yourPoints = 0;
		String [] plays = {a, b, c, d, e};
		boolean quit = false;
			
		int index = 0;
		while(!quit) {
			System.out.println("Available moves:");
			System.out.println("1 - rock");
			System.out.println("2 - paper");
			System.out.println("3 - scissors");
			System.out.println("4 - lizard");
			System.out.println("5 - Spock");
			System.out.println("0 - Exit");
			System.out.println("? - Help");
			yourPlay = scanner.nextLine();
			
			
			index = random.nextInt(5);
			comPlay = plays[index];
			if(yourPlay.equals(off)) {
				System.out.println("Game over");
				System.exit(0);
			}
			if(yourPlay.equals(v)) {
				Table lgk = new Table();
				lgk.table5();
				Logic game5 = new Logic ();
				game5.game5();
			}
			 if(yourPlay.equals(v)) {
			System.out.println(comPlay);
			}
			System.out.println("Your move: " + yourPlay + "     Computer move: " + comPlay);
			
			if(yourPlay.equals(comPlay)) {
				System.out.println("Draw");
			
			}else if(yourPlay.equals(a) && comPlay.equals(b)|comPlay.equals(c)) {
				compPoints++;
				System.out.println("Computer won!");
			}else if(yourPlay.equals(b) && comPlay.equals(c)| comPlay.equals(d)) {
				compPoints++;
				System.out.println("Computer won!");
			}else if(yourPlay.equals(c) && comPlay.equals(d)| comPlay.equals(e)) {
				compPoints++;
				System.out.println("Computer won!");
			}else if(yourPlay.equals(d) && comPlay.equals(e)| comPlay.equals(a)) {
				System.out.println("Computer won!");
				compPoints++;
			}else if(yourPlay.equals(e) && comPlay.equals(a)| comPlay.equals(b)) {
				System.out.println("Computer won!");
				compPoints++;
			}else if(yourPlay.equals(b) | yourPlay.equals(c) && comPlay.equals(a)) {
				yourPoints++;
				System.out.println("You won!");
			}else if(yourPlay.equals(c) | yourPlay.equals(d) && comPlay.equals(b)) {
				System.out.println("You won!");
				yourPoints++;
			}else if(yourPlay.equals(d) | yourPlay.equals(e) && comPlay.equals(c)) {
				System.out.println("You won!");
				yourPoints++;
			}else if(yourPlay.equals(e) | yourPlay.equals(a) && comPlay.equals(d)) {
				System.out.println("You won!");
				yourPoints++;
			}else if(yourPlay.equals(a) | yourPlay.equals(d) && comPlay.equals(e)) {
				System.out.println("You won!");
				yourPoints++;
			}else {
				System.out.println("Error choosing a digit from 1 to 5");
			}
			
			System.out.print("Computer : " + compPoints + " points" + " Your: " + yourPoints + " points");
			System.out.println();
			
			SHA sha = new SHA();
			sha.sha(comPlay);
			
			SHA key = new SHA();
			key.key(comPlay);
					
		}
		

	}
	
	public  void game7() throws NoSuchAlgorithmException {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	String a = "1";
	String b = "2"; 
	String c = "3"; 
	String d = "4"; 
	String e = "5"; 
	String f = "6"; 
	String g = "7"; 
	String off = "0";
	String v = "?";
	int compPoints = 0;
	int yourPoints = 0;
	String [] plays = {a, b, c, d, e, f, g};
	boolean quit = false;
		
	int index = 0;
	while(!quit) {
		System.out.println("Available moves: ");
		System.out.println("1 - rock");
		System.out.println("2 - paper");
		System.out.println("3 - scissors");
		System.out.println("4 - lizard");
		System.out.println("5  - Spock");
		System.out.println("6");
		System.out.println("7");
		System.out.println("0 - Exit");
		System.out.println("? - Help");
		yourPlay = scanner.nextLine();
				
		index = random.nextInt(7);
		comPlay = plays[index];
		if(yourPlay.equals(off)) {
			System.out.println("Game Over");
			System.exit(0);
		}
		if(yourPlay.equals(v)) {
			Table lgk = new Table();
			lgk.table7();
			Logic game7 = new Logic ();
			game7.game7();
		}
		 if(yourPlay.equals(v)) {
		System.out.println(comPlay);
		}
		System.out.println("Your move: " + yourPlay + "     Computer move: " + comPlay);
		
		if(yourPlay.equals(comPlay)) {
			System.out.println("Draw");
		
		}else if(yourPlay.equals(a) && comPlay.equals(b)|comPlay.equals(c)|comPlay.equals(d)) {
			compPoints++;
			System.out.println("Computer won!");
		}else if(yourPlay.equals(b) && comPlay.equals(c)| comPlay.equals(d)|comPlay.equals(e)) {
			compPoints++;
			System.out.println("Computer won!");
		}else if(yourPlay.equals(c) && comPlay.equals(d)| comPlay.equals(e)|comPlay.equals(f)) {
			compPoints++;
			System.out.println("Computer won!");
		}else if(yourPlay.equals(d) && comPlay.equals(e)| comPlay.equals(f)|comPlay.equals(g)) {
			System.out.println("Computer won!");
			compPoints++;
		}else if(yourPlay.equals(e) && comPlay.equals(f)| comPlay.equals(g)|comPlay.equals(a)) {
			System.out.println("Computer won!");
			compPoints++;
		}else if(yourPlay.equals(f) && comPlay.equals(g)| comPlay.equals(a)|comPlay.equals(b)) {
			System.out.println("Computer won!");
			compPoints++;
		}else if(yourPlay.equals(g) && comPlay.equals(a)| comPlay.equals(b)|comPlay.equals(c)) {
			System.out.println("Computer won!");
			compPoints++;
		}else if(yourPlay.equals(b) | yourPlay.equals(c) | yourPlay.equals(d) && comPlay.equals(a)) {
			yourPoints++;
			System.out.println("You won!");
		}else if(yourPlay.equals(c) | yourPlay.equals(d) | yourPlay.equals(e) && comPlay.equals(b)) {
			System.out.println("You won!");
			yourPoints++;
		}else if(yourPlay.equals(d) | yourPlay.equals(e) | yourPlay.equals(f)  && comPlay.equals(c)) {
			System.out.println("You won!");
			yourPoints++;
		}else if(yourPlay.equals(e) | yourPlay.equals(f) | yourPlay.equals(g) && comPlay.equals(d)) {
			System.out.println("You won!");
			yourPoints++;
		}else if(yourPlay.equals(f) | yourPlay.equals(g) | yourPlay.equals(a) && comPlay.equals(e)) {
			System.out.println("You won!");
			yourPoints++;
		}else if(yourPlay.equals(g) | yourPlay.equals(a) | yourPlay.equals(b) && comPlay.equals(f)) {
			System.out.println("You won!");
			yourPoints++;
		}else if(yourPlay.equals(a) | yourPlay.equals(b) | yourPlay.equals(c) && comPlay.equals(g)) {
			System.out.println("You won!");
			yourPoints++;
		}else {
			System.out.println("Error choosing a digit from 1 to 7");
		}
		
		System.out.print("Computer: " + compPoints + " points" + " Your: " + yourPoints + " points");
		System.out.println();
		
		SHA sha = new SHA();
		sha.sha(comPlay);
		
		SHA key = new SHA();
		key.key(comPlay);
				
			
		}
	

	}
}
