import java.util.Scanner;

public class Ascensor2 extends Proceso{
	
	private Scanner scanner;
	
	public Ascensor2( Scanner scanner ) {
		this.scanner = scanner;
	}
	
	
	public void iniciarProceso() {
		this.pedirDatos();
	}
	
	
	private void pedirDatos() {
		
		System.out.println("Ingresa el piso");
		Integer piso = this.scanner.nextInt();
		
		System.out.println("Ingresa tu peso");
		Double peso = this.scanner.nextDouble();
		
		procesarDatos( piso, peso );
		
	}
	
	
	private void procesarDatos(Integer piso, Double peso ) {
		
		if( piso > 0 && piso < 5 ) {
			
			if( peso > 250 ) {
				System.out.println("El peso maximo permitido es de 250 k");
			}else {
				System.out.println("El ascensor se esta moviendo");
			}
		
		}else {
			System.out.println("El piso ingresado no esta disponible");
		}
		
	}

}
