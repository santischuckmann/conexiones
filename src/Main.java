import java.util.ArrayList;

import coordenadas.Coordenada;
import grafos.Grafo;

public class Main {
	public static void main(String[] args) throws Exception {
		Grafo grafo = new Grafo(5);
		ArrayList<Coordenada> coordenadas = new ArrayList<Coordenada>();
		coordenadas.add(new Coordenada(30, 40));
		coordenadas.add(new Coordenada(100, 120));
		coordenadas.add(new Coordenada(60, 80));
		coordenadas.add(new Coordenada(70, 90));
		coordenadas.add(new Coordenada(150, 170));
		grafo.agregarArista(0, 1);
		grafo.agregarArista(0, 2);
		grafo.agregarArista(0, 3);
		grafo.agregarArista(2, 3);
		grafo.agregarArista(2, 4);
		grafo.agregarArista(3, 4);
	}
}
