package futbol;

public abstract class Futbolista implements Comparable <Object>{
	protected String nombre;
	protected int edad;
	protected final String posicion;
	
	public Futbolista (String nombre, int edad, String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
	
	public Futbolista () {
		this("Maradona", 30, "delantero");
	}
	
	@Override 	
	public int compareTo(Object f) {
		return 0;
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }
    
    public boolean equals(Futbolista f) {
    	return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }
    
    public abstract boolean jugarConLasManos();
    
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    
    public int getEdad() {
    	return edad;
    }
	
    public void setEdad(int edad) {
    	this.edad=edad;
    }
    
    public String getPosicion () {
    	return posicion;
    }
    
    
}
