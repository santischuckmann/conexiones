package coordenadas;

public class Coordenada{
	private int identificador;
	public double latitud;
	public double longitud;
	
	public Coordenada(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public Coordenada(int identificador, double latitud, double longitud) {
		this.identificador = identificador;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	public double obtenerDistancia (Coordenada c1) {
		double distanciaLongitudinal = 0;
		distanciaLongitudinal = obtenerDiferencia(this.longitud, c1.longitud);
		
		double distanciaLatitudinal = 0;		
		distanciaLatitudinal = obtenerDiferencia(this.latitud, c1.latitud);
		
		return distanciaLongitudinal + distanciaLatitudinal;
	}
	
	private static double obtenerDiferencia (double latitud1, double latitud2) {
		return latitud1 > latitud2 ? latitud1 - latitud2: latitud2 - latitud1;
	}
}
