package DIP;
public class NeuroMuscularSymptom implements sintomak{ 
int covidImpact; int severityIndex; int affectedDays;
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
public NeuroMuscularSymptom(int covidImpact, int severityIndex, int afected) {
	super();
	this.covidImpact = covidImpact;
	this.severityIndex = severityIndex;
	this.affectedDays = afected;
}
public int getaffectedDays() {
	return affectedDays;
}
public void setaffectedDays(int affectedDays) {
	this.affectedDays = affectedDays;
}
@Override
public double calcCovid19Impact() {
	return this.severityIndex;
}


}