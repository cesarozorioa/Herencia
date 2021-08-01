
package dominio;


public class Persona {
    private String nombre;
    public void mensaje(){
        System.out.println("Buenos dias");
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
