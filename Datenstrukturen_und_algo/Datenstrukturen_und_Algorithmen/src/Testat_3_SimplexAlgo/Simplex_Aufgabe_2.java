package Testat_3_SimplexAlgo;

public class Simplex_Aufgabe_2 {
	/**
	 * Die Klasse {@code Simplex_Aufgabe_2} implementiert den Simplex-Algorithmus zur L�sung linearer Programmierprobleme.
	 * Sie erstellt ein Tableau basierend auf den Koeffizienten der Zielfunktion und den Kapazit�ten
	 * und verwendet den Simplex-Algorithmus, um die optimale L�sung zu finden.
	 *
	 * <p>Die Klasse enth�lt Methoden zur Erstellung des Tableaus und zur L�sung des linearen Optimierungsproblems.</p>
	 *
	 * @author Mustermann
	 * @version 1.0
	 */
		double[][] tableau;
	    private int numRows, numCols;
	    /**
	     * Konstruktor f�r die {@code Simplex_Aufgabe_2}-Klasse.
	     *
	     * @param coefficients Die Koeffizientenmatrix der Zielfunktion.
	     * @param capacities Die Kapazit�tsvektoren.
	     */
	    public Simplex_Aufgabe_2(double[][] coefficients, double[] capacities) {
	        numRows = coefficients.length + 1;
	        numCols = coefficients[0].length + capacities.length + 1;

	        tableau = new double[numRows][numCols];

	        // F�gen Sie die Koeffizienten der Zielfunktion zur ersten Zeile des Tableaus hinzu
	        for (int j = 0; j < coefficients[0].length; j++) {
	            tableau[0][j] = -coefficients[0][j];
	        }

	        // F�gen Sie die Identit�tsmatrix und die Kapazit�tsvektoren zum Tableau hinzu
	        for (int i = 1; i < numRows; i++) {
	            int colOffset = coefficients[i - 1].length; // �nderung hier
	            tableau[i][colOffset + i - 1] = 1;  // Identit�tsmatrix
	            tableau[i][numCols - 1] = capacities[i - 1];  // Kapazit�tsvektor
	        }

	        // F�gen Sie die Koeffizienten der restlichen Zeilen des Tableaus hinzu
	        for (int i = 1; i < numRows; i++) {
	            for (int j = 0; j < coefficients[i - 1].length; j++) { // �nderung hier
	                tableau[i][j] = coefficients[i - 1][j]; // �nderung hier
	            }
	        }
	    }

	    /**
	     * Die Methode {@code solve} f�hrt den Simplex-Algorithmus aus, um das lineare Optimierungsproblem zu l�sen.
	     *
	     * @return Ein Array mit den Werten der optimalen L�sung.
	     */
	    public double[] solve() {
	        // Implementieren Sie den Simplex-Algorithmus hier

	        // Dummy-R�ckgabewert f�r den Moment
	        double[] solution = new double[numCols - 1];
	        for (int i = 0; i < solution.length; i++) {
	            solution[i] = tableau[0][i];
	        }
	        return solution;
	    }

}
