/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *Edwin Fernando Coronado Roche, 14148
 *José Pablo Ortega Grajeda, 14565
 *Clase: Driver
 */
import java.util.Scanner;


public class Driver {
	
	public static void main(String[] args){
		
		Radio radio = new Controlador();
		Scanner sc = new Scanner(System.in);
		int o1,o2;
		while(radio.getEstado()==true){
			System.out.println("***************RADIO****************");
			System.out.println("");
			System.out.println("ESTADO ACTUAL: ");
			if (radio.getEstado())
				System.out.println("- Encendido");
			else
				System.out.println("- Apagado");
			if (radio.getAMFM()==1)
				System.out.println("- AM");
			else 
				System.out.println("- FM");
			System.out.println("- Sintonizando: "+ radio.getEmisora());
			System.out.println("_____________________________________");
			System.out.println("Menu: ");
			System.out.println("1. Apagar/prinder");
			System.out.println("2. AM/FM");
			System.out.println("3. Modificar Frecuencia");
			System.out.println("4. Guardar Frecuencia Actual");
			System.out.println("5. Cargar Estacion guardada");
			o1 = sc.nextInt();
			if (o1==1){
				radio.setESTADO(radio.getEstado());
				System.out.println("Radio Apagado");
			}
			else if (o1==2){
				int f = radio.getAMFM();
				if (f==0)
					f=1;
				else
					f=0;
				radio.setAMFM(f);
			}
			else if (o1==3){
				System.out.println("1. Bajar frecuencia \n2. Subir frecuencia");
				o2 = sc.nextInt();
				if (o2==1){
					radio.Sintonizar(false);
				}
				else{
					radio.Sintonizar(true);
				}
			}
			else if (o1==4){
				System.out.println("Ingrese un número de boton para almacenar la frecuencia");
				System.out.println("1,2,3,4,5,6,7,8,9,10,11,12");
				o2=sc.nextInt();
				if(o2>0 && o2<13){
					radio.Guardar(o2-1);
				}
			}
			else{
				System.out.println("Ingrese un número de boton para cambiar la frecuencia");
				System.out.println("1,2,3,4,5,6,7,8,9,10,11,12");
				o2=sc.nextInt();
				if(o2>0 && o2<13){
					radio.Memoria(o2-1);
				}
			}
		}
	}

}