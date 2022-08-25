// mensaje al visitante
public class Mensaje implements Visitor{
		private final String nuevoMensaje = "mensaje";
		
		public String visit(NuevoMensaje mensaje){
			return mensaje.getMensaje() + nuevoMensaje;
		} 
}
