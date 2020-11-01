package ISP;
public class CardioVascularSymptom implements sintomak{ 
	int covidImpact; int severityIndex; int affectedDays;

	public CardioVascularSymptom(int covidImpact, int severityIndex, int afected) {
		super();
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.affectedDays = afected;
	}
	
	public int getaffectedDays() {
		return affectedDays;
	}

	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}

	public double calcCovid19Impact() {
		return this.severityIndex;
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
