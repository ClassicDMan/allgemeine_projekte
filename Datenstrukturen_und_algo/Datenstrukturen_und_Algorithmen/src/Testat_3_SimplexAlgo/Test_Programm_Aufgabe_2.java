package Testat_3_SimplexAlgo;

// Aufgabe 2

/**
 * Die Klasse {@code Test_Programm_Aufgabe_2} ist ein Testprogramm, das den Simplex-Algorithmus verwendet,
 * um ein lineares Optimierungsproblem zu lösen. In diesem Beispiel wird das Problem eines Industrieunternehmens
 * betrachtet, das ein Produkt durch verschiedene Verfahren herstellt, wobei bestimmte Kapazitätsbeschränkungen zu beachten sind.
 *
 * <p>Die Klasse definiert Koeffizientenmatrix und Kapazitätsvektor, instanziiert ein {@code Simplex_Aufgabe_2}-Objekt
 * und ruft die Methode {@code solve()} auf, um die optimale Lösung zu erhalten. Schließlich werden die Ergebnisse
 * auf der Konsole ausgegeben.</p>
 *
 * @author Mustermann
 * @version 1.0
 */
public class Test_Programm_Aufgabe_2 {
	
    /**
     * Der Einstiegspunkt des Testprogramms.
     *
     * @param args Die Befehlszeilenargumente (nicht verwendet in diesem Beispiel).
     */
	public static void main(String[] args) {

		// Definieren Sie die Koeffizientenmatrix der Zielfunktion (in diesem Fall die
		// Produktionszeit X, Y, Z)
		double[][] coefficients = { 
				{ 5, 10, 5 }, // Produktionszeit
				{ -15, -5, -10 }, // Negierter Rohstoffbedarf (da Maximierungsproblem)
				{ -5, -10, -10 } // Negierter Lagerraumbedarf
		};

		// Definieren Sie die Kapazitätsbeschränkungen
		double[] capacities = { -36, -16, -12 };

		// Instanziieren Sie das Simplex-Objekt und lösen Sie das lineare
		// Optimierungsproblem
		Simplex_Aufgabe_2 simplex = new Simplex_Aufgabe_2(coefficients, capacities);
		double[] solution = simplex.solve();

		// Ausgabe der Ergebnisse
		System.out.println("Optimale Lösung:");
		for (int i = 0; i < solution.length; i++) {
			System.out.println("Verfahren " + (i + 1) + ": " + solution[i]);
		}
	}
}
