package DIP;
import java.util.HashMap;
import java.util.Map;

public class Afection implements InterfaceAfection{

	@Override
	public double calculateSympomsAfection(Map<sintomak, Integer> sinto) {
		double afection=0;
		int elems = 0;
		//calculate afection
		for (sintomak s:sinto.keySet())
			if (s.getCovidImpact()>50) {
				afection = afection +s.getSeverityIndex()*sinto.get(s);
				elems++;
			}
		if(elems!=0) {
			afection = afection /elems;
		}
		return afection;
	}



}
