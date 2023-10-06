import java.util.Scanner;

public class Igra2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Elige un numero de 0 a 100");
		int intentos = 0;
		boolean jugar = true;
		
		while (jugar) {
		int random = (int) Math.floor(Math.random() * 5) + 1;
		while (true) {
			
		int prueba = scanner.nextInt();
		intentos++;
		if (random < prueba) {
		System.out.println("El número que has escrito mayor");
		} else if (random > prueba) {
		System.out.println("El número que has escrito menor");
		} else {
		System.out.println("Has ganado chaval, felicidades");
		System.out.println("Has utilizado " + intentos + " intentos");
		System.out.println("Quieres continuar? S/N");
		String respuesta = scanner2.nextLine();
		
		
		if (respuesta.equalsIgnoreCase("S")) {
			
			
			System.out.println("Elige un numero de 0 a 100");
			random = (int) Math.floor(Math.random() * 5) + 1;
			jugar = true;
		} else {
		    jugar = false;
		    break;
		}
		
		}
		}
		
		}
		System.out.println("Eres un txapeldun");
		scanner.close();
		scanner2.close();


	}

}
