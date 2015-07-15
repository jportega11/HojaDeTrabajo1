/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *José Pablo Ortega Grajeda, 14565
 *Clase: Controlador
 */
public class Controlador implements Radio{
	private boolean estado;
	private int banda;
	private double frecuencia;
	private double[] botones = new double[12];

	public Controlador(){
		estado = true;
		banda = 0;
		frecuencia = 87.9;
		for(int i=0;i<12;i++){
			botones[i] = 87.9;
		}
	}

	/**
	 * @Override
	 * @see Radio#setESTADO(boolean)
	 * @param ESTADO true => encendido false => apagado
	 * @propósito cambiar estado de radio
	 **/
	public void setESTADO(boolean ESTADO) {
		estado = !estado;
	}

	/**
	 * @Override
	 * @see Radio#getEstado()
	 * @return estado true => encendido false => apagado
	 * @propósito devolver estado
	 **/
	public boolean getEstado() {
		return estado;
	}

	/**
	 * @Override
	 * @see Radio#getAMFM()
	 * @return banda 0 => FM 1 => AM
	 * @propósito devolver banda
	 **/
	public int getAMFM() {
		return banda;
	}

	/**
	 * @Override
	 * @see Radio#setAMFM(int)
	 * @param band 0 => FM 1 => AM
	 * @propósito cambiar banda
	 **/
	public void setAMFM(int Band) {
		banda = Band;
		if (Band == 0){
			frecuencia = 87.9;
		}
		if (Band == 1){
			frecuencia = 530;
		}
	}

	/**
	 * @Override
	 * @see Radio#Sintonizar(boolean)
	 * @param uD true => arriba false => abajo
	 * @propósito subir o bajar frecuencia
	 **/
	public void Sintonizar(boolean uD) {
		if (banda == 0){
			if (frecuencia > 87.9 && frecuencia < 107.9){
				if(uD == true){
					frecuencia += 0.2;
				}
				else{
					frecuencia -= 0.2;
				}	
			}
			else if (frecuencia == 87.9){
				if(uD == true){
					frecuencia += 0.2;
				}
				else{
					frecuencia = 107.9;
				}
			}
			else if (frecuencia == 107.9){
				if(uD == false){
					frecuencia -= 0.2;
				}
				else{
					frecuencia = 87.9;
				}
			}
		}
		
		else{
			if(frecuencia > 530 && frecuencia < 1610){
				if(uD == true){
					frecuencia += 10;
				}
				else{
					frecuencia -= 10;
				}	
			}
			else if (frecuencia == 530){
				if(uD == true){
					frecuencia += 10;
				}
				else{
					frecuencia = 1610;
				}
			}
			else if (frecuencia == 1610){
				if(uD == false){
					frecuencia -= 10;
				}
				else{
					frecuencia = 530;
				}
			}
		}
	}

	/**
	 * @Override
	 * @see Radio#Guardar(int)
	 * @param Pos: número de botón en donde guardar la estación
	 * @propósito guardar frecuencia en botón
	 **/
	public void Guardar(int Pos) {
		if (Pos >= 1 && Pos <=12){
			botones[Pos-1] = frecuencia;
		}
	}

	/**
	 * @Override
	 * @see Radio#Memoria(int)
	 * @param Pos: número de botón para sintonizar frecuencia
	 * @propósito obtener frecuencia de botón
	 **/
	public void Memoria(int Pos) {
		if (Pos >= 1 && Pos <=12){
			frecuencia = botones[Pos-1];
		}
		if (frecuencia> 87.9 && frecuencia <107.9){
			banda = 0;
		}
		else{
			banda = 1;
		}
	}

	/**
	 * @Override
	 * @see Radio#getEmisora()
	 * @return frecuencia: frecuencia sintonizada
	 * @propósito devolver frecuencia
	 **/
	public double getEmisora() {
		return frecuencia;
	}
}