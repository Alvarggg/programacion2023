package carrera;

public class Carrera {
			private String nombre;
			private String circuito;
			private Coche parrillaSalida[];
			private int avance;
			
			public Carrera(String nombre, String circuito, Coche[] parrillaSalida, int avance) {
				super();
				this.nombre = nombre;
				this.circuito = circuito;
				this.parrillaSalida = parrillaSalida;
				this.avance = avance;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}

			public String getCircuito() {
				return circuito;
			}

			public void setCircuito(String circuito) {
				this.circuito = circuito;
			}

			public Coche[] getParrillaSalida() {
				return parrillaSalida;
			}

			public void setParrillaSalida(Coche[] parrillaSalida) {
				this.parrillaSalida = parrillaSalida;
			}

			public int getAvance() {
				return avance;
			}

			public void setAvance(int avance) {
				this.avance = avance;
			}
			
}
