/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *José Pablo Ortega Grajeda, 14565
 *JUNIT: ControladorTest
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class ControladorTest {


	@Test
	public void testSetESTADO() {
		Controlador tester = new Controlador();
		tester.setESTADO(false);
		assertEquals("El estado apado se representa como false",false,tester.getEstado());
		
	}

	private void assertEquals(String string, boolean b, boolean estado) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testGetEstado() {
		Controlador tester = new Controlador();
		
		if(tester.getEstado()==true || tester.getEstado()==false)
		{
			
		}
		else
		{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testGetAMFM() {
		Controlador tester = new Controlador();
		if(tester.getAMFM()==1 || tester.getAMFM()==0 )
		{
			
		}
			else
		{
			fail("Not yet implemented");
		}
	}

	@Test
	public void testSetAMFM() {
		Controlador tester = new Controlador();
		tester.setAMFM(1);
		assertEquals("El valor 1 representa la banda AM",1,tester.getAMFM());
	}

	@Test
	public void testSintonizar() {
		Controlador tester = new Controlador();
		tester.setAMFM(0);
		tester.Sintonizar(true);
		
		assertEquals("La emisora es FM 88.1", (float)88.1, tester.getEmisora());

	}

	private void assertEquals(String string, float frecuencia, Object sintonizar) {
		// TODO Auto-generated method stub
		
	}


	@Test
	public void testGuardar() {
		Controlador tester = new Controlador();
		tester.setAMFM(0);
		tester.Sintonizar(true);
		tester.Sintonizar(true);
		float frecuencia = tester.getEmisora();
		tester.Guardar(3);
		tester.Memoria(3);
		assertEquals("La emisora en la posicion 3 es 88.3 ",(float)88.3,tester.getEmisora());
		
	}

	@Test
	public void testMemoria() {
		Controlador tester = new Controlador();
		tester.setAMFM(0);
		tester.Sintonizar(true);
		tester.Sintonizar(true);
		float frecuencia = tester.getEmisora();
		tester.Guardar(4);
		tester.Memoria(4);
		assertEquals("La emisora en la posicion 3 es 88.3 ",(float)88.3,tester.getEmisora());
	}

	@Test
	public void testGetEmisora() {
		Controlador tester = new Controlador();
		assertEquals("La emisora FM es 87.9 ",(float)87.9,tester.getEmisora());
	}

}

