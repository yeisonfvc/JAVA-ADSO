import java.util.Scanner;

public class Ascensor extends Proceso{
	
	
	private Scanner scanner;
	
	public Ascensor(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void iniciarProceso() {
		pedirDatos();
		
		
	}
	
	public void pedirDatos() {
		
		System.out.println("Ingresa el piso");
		 Integer piso = scanner.nextInt();
		
		 procesarDatos(piso);
		
	}
	
	
	public void procesarDatos(Integer piso ) {
		if( piso > 0 && piso < 5) {
			System.out.println("El ascensor se esta moviendo...");
		}else {
			System.out.println("Piso no esta disponible");
		}
	}
	
	
	

}
