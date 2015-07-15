/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *José Pablo Ortega Grajeda, 14565
 *Interfaz: Radio
 */
public interface Radio {

	void setESTADO(boolean ESTADO);
	/*niega el valor del estado, el cual recibe como parametro, para modificarlo cuando se ejecuta el metodo*/
		
	boolean getEstado();
	/*retorna el valor booleano del estado de la radio, prendido o apagado*/
		
	int getAMFM();
	/*retorna valor 0 para frecuencia modulada y 1 para amplitud modulada*/
		
	void setAMFM(int Band);
	/*modifica el valor de la banda segun su estado actual, el cual recibe como parametro*/
		
	void Sintonizar(boolean uD);
	/*cambia la frecuencia que se esta sintonizando, aumenta o disminuye segun el booleano que recibe como parametro*/
		
	void Guardar(int Pos);
	/*almacena la frecuencia actual en el boton indicado*/
		
	void Memoria(int Pos);
	/*extrae la frecuencia almacenada del boton indicado, y modifica el estado de la radio para sintonizar la frecuencia extraida*/
		
	double getEmisora();
	/*retorna la frecuencia de la emisora en sintonia*/
}


