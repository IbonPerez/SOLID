package DIP;

public class Increment implements InterfaceIncrement{

	@Override
	public double CalcIncrement(Covid19Pacient pacient, double afection) {
		if (pacient.getYears()>65) return afection*0.5;
		else if(pacient.getYears()>45) return afection*0.3;
		else return 0;
	}

}
