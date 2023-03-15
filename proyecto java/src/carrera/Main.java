package carrera;



public class Main {

	public static void main(String[] args) {
		Piloto piloto1= new Piloto("Fernando", 65, "Ferrari",5 );
		Coche coche1  = new Coche("Ferrari", "honda",12, piloto1, 123, 65);
		Carrera carrera1= new Carrera("")
		
		
		//coche 2
		Volante volante2 = new Volante("42752534", "suvaru","rojo");
		Piston piston2 = new Piston("176253", "Pistonisa");
		Motor motor2 = new Motor("Motorola", 1000,piston2);
		Coche coche2 = new Coche("Renolt", "862537DS", motor2, volante2)

	}

}
