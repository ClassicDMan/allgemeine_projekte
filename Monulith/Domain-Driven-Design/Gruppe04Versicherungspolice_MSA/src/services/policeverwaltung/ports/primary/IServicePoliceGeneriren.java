package services.policeverwaltung.ports.primary;

public interface IServicePoliceGeneriren {
	
	public void policeAnlegen(String policenummer, String versicherungsart, String versicherungsbeginnTag, String versicherungsbeginnMonat, String versicherungsbeginnJahr
			, String versicherungsendeTag, String versicherungsendeMonat, String versicherungsendeJahr, String praemienhoehe, String versicherternummer);

}
