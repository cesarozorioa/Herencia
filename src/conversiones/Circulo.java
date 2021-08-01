/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiones;

/**
 *
 * @author Cesar Osorio Universidad de las Fuerzas Armadas ESPE
 */
public class Circulo extends Figura {
    @Override
    public void CalcularArea(){
        double area=Math.PI*Math.pow(5, 2);        
        System.out.println("circulo = "+area);
    }
    
}
