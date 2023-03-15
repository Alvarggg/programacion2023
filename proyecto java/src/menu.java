import java.util.Scanner;
import Utils.Utilidades;


public class menu {

	public static void main(String[] args) {
		int numero = 0;
		while (numero < 4) {
		print(PintarMenu())
		System.out.println("Escriba el numero de opcion");
		Scanner scan = new Scanner(System.in);
		
		numero = scan.nextInt();
		if (numero == 1){
			System.out.println("validar email");
		}else if (numero == 2) {
			System.out.println("pintar cuadrado");
		}else if (numero == 3) {
			System.out.println("mostar datos");S
		}else if (numero == 4) {
			System.out.println("salir");
			break;
		}
		}
	}

	}

