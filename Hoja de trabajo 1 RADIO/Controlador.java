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
	private float frecuencia;
	private float[] botones = new float[12];
	
	public Controlador(){
		estado = true;
		banda = 0;
		frecuencia = (float) 87.9;
		for(int i=0;i<12;i++){
			botones[i] = (float) 87.9;
		}
	}

	@Override
	public void setESTADO(boolean ESTADO) {
		estado = !estado;
	}

	@Override
	public boolean getEstado() {
		return estado;
	}

	@Override
	public int getAMFM() {
		return banda;
	}

	@Override
	public void setAMFM(int Band) {
		banda = Band;
		if (Band == 0){
			frecuencia = (float) 87.9;
		}
		if (Band == 1){
			frecuencia = 530;
		}
	}

	@Override
	public void Sintonizar(boolean uD) {
		if (banda == 0){
			if (frecuencia > (float) 87.9 && frecuencia < (float) 107.9){
				if(uD == true){
					frecuencia += 0.2;
				}
				else{
					frecuencia -= 0.2;
				}	
			}
			else if (frecuencia == (float) 87.9){
				if(uD == true){
					frecuencia += 0.2;
				}
				else{
					frecuencia = (float) 107.9;
				}
			}
			else if (frecuencia == (float) 107.9){
				if(uD == false){
					frecuencia -= 0.2;
				}
				else{
					frecuencia = (float) 87.9;
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

	@Override
	public void Guardar(int Pos) {
		if (Pos >= 1 && Pos <=12){
			botones[Pos-1] = frecuencia;
		}
	}

	@Override
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

	@Override
	public float getEmisora() {
		return frecuencia;
	}
}