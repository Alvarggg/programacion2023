package ejer1;

public class Piston {
	
	// Variables de instancia
    private String id;
    private String marca;

	public Piston(String id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}
	 public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
    
}
