package Testat_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Kapital_03_1.Data;
//import Kapital_03_1.Liste;

//Lösung zur Aufgabe 2:

public class Main {

	public static void main(String[] args) {

		// Erzeugen eines Arrays wie in der Aufgabestellung gefordert
		Rational[] arr = { new Rational(-2, 3), new Rational(3, 2), new Rational(-3), new Rational(5, 6),
				new Rational(2), new Rational(8, 12), new Rational(16, -8) };

		// Ausgabe der Feldinhalte
		for (int i = 0; i < arr.length; i++) {
			System.out.println("index " + i + ": " + arr[i]);
		}

		// Feldinhalte Sortiert
		List<Rational> arrayListe = Arrays.asList(arr);
		System.out.println("Liste: " + arrayListe);
		Arrays.sort(arr);
		System.out.println("Sortierte Liste: " + arrayListe);

		// Addition der Feldinhlate als Brüche in for Schleife
		Rational sum = new Rational(0);
		for (int i = 0; i < arr.length; i++) {
			sum = sum.add(arr[i]);
		}
		System.out.println("Summe der Feldinhalte: " + sum);

		// Addition die Kehrwerte der Brüche
		Rational invertSum = new Rational(0);
		for (Rational r : arr) {
			invertSum = invertSum.add(r.invert());
		}
		System.out.println("Summe der invertierenden Zahlen: " + invertSum);
		
		Data aa = new Data(2, "zwei");
		
		Data bb = new Data(2, "zwei");
		
		Data cc = new Data(2, "zwei");
		
		ArrayList<Data> al = new ArrayList<>();
		al.add(aa);
		al.add(bb);
		al.add(cc);
		
//		Liste e = new Liste(al);
		
//		e.toString();
		
		System.out.println();
		
		Rational n = new Rational(10);
		Rational m = new Rational(2);
		
		System.out.println(n.add(m));
		
		

	}

}
