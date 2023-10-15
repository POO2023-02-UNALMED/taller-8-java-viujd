package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero (String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
	
	@Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " años, y juega de " + posicion + " con el dorsal " + dorsal + ". Ha marcado " + golesRecibidos + " goles.";
    }
	
	public int compareTo(Portero otro) {
		return Math.abs(golesRecibidos - otro.golesRecibidos);
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	

}
