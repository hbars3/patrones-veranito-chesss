//Abstract builder
public abstract class PiezaBuilder {
		protected Pieza pieza;
		
		public Pieza getPieza(){
			return pieza;
		}
		
		public void CrearNuevaPieza(){
			pieza = new Pieza();
		}
		
		public abstract void buildNombre();
		public abstract void buildColor();
}
