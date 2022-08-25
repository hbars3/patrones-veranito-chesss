import java.util.HashMap;
import java.util.Map;
//clase invocador
public class Invoker {
	private Map<String, OrdenCommand> orders;
	
	public Invoker(){
		this.orders = new HashMap<>();
	}
	
	public void add(OrdenCommand orden){
		this.orders.put(orden.nombre(), orden);
	}
	
	public void execute(String key){
		this.orders.get(key).execute();
	}
	
	public String[] keys(){
		return this.orders.keySet().toArray(new String[0]);
	}
}
