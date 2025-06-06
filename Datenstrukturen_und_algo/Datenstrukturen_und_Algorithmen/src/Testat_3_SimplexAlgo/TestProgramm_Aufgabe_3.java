package Testat_3_SimplexAlgo;

/**
 * Die Klasse {@code TestProgramm_Aufgabe_3} ist ein Testprogramm, das den Simplex-Algorithmus verwendet,
 * um lineare Optimierungsprobleme zu lösen. In diesem Beispiel werden verschiedene lineare Programme betrachtet.
 *
 * <p>Die Klasse instanziiert ein {@code Simplex}-Objekt, definiert die Koeffizientenmatrix und Kapazitätsvektoren
 * für verschiedene lineare Programme und ruft die Methode {@code solve()} auf, um die optimale Lösung zu erhalten.
 * Die Ergebnisse werden auf der Konsole ausgegeben.</p>
 *
 * @author Mustermann
 * @version 1.0
 */
public class TestProgramm_Aufgabe_3 extends Simplex {

    /**
     * Konstruktor für die {@code TestProgramm_Aufgabe_3}-Klasse.
     *
     * @param m Die Anzahl der Ungleichungen.
     * @param n Die Anzahl der Strukturvariablen.
     */
	public TestProgramm_Aufgabe_3(int m, int n) {
		super(m, n);
		// TODO Auto-generated constructor stub
	}

    /**
     * Der Einstiegspunkt des Testprogramms.
     *
     * @param args Die Befehlszeilenargumente (nicht verwendet in diesem Beispiel).
     */
	public static void main(String[] args) {
		Simplex s;
		double[] x;
		/**
		 * wir haben 4 Fälle, in dem wir betrachten müssen, so die Anzahl der
		 * Spalten und Zeilen müssen zuerst richtig notiert werden 
		 * Simplex( anzahl der Ungleichungen, anzahl der Strukturvariablen )
		 */
		
//		Aufgabe a)
		
//		s = new Simplex(3, 4);
//		
//		a[0][0] = 0;
//		a[0][1] = - 100;
//		a[0][2] = - 130;
//		a[0][3] = - 100;
//		a[0][4] = - 110;
//				
//		a[1][0] = 440;
//		a[1][1] = 6;
//		a[1][2] = 4;
//		a[1][3] = 3;
//		a[1][4] = 5;
//		
//		a[2][0] = 460;
//		a[2][1] = 3;
//		a[2][2] = 1;
//		a[2][3] = 3;
//		a[2][4] = 2;
//		
//		a[3][0] = 555;
//		a[3][1] = 6;
//		a[3][2] = 5;
//		a[3][3] = 4;
//		a[3][4] = 3;
		
		
//		Aufgabe b)
		
//		s = new Simplex(3, 6);	
//	
//		a[0][0] = 0;
//		a[0][1] = - 10;
//		a[0][2] = - 15;
//		a[0][3] = - 10;
//		a[0][4] = - 20;
//		a[0][5] = - 10;
//		a[0][6] = - 15;
//				
//		a[1][0] = 300;
//		a[1][1] = 20;
//		a[1][2] = 10;
//		a[1][3] = 40;
//		a[1][4] = 0;
//		a[1][5] = 20;
//		a[1][6] = 0;
//		
//		a[2][0] = 280;
//		a[2][1] = 0;
//		a[2][2] = 20;
//		a[2][3] = 20;
//		a[2][4] = 20;
//		a[2][5] = 10;
//		a[2][6] = 20;
//		
//		a[3][0] = 400;
//		a[3][1] = 10;
//		a[3][2] = 0;
//		a[3][3] = 0;
//		a[3][4] = 40;
//		a[3][5] = 0;
//		a[3][6] = 20;
		
		
//		Aufgabe c)
		
//		s = new Simplex(4, 4);	
//		
//		a[0][0] = 0;
//		a[0][1] = - 5;
//		a[0][2] = - 4;
//		a[0][3] = - 7;
//				
//		a[1][0] = 11;
//		a[1][1] = 2;
//		a[1][2] = 2;
//		a[1][3] = 1;
//
//		
//		a[2][0] = 17;
//		a[2][1] = 1;
//		a[2][2] = 6;
//		a[2][3] = 2;
//
//		
//		a[3][0] = 8;
//		a[3][1] = 0;
//		a[3][2] = 0;
//		a[3][3] = 3;
//		
//		a[4][0] = 12;
//		a[4][1] = 3;
//		a[4][2] = 2;
//		a[4][3] = 0;
		
//		Aufgabe d		noch nicht gelöst
		
		
		// Aufgabe Seite 150 Folien Kap. 4
		
		s = new Simplex(3, 3);
		
		a[0][0] = 0;
		a[0][1] = -15;
		a[0][2] = -20;
		a[0][3] = -15;
		
		a[1][0] = 800;
		a[1][1] = 5;
		a[1][2] = 10;
		a[1][3] = 5;
		
		a[2][0] = 700;
		a[2][1] = 15;
		a[2][2] = 5;
		a[2][3] = 10;
		
		a[3][0] = 600;
		a[3][1] = 5;
		a[3][2] = 10;
		a[3][3] = 10;
		
		System.out.println();
		System.out.println("m: " + Integer.toString(m));
		System.out.println("n: " + Integer.toString(n));

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {

//				String st = df.format(a[i][j]);
//				st = "        ".substring(st.length());
//				System.out.print(st);
//				System.out.print(" " + df.format(a[i][j]));

				System.out.printf(" %10s", df.format(a[i][j])); // anstatt die o.g 4 Zeilen
				
			}
			System.out.println();
		}
		System.out.println();
		try {
			x = new double[n];
			double max;
			max = Simplex.solve(x);
			System.out.println("ZMAX = " + df.format(max));
			for (int j = 0; j < n; j++)
				System.out.println("x[" + (j + 1) + "]=" + df.format(x[j]));
		} catch (Throwable e) {
			System.out.println(e);
		}
	}
}
