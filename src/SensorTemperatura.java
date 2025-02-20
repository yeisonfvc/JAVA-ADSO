

/* Crea un programa que simule un sensor de temperatura ambiente. El usuario ingresa la
temperatura actual y el programa verifica si la temperatura está dentro de un rango aceptable
(por ejemplo, entre 18°C y 25°C). Si está dentro del rango, muestra un mensaje indicando que
la temperatura es adecuada. Si no, muestra un mensaje de que la temperatura está fuera del
rango deseado.
  */

import java.util.Scanner;

public class SensorTemperatura extends Proceso{
	
	private Scanner scanner;
	
	
	public SensorTemperatura(Scanner scanner ) {
		this.scanner = scanner;
	}

	@Override
	public void iniciarProceso() {
		
		pedirDatos();
}
	
	public void pedirDatos() {
		
		System.out.println("Ingrese la temperatura por favor");
		int temperatura = this.scanner.nextInt();
		procesarDatos(temperatura);
		
	}
	
	
	private void procesarDatos( int temperatura ) {
		
		if( temperatura > 18 && temperatura < 25) {
			System.out.println("La temperatura se encuentra estable");
		}else {
			System.out.println("La temperatura esta fuera del rango");
		}
		
	}
	
	

}
