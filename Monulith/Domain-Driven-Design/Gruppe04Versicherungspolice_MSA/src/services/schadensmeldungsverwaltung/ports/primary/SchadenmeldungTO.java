package services.schadensmeldungsverwaltung.ports.primary;


public class SchadenmeldungTO {
	String schadennummer;
	String schadenmeldungsTag;
	String schadenmeldungsMonate;
	String schadenmeldungsJahr;
	double schadenshoehe;
	String schadensstatus;
	
	String policenummer;
	
	
	public SchadenmeldungTO(String schadennummer, String schadenmeldungsTag, String schadenmeldungsMonate,
			String schadenmeldungsJahr, double schadenshoehe, String schadensstatus, String policenummer) {
		this.schadennummer = schadennummer;
		this.schadenmeldungsTag = schadenmeldungsTag;
		this.schadenmeldungsMonate = schadenmeldungsMonate;
		this.schadenmeldungsJahr = schadenmeldungsJahr;
		this.schadenshoehe = schadenshoehe;
		this.schadensstatus = schadensstatus;
		
		this.policenummer = policenummer;
	}
	
//	public SchadenmeldungTO(String schadenmeldungsTag, String schadenmeldungsMonate,
//			String schadenmeldungsJahr, double schadenshoehe, String schadensstatus, String policenummer) {
//
//		this.schadenmeldungsTag = schadenmeldungsTag;
//		this.schadenmeldungsMonate = schadenmeldungsMonate;
//		this.schadenmeldungsJahr = schadenmeldungsJahr;
//		this.schadenshoehe = schadenshoehe;
//		this.schadensstatus = schadensstatus;
//		
//		this.policenummer = policenummer;
//	}


	public SchadenmeldungTO() {
		this.policenummer = null;
	}


	public String getSchadennummer() {
		return schadennummer;
	}


	public String getSchadenmeldungsTag() {
		return schadenmeldungsTag;
	}


	public String getSchadenmeldungsMonate() {
		return schadenmeldungsMonate;
	}


	public String getSchadenmeldungsJahr() {
		return schadenmeldungsJahr;
	}


	public double getSchadenshoehe() {
		return schadenshoehe;
	}


	public String getSchadensstatus() {
		return schadensstatus;
	}


	public String getPolicenummer() {
		return policenummer;
	}


	public void setSchadennummer(String schadennummer) {
		this.schadennummer = schadennummer;
	}


	public void setSchadenmeldungsTag(String schadenmeldungsTag) {
		this.schadenmeldungsTag = schadenmeldungsTag;
	}


	public void setSchadenmeldungsMonate(String schadenmeldungsMonate) {
		this.schadenmeldungsMonate = schadenmeldungsMonate;
	}


	public void setSchadenmeldungsJahr(String schadenmeldungsJahr) {
		this.schadenmeldungsJahr = schadenmeldungsJahr;
	}


	public void setSchadenshoehe(double schadenshoehe) {
		this.schadenshoehe = schadenshoehe;
	}


	public void setSchadensstatus(String schadensstatus) {
		this.schadensstatus = schadensstatus;
	}


	public void setPolicenummer(String policenummer) {
		this.policenummer = policenummer;
	}
	
	

}
