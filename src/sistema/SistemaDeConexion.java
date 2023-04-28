package sistema;

import java.util.ArrayList;
import java.util.HashMap;

import coordenadas.Coordenada;
import grafos.Arista;
import grafos.Grafo;

public class SistemaDeConexion {
	private ArrayList<Coordenada> coordenadas;
	private Grafo conexiones;
	private GeneradorDeCostos generadorDeCostos;
	private int maximaCantidadDeUbicaciones = 10;
	private HashMap<Arista, Double> costoPorArista;
	
	public SistemaDeConexion (GeneradorDeCostos generadorDeCostos) {
		this.coordenadas = new ArrayList<Coordenada>();
		this.conexiones = new Grafo(maximaCantidadDeUbicaciones);
		this.generadorDeCostos = generadorDeCostos;
		this.costoPorArista = new HashMap<Arista, Double>();
	}
	
	public void agregarUbicacion(String identificador, String provincia, double latitud, double longitud) throws Exception {
		if (coordenadas.size() == maximaCantidadDeUbicaciones) {
			throw new Exception("No puedes agregar mas ubicaciones");
		}
		
		Coordenada nuevaCoordenada = new Coordenada(coordenadas.size(), latitud, longitud);
		
		for (Coordenada coordenada: coordenadas) {
			double distancia = nuevaCoordenada.obtenerDistancia(nuevaCoordenada);
			double costo = generadorDeCostos.generarCostoPorDistancia(distancia, false);
			
			Arista nuevaArista = new Arista(nuevaCoordenada.getIdentificador(), coordenada.getIdentificador());
			conexiones.agregarArista(nuevaArista.i, nuevaArista.j);
			costoPorArista.put(nuevaArista, costo);
		}
		
		coordenadas.add(nuevaCoordenada);
	}
}
