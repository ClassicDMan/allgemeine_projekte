package services.policeverwaltung.domain;

import java.util.Objects;

public class Praeminehoehe {

	private String praemienhoehe;

	public String getPraemienhoehe() {
		return praemienhoehe;

	}
	
	

	public Praeminehoehe(String praemienhoehe) {
		this.praemienhoehe = praemienhoehe;
	}



	@Override
	public int hashCode() {
		return Objects.hash(praemienhoehe);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Praeminehoehe other = (Praeminehoehe) obj;
		return Objects.equals(praemienhoehe, other.praemienhoehe);
	}

	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Praeminehoehe other = (Praeminehoehe) obj;
//		return Double.doubleToLongBits(praemienhoehe) == Double.doubleToLongBits(other.praemienhoehe);
//	}
	
	

}
