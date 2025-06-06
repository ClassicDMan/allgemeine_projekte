package services.schadensmeldungsverwaltung.domain;

import java.util.Objects;

public class Praemienhoehe {
	double praemiehoehe;

	public Praemienhoehe(double praemiehoehe) {
		this.praemiehoehe = praemiehoehe;
	}

	public double getPraemiehoehe() {
		return praemiehoehe;
	}

	public void setPraemiehoehe(double praemiehoehe) {
		this.praemiehoehe = praemiehoehe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(praemiehoehe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Praemienhoehe other = (Praemienhoehe) obj;
		return Double.doubleToLongBits(praemiehoehe) == Double.doubleToLongBits(other.praemiehoehe);
	}
	
	@Override
	public String toString() {
	    return String.format("%.2f €", this.praemiehoehe);
	}
	
	
	

}
