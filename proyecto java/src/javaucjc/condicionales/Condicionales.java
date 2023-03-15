package javaucjc.condicionales;

public class Condicionales {

	public static void main(String[] args) {
		int numero1 = 8;
		int numero2 = 9;
		
		if(numero1>numero2) {
			System.out.println("Numero es mayor");
		}else if (numero2>0) {
			System.out.println("numero2 mayor que 0 ");
		}else {
			System.out.println("no se cumple ninguna condicion");
		}
		//condiciones con switch
		switch(numero1) {
			case 10:System.out.println("Valor10");break;
			case 2:System.out.println("Valor2");break;
			case 1:System.out.println("Valor1");break;
			default:System.out.println("Otro Valor");break;
		}
	}
}