package Testat_1;

/**
 * Die Klasse Rational stellt eine Repr�sentation von Br�chen dar und erm�glicht
 * die Durchf�hrung von mathematischen Operationen auf Br�chen.
 * Br�che werden als Paar von Ganzzahlen dargestellt: Z�hler (Numerator) und Nenner (Denominator).
 * Diese Klasse implementiert das Comparable-Interface und erm�glicht die Verwendung von Br�chen
 * in sortierten Datenstrukturen.
 * 
 * @author RealMadrid
 *
 */

public final class Rational implements Comparable<Rational> {
	
	private final long zaehler;			// Zaehler der rationalen Zahl
	private final long nenner;			// Nenner der rationalen Zahl
	
	/**
	 * Konstruktor f�r die Initialisierung eines Bruchs mit einem ganzen Zahlwert.
	 * @param number Der Wert des Bruchs als ganze Zahl.
	 */
	public Rational(long number) {
		zaehler = number;
		nenner = 1;
	}
	
	/**
	 * Konstruktor zur Initialisierung eines Bruchs mit Z�hler und Nenner.
	 * Der Bruch wird automatisch gek�rzt und auf den kleinsten gemeinsamen Teiler reduziert.
	 * @param numerator Der Z�hler des Bruchs.
	 * @param denominator Der Nenner des Bruchs (darf nicht 0 sein).
	 * @throws ArithmeticException Wenn der Nenner 0 ist.
	 */
	public Rational(long numerator, long denominator) {				
		
		if(denominator == 0) {
			throw new ArithmeticException("es ist nicht m�glich durch 0 zu teilen!!!");
		}
		long g = gcd(numerator, denominator);
		numerator /= g;
		denominator /= g;
		 if (denominator < 0) {
	            numerator = -numerator;
	            denominator = -denominator;
	        }
		this.zaehler = numerator;
		this.nenner = denominator;
	}

	/**
	 * Berechnet den groessten gemeinsamen Teiler zweier positiver Zahlen.
	 * 
	 * @param a 1. Zahl.
	 * @param b 2. Zahl.
	 * @return groesster gemeinsamer Teiler.
	 */
	private static long gcd(long a, long b) {
		while (b != 0) {
			long t = a % b;
			a = b;
			b = t;
		}
		return a;
	}
	
	/**
	 * F�hrt eine Addition mit einem anderen Bruch durch und gibt das Ergebnis zur�ck.
	 * @param other Der Bruch, der addiert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Addition darstellt.
	 */
	
	public Rational add(Rational other) {
		long numeratorNeu = this.zaehler * other.nenner + other.zaehler * this.nenner;		
		long denominatorNeu = this.nenner * other.nenner;
		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * F�hrt eine Subtraktion mit einem anderen Bruch durch und gibt das Ergebnis zur�ck.
	 * @param other Der Bruch, der subtrahiert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Subtraktion darstellt.
	 */
	public Rational subtract(Rational other) {
		long numeratorNeu = this.zaehler * other.nenner - other.zaehler * this.nenner;
		long denominatorNeu = this.nenner * other.nenner;

		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * F�hrt eine Multiplikation mit einem anderen Bruch durch und gibt das Ergebnis zur�ck.
	 * @param other Der Bruch, mit dem multipliziert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Multiplikation darstellt.
	 */
	public Rational multiply(Rational other) {
		long numeratorNeu = this.zaehler * other.zaehler;
		long denominatorNeu = this.nenner * other.nenner;
		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * F�hrt eine Division mit einem anderen Bruch durch und gibt das Ergebnis zur�ck.
	 * @param other Der Bruch, durch den dividiert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Division darstellt.
	 * @throws ArithmeticException Wenn der Nenner des anderen Bruchs 0 ist.
	 */
	public Rational divide(Rational other) {
		if(other.zaehler == 0) {
			throw new ArithmeticException("wir k�nnen keinen Zahl durch Null dividieren!!!");
		}
		long numeratorNeu = this.zaehler * other.nenner;
		long denominatorNeu = this.nenner * other.zaehler;
		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * Berechnet den Kehrwert (Inverse) dieses Bruchs und gibt ihn zur�ck.
	 * @return Der Kehrwert dieses Bruchs.
	 * @throws ArithmeticException Wenn der Bruch 0 ist.
	 */
	public Rational invert() {
		if(zaehler == 0) {
			throw new ArithmeticException("zahler gleich 0 ist nicht definiert");
		}
		return new Rational(nenner, zaehler);
	}
	
	/**
	 * Gibt den Z�hler (Numerator) dieses Bruchs zur�ck.
	 * @return Der Z�hler dieses Bruchs.
	 */
	public long numerator() {
		return zaehler;
	}
	
	/**
	 * Gibt den Nenner (Denominator) dieses Bruchs zur�ck.
	 * @return Der Nenner dieses Bruchs.
	 */
	public long denominator() {
		return nenner;
	}
	
	/**
	 * �berschreibt die toString-Methode und gibt eine Zeichenfolge dar, die den Bruch repr�sentiert.
	 * Wenn der Nenner 1 ist, wird nur der Z�hler zur�ckgegeben.
	 * @return Eine Zeichenfolge, die den Bruch repr�sentiert.
	 */
	public String toString() {		
		if(nenner == 1) {
			return Long.toString(zaehler);
		}
		return zaehler + "/" + nenner;
	}
	
	/**
	 * Implementiert die compareTo-Methode des Comparable-Interfaces.
	 * Vergleicht diesen Bruch mit einem anderen Bruch.
	 * @param other Der andere Bruch, mit dem verglichen wird.
	 * @return Ein Wert kleiner als 0, wenn dieser Bruch kleiner ist, 0 bei Gleichheit,
	 * oder ein Wert gr��er als 0, wenn dieser Bruch gr��er ist als der andere Bruch.
	 */
	public int compareTo(Rational other) {				
		long difference = this.zaehler * other.nenner - other.zaehler * this.nenner;
        if (difference < 0) {
            return -1;
        } else if (difference > 0) {
            return 1;
        }
        return 0;
	}
	
	/**
	 * �berpr�ft, ob ein Objekt gleich diesem Bruch ist.
	 * Gleichheit bedeutet in diesem Kontext, dass die beiden Br�che denselben Wert haben.
	 * @param other Das Objekt, das mit diesem Bruch verglichen wird.
	 * @return true, wenn das Objekt gleich diesem Bruch ist, andernfalls false.
	 */
	public boolean equals(Object other) {
		if (!(other instanceof Rational))
			return false;
		
		if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Rational rational = (Rational) other;
        return zaehler == rational.zaehler && nenner == rational.nenner;
		
	}
	
	/**
	 * Gibt den Wert dieses Bruchs als Gleitkommazahl zur�ck.
	 * @return Der Wert dieses Bruchs als Gleitkommazahl.
	 */
	public double doubleValue() {
		return (double) zaehler / nenner;
	}
}
