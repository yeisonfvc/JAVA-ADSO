import java.util.Scanner;

public class Menu {
	
	private Scanner scanner;
	
	public Menu( Scanner scanner ) {
		this.scanner = scanner;
	}
	
	
	public Integer mostrarMenu() {
		
		System.out.println("MENU PRINCIPAL");
		System.out.println("1. ASCENSOR PISO ");
		System.out.println("2. ASCENSOR PISO Y PESO");
		System.out.println("3. SENSOR DE TEMPERATURA");
		
		Integer opcion = this.scanner.nextInt();
		
		ejecutarProceso(opcion);
		
		return opcion;
		
	}
	
	
	public void ejecutarProceso( Integer opcion ) {
		
		switch (opcion) {
		case 1:
			
			Ascensor ascensor = new Ascensor(scanner);
			ascensor.iniciarProceso();
			
			break;
			
		case 2:
			Ascensor2 object = new Ascensor2(scanner);
			object.iniciarProceso();
			
			break;
			
		case 3: 
			SensorTemperatura sensor = new SensorTemperatura(scanner);
			sensor.iniciarProceso();
			break;

		default:
			break;
		}
	}

}
