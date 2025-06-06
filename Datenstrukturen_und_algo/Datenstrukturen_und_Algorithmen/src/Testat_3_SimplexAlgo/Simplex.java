package Testat_3_SimplexAlgo;

//Aufgabe 1

import java.text.DecimalFormat;

/**
 * Die Klasse {@code Simplex} implementiert den Simplex-Algorithmus zur Lösung
 * linearer Programmierprobleme. Die Klasse kann für eine gegebene
 * Koeffizientenmatrix und Kapazitätsbeschränkungen den maximalen oder minimalen
 * Wert der Zielfunktion berechnen.
 * 
 * <p>
 * Die Koeffizientenmatrix {@code a} repräsentiert die Gleichungen und
 * Ungleichungen des linearen Programmierproblems. Die Größe der Matrix wird
 * durch die Anzahl der Ungleichungen {@code m} und die Anzahl der
 * Strukturvariablen {@code n} bestimmt. Der Algorithmus sucht die optimalen
 * Werte für die Strukturvariablen, um den maximalen oder minimalen Wert der
 * Zielfunktion zu erreichen.
 * </p>
 * 
 * <p>
 * Einige Methoden dieser Klasse sind öffentlich zugänglich, während andere als
 * geschützt markiert sind und von Unterklassen verwendet werden können.
 * </p>
 * 
 * <p>
 * Die Klasse verwendet die Random-Klasse für zufällige Entscheidungen, um
 * primäre Entartungen zu vermeiden, und eine einfache Formatierung für die
 * Ausgabe von Ergebnissen.
 * </p>
 * 
 * @author Mustermann
 * @version 1.0
 */
public class Simplex {
	/**
	 * Anzahl der Ungleichungen.
	 */
	protected static int m;
	/**
	 * Anzahl der Strukturvariablen.
	 */
	protected static int n;
	/**
	 * bv Array zur Speicherung der Basisvariablen. nbv Array zur Speicherung der
	 * Nicht-Basisvariablen.
	 */
	protected static int[] bv, nbv;

	// Schlupfvariable = -1, Strukturvariable = 0 .. n-1

	/**
	 * Koeffizientenmatrix für Gleichungen und Ungleichungen.
	 */
	protected static double[][] a; // Koeffizienten
	/**
	 * Dezimalformat für die Ausgabe.
	 */
	protected static DecimalFormat df = new DecimalFormat("####0.00");
	/**
	 * Zufallszahlengenerator zur Vermeidung von Entartungen.
	 */
	protected static java.util.Random random;

	/**
	 * Konstruktor für die Simplex-Klasse.
	 * 
	 * @param m Anzahl der Ungleichungen
	 * @param n Anzahl der Strukturvariablen
	 */
	public Simplex(int m, int n) {
		super();
		Simplex.n = n;
		Simplex.m = m;
		bv = new int[m];
		nbv = new int[n];
		a = new double[m + 1][n + 1];
		random = new java.util.Random();
	}

    /**
     * Die Methode {@code solve} führt den Simplex-Algorithmus aus, um das lineare Optimierungsproblem zu lösen.
     *
     * @param x Ein Array, das die Werte der Strukturvariablen enthält. Die Ergebnisse werden in diesem Array gespeichert.
     * @return Der maximale oder minimale Wert der Zielfunktion.
     * @throws SimplexNoSolutionException Wird ausgelöst, wenn es keine Lösung für das lineare Optimierungsproblem gibt.
     */
	public static double solve(double[] x) throws SimplexNoSolutionException {
		// zu Beginn: Schlupfvariable sind Basisvariable
		for (int i = 0; i < m; i++)
			bv[i] = -1;
		// und Strukturvariable sind Nicht-Basisvariable
		for (int j = 0; j < n; j++)
			nbv[j] = j;
		synchronized (a) {
			try {

				while (true) {
					// Pivot-Spalte bestimmen
					int s = pivotColumn();
					// Pivot-Zeile bestimmen
					int r = pivotRow(s);
					// Koeffizienten umrechnen
					calcCoefficients(r, s);
					// r-te BV tauscht mit s-ter NBV
					swapVariables(r, s);

					for (int i = 0; i <= m; i++) {
						for (int j = 0; j <= n; j++) {

				// das Problem liegt bei der Leere Zeichnen von st, wie wir hier sehen, es gibt
				// nur eine leere Zeichnen, deshalb kriegen wir eine Exception die besagt:
				// java.lang.StringIndexOutOfBoundsException: Range [7, 1) out of bounds for
				// length 1
				// addiere mal mehrere leere Zecihnen und schau mal die Veränderungen die
				// passiere werden
							
//							String st = df.format(a[i][j]);
//							st = " ".substring(st.length());
//							System.out.print(st);
//							System.out.print(" " + df.format(a[i][j]));

//							String st = df.format(a[i][j]);
//							st = "        ".substring(st.length());
//							System.out.print(st);
//							System.out.print(" " + df.format(a[i][j]));
							
							System.out.printf(" %10s", df.format(a[i][j]));
							
						} // of for

						System.out.println();
					} // of for

					System.out.println();
				} // of while

			} // of try

			catch (SimplexFinishedException e) {
			}
			// Suche die Strukturvariablen und kopiere
			// die Werte (in der 0-ten Spalte) in den
			// Vektor x
			int i = 0;
			while (i < m) {
				int j = bv[i];
				if (j >= 0)
					x[j] = a[++i][0];
				else
					i++;
			}
			return a[0][0];
		} // of synchronized
	} // of solve

    /**
     * Die Methode {@code pivotColumn} bestimmt die Pivot-Spalte für den Simplex-Algorithmus.
     *
     * @return Der Index der Pivot-Spalte.
     * @throws SimplexFinishedException Wird ausgelöst, wenn die Lösung gefunden wurde.
     */
	protected static int pivotColumn() throws SimplexFinishedException {
		double min = a[0][1];
		int s = 1;
		for (int j = 2; j <= n; j++)
			if (a[0][j] < min) {
				min = a[0][j];
				s = j;
			}
		// Wenn alle a[0][j] nicht-negativ sind, ist
		// die Loesungngefunden
		if (min >= 0.0)
			throw new SimplexFinishedException();
		return s;
	}// of pivotColumn

    /**
     * Die Methode {@code pivotRow} bestimmt die Pivot-Zeile für den Simplex-Algorithmus.
     *
     * @param s Der Index der Pivot-Spalte.
     * @return Der Index der Pivot-Zeile.
     * @throws SimplexNoSolutionException Wird ausgelöst, wenn es keine Lösung für das lineare Optimierungsproblem gibt.
     */
	protected static int pivotRow(int s) throws SimplexNoSolutionException {
		double min = 0.0;
		int n = 0;
		int[] r = new int[m];
		for (int i = 1; i <= m; i++) {
			double q = a[i][0] / a[i][s];
			if (q > 0.0) {
				if (n == 0 || q < min) {
					min = q;
					n = 1;
					r[0] = i;
				} else if (q == min)
					r[n++] = i;
			}
		}
		// primale Entartung, keine Loesung
		if (n == 0)
			throw new SimplexNoSolutionException();
		// Normalfall
		if (n == 1)
			return r[0];
		// primale Entartung: mehrere Moeglichkeiten,
		// zufaellig waehlen
		int k = 0;
		do {
			k = random.nextInt() % n;
		} while (k < 0);
		return r[k];
	}// of pivotRow

    /**
     * Die Methode {@code calcCoefficients} berechnet die Koeffizienten für die Umrechnung der Pivot-Zeile und Pivot-Spalte.
     *
     * @param r Der Index der Pivot-Zeile.
     * @param s Der Index der Pivot-Spalte.
     */
	protected static void calcCoefficients(int r, int s) {
		// Pivotelement
		a[r][s] = 1.0 / a[r][s];
		// Pivotspalte
		for (int i = 0; i <= m; i++)
			if (i != r)
				a[i][s] *= (-a[r][s]);
		// Pivotzeile
		for (int j = 0; j <= n; j++)
			if (j != s)
				a[r][j] *= a[r][s];

		// andere Elemente
		for (int i = 0; i <= m; i++)
			for (int j = 0; j <= n; j++) {
				if (i != r && j != s)
					a[i][j] += (a[i][s] * a[r][j] / a[r][s]);
			}
	}// of calcCoefficients
	
    /**
     * Die Methode {@code setKoeffizienten} setzt die Koeffizientenmatrix basierend auf den übergebenen Koeffizienten.
     *
     * @param coefficients Die Koeffizientenmatrix.
     */
	protected static void setKoeffizienten(double[][] coefficients) {
	        if (coefficients.length == m + 1 && coefficients[0].length == n + 1) {
	            synchronized (a) {
	                for (int i = 0; i <= m; i++) {
	                    for (int j = 0; j <= n; j++) {
	                        a[i][j] = coefficients[i][j];
	                    }
	                }
	            }
	        } else {
	            System.out.println("Fehler: Die Größe der Koeffizientenmatrix stimmt nicht mit den erwarteten Abmessungen überein.");
	        }
	    }

	  /**
     * Die Methode {@code swapVariables} tauscht die r-te Basisvariable mit der s-ten Nicht-Basisvariable.
     *
     * @param r Der Index der Pivot-Zeile.
     * @param s Der Index der Pivot-Spalte.
     */
	protected static void  swapVariables(int r, int s) {
		// r-te BV tauscht mit s-ter NBV
		r--;
		s--;
		int k = bv[r];
		bv[r] = nbv[s];
		nbv[s] = k;
	}// of swapVariables

}
