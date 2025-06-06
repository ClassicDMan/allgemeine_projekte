package persistence.versichertenverwaltung.aussensicht;

import java.util.Collection;

import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;

public interface IVersichertenverwaltungDAO {

	public Collection<VersichertendatenTO> alleVersichertendatenAnzeigen();

	public VersichertendatenTO versichertendatenSuchenPerNummer(int versichertennummer);
//    Collection<VersichertendatenTO> versichertendatenSuchenPerAttribut(VersichertendatenTO versichertendatenTO);

}
