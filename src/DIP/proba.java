package DIP;

import java.util.HashMap;
import java.util.Map;


public class proba {

	public static void main(String[] args) {
		sintomak n = (sintomak) new NeuroMuscularSymptom(51,1,1);
		sintomak c = (sintomak) new CardioVascularSymptom(52,2,2);
		sintomak r = (sintomak) new RespiratorySymptom(53,3,3);
		Map<sintomak,Integer> sintomak = new HashMap<sintomak,Integer>();
		Covid19Pacient covid = new Covid19Pacient("ibon",19);
		covid.addsintomak(n,1);
		covid.addsintomak(c,2);
		covid.addsintomak(r,3);
		InterfaceAfection a = new Afection();
		InterfaceIncrement i = new Increment();
		InterfaceAfection a1 = new Afection1();
		InterfaceIncrement i1 = new Increment1();
		double emaitza = covid.calcCovid19Impact(a, i);
		double emaitza1 = covid.calcCovid19Impact(a1, i1);
		System.out.println(emaitza);
		System.out.println(emaitza1);
	}

}
