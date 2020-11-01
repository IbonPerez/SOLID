package OCP;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Testak {

	@Test
	void testCovid() {
		sintomak n = new NeuroMuscularSymptom(1,1,1);
		sintomak c = new CardioVascularSymptom(2,2,2);
		sintomak r = new RespiratorySymptom(3,3,3);
		Map<sintomak,Integer> sintomak = new HashMap<sintomak,Integer>();
		Covid19Pacient covid = new Covid19Pacient("ibon",19);
		covid.addsintomak(n,1);
		covid.addsintomak(c,2);
		covid.addsintomak(r,3);
		double emaitza = covid.calcCovid19Impact();
		System.out.println(emaitza);
		assertEquals(14,emaitza);
	}
	@Test
	void testEgunak() {
		sintomak n = new NeuroMuscularSymptom(1,1,1);
		sintomak c = new CardioVascularSymptom(2,2,2);
		sintomak r = new RespiratorySymptom(3,3,3);
		Map<sintomak,Integer> sintomak = new HashMap<sintomak,Integer>();
		Covid19Pacient covid = new Covid19Pacient("ibon",19);
		covid.addsintomak(n,1);
		covid.addsintomak(c,2);
		covid.addsintomak(r,3);
		double emaitza = covid.senatedDays();
		System.out.println(emaitza);
		assertEquals(3,emaitza);
	}

}
