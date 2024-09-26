package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
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
        inicializaComponentes();
    }

    public void inicializaComponentes() {
        // WindowEvent y WindowAdapter para crear una escucha del botón de cierre de la ventana
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println(e.getWindow().getBounds().height);
                System.exit(0);
            }
        });
    }
}
