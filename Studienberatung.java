import java.util.*;

public class Studienberatung {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//hast-du-abitur
		System.out.println("Hast du Abitur?");
		String answer = scanner.next();
		
		//hast-du-fachabitur
		if (answer.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			answer = scanner.next();

			//nicht-studieren
			if (answer.equalsIgnoreCase("n")){
				System.out.println("Nicht studieren");
				break;
			}
			//hast-du-berufsausbildung
			else if (answer.equalsIgnoreCase("j")){
				System.out.println("Hast du eine Berufsausbildung?");
				answer = scanner.next();

		}
		//bist-bu-wiisbegierig
		else if (answer.equalsIgnoreCase("j")) {
			System.out.println("Bist du wissbegierig?");
			answer = scanner.next();
			
			//nicht-studieren
			if (answer.equalsIgnoreCase("j")){
				System.out.println("Auf jeden Fall studieren");
				break;
		}
		
	}
	
	
}