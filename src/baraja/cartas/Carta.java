package baraja.cartas;

public abstract class Carta {

	private boolean tapada;
	
	public void darVuelta() {
		tapada = !tapada;	
	}

	public Carta() {
		this.tapada = true;
	}
		
	public void mostrar() {
		if (tapada) {
			System.out.println("**************************");
		} else {
			System.out.println( getRepresentacion() );
		}	
	}
	
	
	public abstract String getRepresentacion();

	@Override
	public String toString() {
		return "Carta [tapada=" + tapada + "]";
	}

	public boolean isTapada() {
		return tapada;
	}

	
	
}
