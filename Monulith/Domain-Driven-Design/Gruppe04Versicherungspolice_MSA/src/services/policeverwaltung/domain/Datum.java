package services.policeverwaltung.domain;

import java.util.Objects;

public class Datum {

	private String tag;
	private String monat;
	private String jahr;

	public Datum(String tag, String monat, String jahr) {
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	public String getTag() {
		return tag;
	}

	public String getMonat() {
		return monat;
	}

	public String getJahr() {
		return jahr;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public void setMonat(String monat) {
		this.monat = monat;
	}

	public void setJahr(String jahr) {
		this.jahr = jahr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jahr, monat, tag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datum other = (Datum) obj;
		return Objects.equals(jahr, other.jahr) && Objects.equals(monat, other.monat) && Objects.equals(tag, other.tag);
	}

}
