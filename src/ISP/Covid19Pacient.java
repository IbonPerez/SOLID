package ISP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}
	Map<sintomak,Integer> sintomak = new HashMap<sintomak,Integer>();
	public void addsintomak(sintomak s, Integer w) {
		sintomak.put(s,w);
	}
	
	double calcCovid19Impact(InterfaceAfection ca, InterfaceIncrement incr) {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		
		afection=ca.calculateSympomsAfection(sintomak);
		//calculate increment
		
		increment=incr.CalcIncrement (this, afection);
		//calculate impact
		impact=afection+increment;
		return impact;
	}
}