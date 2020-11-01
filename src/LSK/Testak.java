package LSK;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Testak {

	@Test
	void test() {
		Covid19Pacient covid = new Covid19Pacient("ibon",19);
		Symptom a = new CurableSymptom("a",1,1);
		Symptom b = new CurableSymptom("b",2,2);
		Symptom c = new CurableSymptom("c",3,3);
		Symptom d = new IncurableSymptom("d",4,4);
		covid.addSymptom(a, 1);
		covid.addSymptom(b, 2);
		covid.addSymptom(c, 3);
		covid.addSymptom(d, 4);
		covid.showSymptoms();
		assertTrue(true);
	}
	
	@Test
	void test1() {
		Covid19Pacient covid = new Covid19Pacient("ibon",19);
		Symptom a = new CurableSymptom("a",1,1);
		Symptom b = new CurableSymptom("b",2,2);
		Symptom c = new CurableSymptom("c",3,3);
		Symptom d = new IncurableSymptom("d",4,4);
		covid.addSymptom(a, 1);
		covid.addSymptom(b, 2);
		covid.addSymptom(c, 3);
		covid.addSymptom(d, 4);
		covid.cure();
		assertTrue(true);
	}

}
