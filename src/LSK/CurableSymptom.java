package LSK;
public class CurableSymptom extends Symptom implements Cura{
	
	public CurableSymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact,severityIndex);
	
	}

	public void cure(){
		System.out.println("treatment applied to: "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
}