// clase NuevoMensaje
public class NuevoMensaje implements Visitable{
	private String mensaje;
	
	public String aceptar(Visitor visitor){
		return visitor.visit(this); 
	}
	
	public String getMensaje(){
		return mensaje;
	}
	
	public void setMensaje(String mensaje){
		this.mensaje = mensaje; 
	}
}
