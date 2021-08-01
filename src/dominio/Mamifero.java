
package dominio;


public class Mamifero extends Animal {
    private int nroPatas;
    public Mamifero(int nroPatas){        
        super("tarzan");
        this.nroPatas = nroPatas;
        System.out.println("Constructor de Mamifero");
    }
    public int getNroPatas()
    {
        return this.nroPatas;
    }
}
