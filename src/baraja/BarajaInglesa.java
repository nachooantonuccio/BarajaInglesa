package baraja;
import java.util.ArrayList;

import baraja.cartas.Carta;
import baraja.cartas.CartaFigura;
import baraja.cartas.CartaJoker;
import baraja.cartas.CartaNumeral;

public class BarajaInglesa {

	ArrayList<Carta> cartas;

	public BarajaInglesa() {
		this.cartas = new ArrayList<Carta>();
		generarCartas();
	}
	
	public void mostrarBaraja() {
		for (Carta carta : cartas) {
			carta.darVuelta();
			carta.mostrar();
		}
	}
	
	private void generarCartas() {
		generarCartasNumerales();
		generarCartasFiguras();
		generarCartasJoker();		
	}

	private void generarCartasFiguras() {
		char[] letras = {'A', 'J', 'Q', 'K'};
		Palo[] palos = Palo.values();
		
		for (int p = 0; p < palos.length; p++) {
			Palo paloActual = palos[p];
			for (int i = 0; i < letras.length; i++) {
				char letraActual = letras[i];
				this.cartas.add( new CartaFigura(letraActual,paloActual));
			}
		}		
		
	}

	private void generarCartasJoker() {
		this.cartas.add( new CartaJoker(true));
		this.cartas.add( new CartaJoker(false));
	}
	

	private void generarCartasNumerales() {
		final int MIN_VALOR = 2;
		final int MAX_VALOR = 10;
		Palo[] palos = Palo.values();
		
		for (int p = 0; p < palos.length; p++) {
			Palo paloActual = palos[p];
			for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
				this.cartas.add( new CartaNumeral(i,paloActual));
			}
		}		
	}
	
	
	
}
