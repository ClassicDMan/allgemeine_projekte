package Testat_1;

import junit.framework.TestCase;

/**
 * Testet die Klasse <code>Rational</code>
 * 
 * @author Erich Ehses
 */
public class RationalTest extends TestCase {

    /**
     * <code>EPS</code> wird als Genauigkeitsschranke beim Vergleich von
     * Zahlen benutzt.
     */
    private static final double EPS = 1E-12;

    private static final String DIV_ZERO = "Division durch 0 nicht erkannt";

    /**
     * Testet den Konstruktor <code>Rational(zahl)</code>. Achtet auf die
     * Behandlung von positiven, negativen Werten und von 0. Es wird
     * sichergestellt, dass auch richtige long-Zahlen gespeichert werden.
     * <p>
     * Die Methode <code>toString()</code> muss ebenfalls funktionieren.
     */
    public void testSimpleConstruction() {
        Rational r = new Rational(4);
        assertEquals(4, r.numerator());
        assertEquals(1, r.denominator());

        r = new Rational(-4);
        assertEquals(-4, r.numerator());
        assertEquals(1, r.denominator());

        r = new Rational(0);
        assertEquals(0, r.numerator());
        assertEquals(1, r.denominator());

        r = new Rational(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, r.numerator());
        assertEquals(1, r.denominator());
    }

    /**
     * Testet dem Konstruktor <code>Rational(zaehler, nenner)</code>. Es wird
     * besonders auf das richtige Kuerzen geachtet.
     * <p>
     * Die Methode <code>toString()</code> muss ebenfalls funktionieren.
     */
    public void testNormalConstruction() {
        Rational r = new Rational(100, 24);
        assertEquals(25, r.numerator());
        assertEquals(6, r.denominator());

        r = new Rational(-100, -24);
        assertEquals(25, r.numerator());
        assertEquals(6, r.denominator());

        r = new Rational(-100, 24);
        assertEquals(-25, r.numerator());
        assertEquals(6, r.denominator());

        r = new Rational(100, -24);

        assertEquals(-25, r.numerator());
        assertEquals(6, r.denominator());
    }

    /**
     * Testet ob bei einem Konstruktoraufruf mit Zaehler = 0 auch eine
     * <code>ArithmeticException</code> ausgeloest wird.
     */
    public void testIllegalConstruction() {
        try {
            new Rational(10, 0);
            fail(DIV_ZERO);
        } catch (ArithmeticException expected) {
        }

        try {
            new Rational(-10, 0);
            fail(DIV_ZERO);
        } catch (ArithmeticException expected) {
        }
        
        try {
            new Rational(0, 0);
            fail(DIV_ZERO);
        } catch (ArithmeticException expected) {
        }
    }

    /**
     * Testet das richtige Verhalten von equals(). Dazu gehoert auch der
     * Vergleich mit <code>null</code> und mit einem Objekt eines anderen
     * Typs.
     */
    public void testEquals() {
        Rational r1 = new Rational(-2, 3);
        Rational r2 = new Rational(2, 3);
        Rational r3 = new Rational(20, -30);
        assertTrue(r1.equals(r3));
        assertTrue(r3.equals(r1));
        assertFalse(r1.equals(r2));
        assertFalse(r2.equals(r1));
        assertFalse(r1.equals(null));
        assertFalse(r1.equals("-2/3"));
    }

    /**
     * Testet die Addition. Die beteiligten Objekte duerfen nicht
     * veraendert werden.
     */
    public void testAdd() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
        Rational r3 = r1.add(r2);
        assertEquals(new Rational(1, 2), r1);
        assertEquals(new Rational(1, 3), r2);
        assertEquals(new Rational(5, 6), r3);
        

        r1 = new Rational(1, 2);
        r2 = new Rational(2, -4);
        r3 = r1.add(r2);
        assertEquals(new Rational(0), r3);
    }

    /**
     * Testet die Subtraktion. Die beteiligten Objekte duerfen nicht
     * veraendert werden.
     */
    public void testSubtract() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
        Rational r3 = r1.subtract(r2);
        assertEquals(new Rational(1, 2), r1);
        assertEquals(new Rational(1, 3), r2);
        assertEquals(new Rational(1, 6), r3);

        r1 = new Rational(1, 2);
        r2 = new Rational(2, -4);
        r3 = r1.subtract(r2);
        assertEquals(new Rational(1), r3);
    }

    /**
     * Testet die Multiplikation. Die beteiligten Objekte duerfen nicht
     * veraendert werden.
     */
    public void testMultiply() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(2, 3);
        Rational r3 = r1.multiply(r2);
        assertEquals(new Rational(1, 2), r1);
        assertEquals(new Rational(2, 3), r2);
        assertEquals(new Rational(1, 3), r3);

        r1 = new Rational(1, 2);
        r2 = new Rational(2, -4);
        r3 = r1.multiply(r2);
        assertEquals(new Rational(-1, 4), r3);
    }

    /**
     * Testet die Division. Die beteiligten Objekte duerfen nicht
     * veraendert werden.
     * Die Divison durch 0 muss zu einer <code>ArithmeticException</code>
     * fuehren.
     */
    public void testDivide() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 2);
        Rational r3 = r1.divide(r2);
        assertEquals(new Rational(1, 2), r1);
        assertEquals(new Rational(3, 2), r2);
        assertEquals(new Rational(1, 3), r3);

        try {
            r1 = new Rational(1, 2);
            r2 = new Rational(0, -4);
            r3 = r1.divide(r2);
            fail(DIV_ZERO);
        } catch (ArithmeticException expected) {
        }
    }

    /**
     * Testet den Kehrwert. Der Kehrwert von 0 muss eine
     * <code>ArithmeticException</code> erzeugen.
     */
    public void testInvert() {
        assertEquals(new Rational(6, 5), new Rational(5, 6).invert());
        assertEquals(new Rational(-6, 5), new Rational(-5, 6).invert());
        try {
            new Rational(0).invert();
            fail(DIV_ZERO);
        } catch (ArithmeticException expected) {
        }
    }

    /**
     * Testet die Methode <code>doubleValue()</code>, die den Wert des Bruchs
     * als Zahl zurueck gibt.
     */
    public void testValues() {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(-3, 2);
        assertEquals(2. / 3., r1.doubleValue(), EPS);
        assertEquals(-1.5, r2.doubleValue(), EPS);
    }

    /**
     * Testet die richtige Implementierung von <code>compareTo()</code>. Das
     * Ergebnis muss kleiner 0, gleich 0 oder groesser 0 sein, je nachdem ob das
     * linke Objekt (das Empfaengerobjekt) kleiner, gleich oder groesser als das
     * rechte Objekt (das Argument) ist.
     */
    public void testCompareTo() {
        Rational r1 = new Rational(-2, 3);
        Rational r2 = new Rational(2, 3);
        assertTrue("muss < 0 sein", r1.compareTo(r2) < 0);
        assertTrue("muss > 0 sein", r2.compareTo(r1) > 0);
        assertEquals(0, r2.compareTo(new Rational(20, 30)));
    }

    /**
     * Testet toString.
     * Die Ausgabe soll lauten <tt>zaehler/nenner</tt>. Wenn der Nenner
     * gleich 1 ist, wird nur der String-Wert des Zaehlers zurueckgegeben.
     *  
     */
    public void testToString() {
        assertEquals("17", new Rational(17).toString());
        assertEquals("-17", new Rational(-17).toString());
        assertEquals("0", new Rational(0).toString());
        
        assertEquals("2/3", new Rational(-4, -6).toString());
        assertEquals("-2/3", new Rational(4, -6).toString());
    }
    
}