package coordenadas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoordenadaTest {

	@Test
	public void distanciaEsIgual() {
		Coordenada c1 = new Coordenada(30, 40);
		Coordenada c2 = new Coordenada(30, 40);
		
		assertEquals(0, c1.obtenerDistancia(c2), 0.0f);
	}
	
	@Test
	public void distanciaEsIgualGrande() {
		Coordenada c1 = new Coordenada(30, 40);
		Coordenada c2 = new Coordenada(500, 700);
		
		assertEquals(1130, c1.obtenerDistancia(c2), 0.0f);
	}
	
	@Test
	public void distanciaEsIgualChico() {
		Coordenada c1 = new Coordenada(30, 40);
		Coordenada c2 = new Coordenada(50, 20);
		
		assertEquals(40, c1.obtenerDistancia(c2), 0.0f);
	}
}
