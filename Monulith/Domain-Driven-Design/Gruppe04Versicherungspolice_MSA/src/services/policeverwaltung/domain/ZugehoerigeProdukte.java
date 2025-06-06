package services.policeverwaltung.domain;

import java.util.ArrayList;
import java.util.List;

public class ZugehoerigeProdukte {

	List<ZugehoerigeProdukte> produkte = new ArrayList<ZugehoerigeProdukte>();

	public List<ZugehoerigeProdukte> getProdukte() {
		return produkte;
	}

	public void setProdukte(List<ZugehoerigeProdukte> produkte) {
		this.produkte = produkte;
	}

}
