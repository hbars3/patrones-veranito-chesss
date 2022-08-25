// orden1 command
public class Orden1 implements OrdenCommand{
	
	private Receptor receptor;
	
	public Orden1(Receptor receptor){
		this.receptor = receptor;
	}
	
	@Override
	public String nombre() {
		return "orden concreta 1";
	}

	@Override
	public void execute() {
		this.receptor.accion1();
	}

	
	
}
