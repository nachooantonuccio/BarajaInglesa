package baraja.cartas;
public class CartaJoker extends Carta{
	
	private boolean aColor;
	private String color;
	
	
	public CartaJoker(boolean aColor) {
		this.aColor = aColor;
	}

	
	public String getRepresentacion() {
		return "Joker " + (aColor ? "a colores" : "blanco y negro");
	}
}
