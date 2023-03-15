package ejer1;

public class Garaje {

	public static void main(String[] args) {
		//coche 1
		Volante volante1 = new Volante("425243D", "carreras","verde");
		Piston piston1 = new Piston("125342", "Pistonmania");
		Motor motor1 = new Motor("Motorsport", 1200, piston1);
		Coche coche1 = new Coche("Seat", "54273AC", motor1, volante1);
		//coche 2
		Volante volante2 = new Volante("42752534", "suvaru","rojo");
		Piston piston2 = new Piston("176253", "Pistonisa");
		Motor motor2 = new Motor("Motorola", 1000,piston2);
		Coche coche2 = new Coche("Renolt", "862537DS", motor2, volante2);
		System.out.println(piston1.getMarca());

	}

}
