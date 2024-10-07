package graficos;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends JFrame {
    // Componentes para crear la ventana
    private static final int ANCHURA=400;
    private static final int ALTURA=300;

    // CONSTRUCTOR
    public Ventana() {
        setSize(ANCHURA, ALTURA);
        setLocationRelativeTo(null);
        setTitle("Ventana principal");
        setLocation(500, 200);
        ImageIcon icono = new ImageIcon("src/graficos/hogar.png");
        setIconImage(icono.getImage());
        // Ponemos el layout a null
        getContentPane().setLayout(null);
        // Instanciamos nuestros componentes
        Etiqueta etiquetaprincipal = new Etiqueta();
        Boton botoncentral = new Boton();
        // Añadimos el listener al botón
        botoncentral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                float red = (float) Math.random();
                float green = (float) Math.random();
                float blue = (float) Math.random();
                etiquetaprincipal.setText("Has hecho clic");
                etiquetaprincipal.setForeground(new Color(red, green, blue));
            }
        });
        // Los insertamos en el layout
        getContentPane().add(etiquetaprincipal);
        getContentPane().add(botoncentral);
        // Hacemos visible la ventana
        setVisible(true);
        // Iniciamos los componentes
        inicializaComponentes();
    }

    // METHODS
    public void inicializaComponentes() {
        // WindowEvent y WindowAdapter para crear una escucha del botón de cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.out.println("La altura de la ventana es: " + evt.getWindow().getBounds().height);
                System.exit(0);
            }
        });

    }
}
