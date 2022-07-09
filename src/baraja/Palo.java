package baraja;

public enum Palo {
	PICA(Color.NEGRO),
	CORAZON(Color.ROJO),
	DIAMANTE(Color.ROJO),
	TREBOL(Color.NEGRO);
	
	private Color color;
	
	private Palo (Color co) {
		this.color = color;
	}
}
