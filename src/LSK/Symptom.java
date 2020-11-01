package LSK;
public class Symptom{
	public Symptom(String name,int covidImpact, int severityIndex) {
		super();
		this.name=name;
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
	}
	String name;
	int covidImpact; 
	int severityIndex;
	
	public void show(){
		System.out.println("symptom value :"+name+"severityIndex :"+ severityIndex+" covidImpact:"+covidImpact);
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