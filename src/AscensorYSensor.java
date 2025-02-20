

/*
 *Combina las dos simulaciones anteriores. El programa debe simular un ascensor que lleva al
 *usuario a un piso deseado. Antes de moverse, el programa verifica si la temperatura ambiente
 *está dentro del rango aceptable. Si la temperatura está dentro del rango, el ascensor se mueve
 *al piso deseado. Si la temperatura está fuera del rango, muestra un mensaje de que la
 *temperatura no es adecuada y no permite el movimiento del ascensor.
  * */

import java.util.Scanner;

public class AscensorYSensor extends Proceso {
	
	private Scanner scanner;
	
	public AscensorYSensor(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void iniciarProceso() {
		pedirDatos();
		
	}

	
	public void pedirDatos() {
		System.out.println("Ingresa el piso por favor");
		int piso = this.scanner.nextInt();
		
		procesarDatos(piso);
		
	}
	
	public void procesarDatos( int piso ) {
		
		if( piso > 0 &&  piso < 5) {			
			System.out.println("Ingresa la temperatura por favor");
			int temperatura = this.scanner.nextInt();
			
			if(temperatura > 0 && temperatura < 50 ) {
				System.out.println("La temperatura es estable");
			}else {
				System.out.println("La temperatura esta fuera del rango");
			}
			
		}
		
	}
	
	

}
