package Testat_3_SimplexAlgo;

/**
 * Die Klasse {@code SimplexFinishedException} ist eine benutzerdefinierte
 * Ausnahme, die ausgel�st wird, wenn der Simplex-Algorithmus abgeschlossen ist
 * und keine weiteren Iterationen durchgef�hrt werden k�nnen.
 *
 * <p>
 * Die Klasse erweitert die allgemeine {@code Exception}-Klasse und enth�lt eine
 * einfache Meldung, die beim Auftreten der Ausnahme angezeigt wird.
 * </p>
 *
 * @author Mustermann
 * @version 1.0
 */
public class SimplexFinishedException extends Exception {

	/**
	 * Die eindeutige Serial Version UID f�r die Serialisierung.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Konstruktor f�r die {@code SimplexFinishedException}-Klasse. Gibt eine
	 * Meldung aus, dass der Simplex-Algorithmus abgeschlossen ist.
	 */
	public SimplexFinishedException() {
		System.out.println("SimplexFinishedException: Alghoritmus ist zum Ende\n");
	}

}
