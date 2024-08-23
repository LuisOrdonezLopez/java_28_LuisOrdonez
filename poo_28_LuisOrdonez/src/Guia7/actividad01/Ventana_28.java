package Guia7.actividad01;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana_28 extends JFrame{
    public Ventana_28(){
        this.setSize(500,500); //Tamaño de ventana        
        setTitle("Patata"); //Ponemos título
        //setLocation(100, 200);
        //setBounds(100, 200, 500, 500); //Posicion inicial y tamaño
        setLocationRelativeTo(null); //Ventana en el centro
        
        //setResizable(false); //Ventana puede maximizar o no
        setMinimumSize(new Dimension(200, 200)); //Tamaño mínimo
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel(); //Crear panel
        //panel.setBackground(Color.GREEN); //Color al panel
        panel.setLayout(null); //Desactivando el diseño
        
        this.getContentPane().add(panel); //Agregamos panel a ventana
        
        JLabel etiqueta = new JLabel(); //Creamos etiqueta
        etiqueta.setText("Hola patatudo"); //Establecemos texto a etiqueta
        etiqueta.setBounds(10, 10, 50, 20);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos alineación horizontal del texto
        etiqueta.setForeground(Color.WHITE); //Color de letra etiqueta
        etiqueta.setOpaque(true); //Establecemos pintar fondo etiqueta
        etiqueta.setBackground(Color.BLACK); //Color de fondo etiqueta
        panel.add(etiqueta); //Agregamos etiqueta al panel
    }
}
