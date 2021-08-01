
package dominio;


public class Estudiante extends Persona {
    private String carrera;
    public void mostrarnombreEstudiante(){
                mensaje();
                System.out.println(getNombre());
                System.out.println("carrera: "+carrera);
                
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
}
