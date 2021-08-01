
package dominio;

import javax.swing.JFrame;


public class Ventana extends JFrame{
    public Ventana()
    {
        setSize(200, 500);
        setLocation(10, 10);
        setTitle("Mi ventana");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
