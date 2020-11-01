package LSK;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	String name;
    Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();
    
    public Covid19Pacient(String name, int years) {
		super(name, years);
	}

	public void addSymptom(Symptom p, Integer w){
		symptoms.put(p,w);
	}
	public void showSymptoms(){
		for (Symptom s: symptoms.keySet())
			s.show();
	}
	public void cure(){
		for (Symptom s: symptoms.keySet())
			if(s instanceof Cura) {
				((Cura) s).cure();
			}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Symptom, Integer> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(Map<Symptom, Integer> symptoms) {
		this.symptoms = symptoms;
	}
}