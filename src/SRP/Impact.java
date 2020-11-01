package SRP;

public class Impact {
	public double emaitza;
	public Impact(double afection, double increment, int adina) {
		if(adina>10) {
			emaitza=increment+afection;
		}else {
			this.emaitza=0;
		}
	}
	
	public double getEmaitza() {
		return this.emaitza;
	}
}
