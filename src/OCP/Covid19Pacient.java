package OCP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	
	public Covid19Pacient(String name, int years) {
		super(name, years);
		// TODO Auto-generated constructor stub
	}
	
	Map<sintomak,Integer> sintomak = new HashMap<sintomak,Integer>();
	public void addsintomak(sintomak s, Integer w) {
		sintomak.put(s,w);
	}
//	Map<CardioVascularSymptom,Integer> cardios=new HashMap<CardioVascularSymptom,Integer>();
//	Map<NeuroMuscularSymptom,Integer> neuros=new HashMap<NeuroMuscularSymptom,Integer>();
//	Map<RespiratorySymptom,Integer> respirs=new HashMap<RespiratorySymptom,Integer>();
//	public void addCardioSymptom(CardioVascularSymptom c, Integer w){
//		cardios.put(c,w);
//	}
//	public void addNeuroMuscularSymptom(NeuroMuscularSymptom nm, Integer w){
//		neuros.put(nm,w);
//	}
//	public void addRespiratorySymptom (RespiratorySymptom r, Integer w){
//		respirs.put(r,w);
//	}
	
	int senatedDays() {
		int max = 0;
		for (sintomak s:sintomak.keySet())
			if (s.getaffectedDays()>max) {
				max=s.getaffectedDays();
			}
		return max;
	}
	
	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		int elems = 0;
		//calculate afection
		for (sintomak s:sintomak.keySet())
			afection = afection +s.getSeverityIndex()*sintomak.get(s);
			elems++;
			afection = afection /elems;
		
//		for (CardioVascularSymptom c:cardios.keySet())
//			afection=afection+c.getSeverityIndex()*cardios.get(c);
//		for (NeuroMuscularSymptom c:neuros.keySet())
//			afection=afection+c.getSeverityIndex()*cardios.get(c);
//		for (RespiratorySymptom c:respirs.keySet())
//			afection=afection+c.getSeverityIndex()*cardios.get(c);
//		afection=afection/(cardios.size()+neuros.size()+respirs.size());
		//calculate increment
		if (getYears()>65) increment=afection*0.5;
		//calculate impact
		impact=afection+increment;
		return impact;
	}
}