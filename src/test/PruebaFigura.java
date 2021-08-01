
package test;

import conversiones.Circulo;
import conversiones.Cuadrado;
import conversiones.Figura;

public class PruebaFigura {
    public static void main(String[] args) {
        Figura fig = new Circulo();//casting hacia arriba
        if(fig instanceof Circulo){
            System.out.println("El objeto referenciado es un circulo");
        }
        Circulo fig1 = (Circulo)fig;//casting hacia abajo
//        fig1.metodoCirculo();
        
       Cuadrado cuadrado = new Cuadrado();
       cuadrado.setNombre("Cuadrado");
        System.out.println(cuadrado.getNombre());
       cuadrado.CalcularArea();
       Circulo circulo = new Circulo();
       circulo.setNombre("Circulo");
        System.out.println(circulo.getNombre());
       circulo.CalcularArea();
       }
    
}
