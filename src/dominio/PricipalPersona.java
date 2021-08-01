package dominio;

public class PricipalPersona {
    public static void main(String[] args) {
        Persona per = new Persona();
        per.setNombre("Juan Carlos");
        Estudiante est = new Estudiante();
        Docente doc = new Docente();
        Administrativo adm = new Administrativo();
        est.setNombre("Pedro");
        doc.setNombre("Juan");
        adm.setNombre("Jose");
        System.out.println("Nombre Estudiantes "+est.getNombre());
        System.out.println("Nombre Docente : "+doc.getNombre());
        System.out.println("Nombre Administrativo: "+adm.getNombre());
            


    }
}
