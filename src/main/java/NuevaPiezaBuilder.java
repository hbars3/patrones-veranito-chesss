//Nueva Pieza
public class NuevaPiezaBuilder extends PiezaBuilder{

	@Override
	public void buildNombre() {
		pieza.setNombre("Peón");
	}

	@Override
	public void buildColor() {
		pieza.setColor("Blanco");	
	}
}
