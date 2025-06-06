package kern.policeverwaltung.aussensicht;
import java.util.Collection;

public interface IPolicenSuchen {
	
	public Collection<PoliceTO> policenSuchenPerAttribut (PoliceTO suchpoliceTO);
	public Collection<PoliceTO> PolicenSuchenPerAttributSuchen (PoliceTO suchpoliceTO);
	
}
