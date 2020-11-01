package SRP;

public class Increment {
	public double emaitza;
	public Increment(int adina, double afection) {
		if (adina>65) emaitza=afection*0.5;
		else if(adina>45) emaitza = afection*0.3;
		else emaitza=0;
	}
	
	public double getEmaitza() {
		return emaitza;
	}
}
