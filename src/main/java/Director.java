// Clase director
public class Director {
	private PiezaBuilder piezaBuilder;
	
	public void setPiezaBuilder(PiezaBuilder pb){
		piezaBuilder = pb;
	}
	
	public Pieza getPieza(){
		return piezaBuilder.getPieza();
	}
	
	public void construirPieza(){
		piezaBuilder.CrearNuevaPieza();
		piezaBuilder.buildNombre();
		piezaBuilder.buildColor();
	}
}
