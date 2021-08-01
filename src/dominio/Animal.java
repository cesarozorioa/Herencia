
package dominio;


public class Animal {
    private String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
        System.out.println("Constructor de Animal");
    }
    public String getNombre(){
        return this.nombre;
    }
}
