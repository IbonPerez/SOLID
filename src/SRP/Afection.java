package SRP;
import java.util.HashMap;
import java.util.Map;

public class Afection {
	public double afection;

	public Afection(Map<sintomak, Integer> sinto) {
		this.afection=0;
		int elems = 0;
		//calculate afection
		for (sintomak s:sinto.keySet())
			if (s.getCovidImpact()>50) {
				afection = afection +s.getSeverityIndex()*sinto.get(s);
				elems++;
			}
		if(elems!=0) {
			this.afection = this.afection /elems;
		}
	}

	public double getAfection() {
		return this.afection;
	}
}
