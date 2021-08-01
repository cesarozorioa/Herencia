package conversiones;

public abstract class Figura {
    private String nombre;
    public abstract void CalcularArea();
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
