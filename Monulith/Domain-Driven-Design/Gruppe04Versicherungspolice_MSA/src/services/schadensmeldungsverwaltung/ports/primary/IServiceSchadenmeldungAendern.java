package services.schadensmeldungsverwaltung.ports.primary;

import java.util.Collection;

public interface IServiceSchadenmeldungAendern {
	public SchadenmeldungTO schadenmeldungPerNummerLiefern(String schadenmeldungnummer);
	public Collection<SchadenmeldungTO> alleSchadenmeldungenAnzeigen();
	public void schadenmeldungAendern(SchadenmeldungTO schadenmeldungTO);
	

}
