package Testat_3_SimplexAlgo;

/**
 * Die Klasse {@code SimplexNoSolutionException} ist eine benutzerdefinierte
 * Ausnahme, die ausgelöst wird, wenn der Simplex-Algorithmus keine Lösung für
 * das lineare Programmierproblem findet.
 *
 * <p>
 * Die Klasse erweitert die allgemeine {@code Exception}-Klasse und enthält eine
 * einfache Meldung, die beim Auftreten der Ausnahme angezeigt wird.
 * </p>
 *
 * @author Mustermann
 * @version 1.0
 */
public class SimplexNoSolutionException extends Exception {

	/**
	 * Die eindeutige Serial Version UID für die Serialisierung.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor für die {@code SimplexNoSolutionException}-Klasse. Gibt eine
	 * Meldung aus, dass keine Lösung für das lineare Programmierproblem gefunden
	 * wurde.
	 */
	public SimplexNoSolutionException() {
		System.out.println("SimplexNoSolutionException");
	}

}
