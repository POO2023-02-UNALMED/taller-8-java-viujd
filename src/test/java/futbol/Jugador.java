package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador (String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre,edad, posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	
	public Jugador () {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	
	 
	public int compareTo(Jugador otro) {
		return Math.abs(this.getEdad() - otro.getEdad());
	}
	
	@Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
    }
	
	public boolean jugarConLasManos() {
		return false;
	}
	
}
