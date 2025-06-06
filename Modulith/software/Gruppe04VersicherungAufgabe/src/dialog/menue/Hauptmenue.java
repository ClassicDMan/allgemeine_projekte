package dialog.menue;

import java.util.InputMismatchException;
import java.util.Scanner;

import dialog.policeverwaltung.Policeverwaltung;
import dialog.produktverwaltung.Produktverwaltung;



public class Hauptmenue {
	
	private static Scanner sc = new Scanner(System.in);  
	
	public static void Sart_Dialog ()  {
		
		int auswahl= 0;
	
		
		do  {
			System.out.println("\n\nVersicherungsanwendung - Hauptmenü");
			System.out.println("=========================");
			System.out.println("1 - Policeverwaltung");
			System.out.println("2 - Produktverwaltung");
			System.out.println("3 - ENDE");
			
			try {
				System.out.print("\n Auswahl: "); 
				auswahl = sc.nextInt(); 
			} catch (InputMismatchException e) {auswahl= 0; sc.next();}
			
			switch (auswahl) {
				case 1: Policeverwaltung.Dialog_hauptmenue(); break;
				case 2: Produktverwaltung.Dialog_hauptmenue();; break;
				case 3: System.out.println("... end"); break;
				default: System.out.println("ungültige Eingabe"); 
			}
		}
		while ( auswahl != 3 );
		
		}
}

