/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Secci�n 30
 *Guillermo Javier de Le�n Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *Jos� Pablo Ortega Grajeda, 14565
 *Interfaz: Radio
 */
public interface Radio {

	void setESTADO(boolean ESTADO);
		
	boolean getEstado();
		
	int getAMFM();
		
	void setAMFM(int Band);
		
	void Sintonizar(boolean uD);
		
	void Guardar(int Pos);
		
	void Memoria(int Pos);
		
	float getEmisora();

}
