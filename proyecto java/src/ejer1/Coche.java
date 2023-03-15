package ejer1;

public class Coche {
	 // Variables de instancia
    private String marca;
    private String matricula;  
    private Motor motor;
	private Volante volante;
	
	public Coche(String marca, String matricula, Motor motor, Volante volante) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.motor = motor;
		this.volante = volante;
	}
}
