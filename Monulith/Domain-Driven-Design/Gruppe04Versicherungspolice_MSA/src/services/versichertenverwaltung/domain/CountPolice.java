package services.versichertenverwaltung.domain;

import java.util.Objects;

public class CountPolice {
	
	int count;

	public CountPolice(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		return Objects.hash(count);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountPolice other = (CountPolice) obj;
		return count == other.count;
	}


	
	
	
	

}
