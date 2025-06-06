package Testat_1;

/**
 * Die Klasse Rational stellt eine Repräsentation von Brüchen dar und ermöglicht
 * die Durchführung von mathematischen Operationen auf Brüchen.
 * Brüche werden als Paar von Ganzzahlen dargestellt: Zähler (Numerator) und Nenner (Denominator).
 * Diese Klasse implementiert das Comparable-Interface und ermöglicht die Verwendung von Brüchen
 * in sortierten Datenstrukturen.
 * 
 * @author RealMadrid
 *
 */

public final class Rational implements Comparable<Rational> {
	
	private final long zaehler;			// Zaehler der rationalen Zahl
	private final long nenner;			// Nenner der rationalen Zahl
	
	/**
	 * Konstruktor für die Initialisierung eines Bruchs mit einem ganzen Zahlwert.
	 * @param number Der Wert des Bruchs als ganze Zahl.
	 */
	public Rational(long number) {
		zaehler = number;
		nenner = 1;
	}
	
	/**
	 * Konstruktor zur Initialisierung eines Bruchs mit Zähler und Nenner.
	 * Der Bruch wird automatisch gekürzt und auf den kleinsten gemeinsamen Teiler reduziert.
	 * @param numerator Der Zähler des Bruchs.
	 * @param denominator Der Nenner des Bruchs (darf nicht 0 sein).
	 * @throws ArithmeticException Wenn der Nenner 0 ist.
	 */
	public Rational(long numerator, long denominator) {				
		
		if(denominator == 0) {
			throw new ArithmeticException("es ist nicht möglich durch 0 zu teilen!!!");
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
	 * Führt eine Addition mit einem anderen Bruch durch und gibt das Ergebnis zurück.
	 * @param other Der Bruch, der addiert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Addition darstellt.
	 */
	
	public Rational add(Rational other) {
		long numeratorNeu = this.zaehler * other.nenner + other.zaehler * this.nenner;		
		long denominatorNeu = this.nenner * other.nenner;
		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * Führt eine Subtraktion mit einem anderen Bruch durch und gibt das Ergebnis zurück.
	 * @param other Der Bruch, der subtrahiert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Subtraktion darstellt.
	 */
	public Rational subtract(Rational other) {
		long numeratorNeu = this.zaehler * other.nenner - other.zaehler * this.nenner;
		long denominatorNeu = this.nenner * other.nenner;

		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * Führt eine Multiplikation mit einem anderen Bruch durch und gibt das Ergebnis zurück.
	 * @param other Der Bruch, mit dem multipliziert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Multiplikation darstellt.
	 */
	public Rational multiply(Rational other) {
		long numeratorNeu = this.zaehler * other.zaehler;
		long denominatorNeu = this.nenner * other.nenner;
		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * Führt eine Division mit einem anderen Bruch durch und gibt das Ergebnis zurück.
	 * @param other Der Bruch, durch den dividiert werden soll.
	 * @return Ein neuer Bruch, der das Ergebnis der Division darstellt.
	 * @throws ArithmeticException Wenn der Nenner des anderen Bruchs 0 ist.
	 */
	public Rational divide(Rational other) {
		if(other.zaehler == 0) {
			throw new ArithmeticException("wir können keinen Zahl durch Null dividieren!!!");
		}
		long numeratorNeu = this.zaehler * other.nenner;
		long denominatorNeu = this.nenner * other.zaehler;
		return new Rational(numeratorNeu, denominatorNeu);
	}
	
	/**
	 * Berechnet den Kehrwert (Inverse) dieses Bruchs und gibt ihn zurück.
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
	 * Gibt den Zähler (Numerator) dieses Bruchs zurück.
	 * @return Der Zähler dieses Bruchs.
	 */
	public long numerator() {
		return zaehler;
	}
	
	/**
	 * Gibt den Nenner (Denominator) dieses Bruchs zurück.
	 * @return Der Nenner dieses Bruchs.
	 */
	public long denominator() {
		return nenner;
	}
	
	/**
	 * Überschreibt die toString-Methode und gibt eine Zeichenfolge dar, die den Bruch repräsentiert.
	 * Wenn der Nenner 1 ist, wird nur der Zähler zurückgegeben.
	 * @return Eine Zeichenfolge, die den Bruch repräsentiert.
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
	 * oder ein Wert größer als 0, wenn dieser Bruch größer ist als der andere Bruch.
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
	 * Überprüft, ob ein Objekt gleich diesem Bruch ist.
	 * Gleichheit bedeutet in diesem Kontext, dass die beiden Brüche denselben Wert haben.
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
	 * Gibt den Wert dieses Bruchs als Gleitkommazahl zurück.
	 * @return Der Wert dieses Bruchs als Gleitkommazahl.
	 */
	public double doubleValue() {
		return (double) zaehler / nenner;
	}
}
