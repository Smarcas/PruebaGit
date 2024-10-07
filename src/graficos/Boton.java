package graficos;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Boton extends JButton {
    private static final int ANCHO = 150;
    private static final int ALTO = 30;
    private static final int COORDENADAX = 125;
    private static final int COORDENADAY = 70;

    public Boton() {
        setText("Haz clic en mi");
        setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        setBounds(COORDENADAX, COORDENADAY, ANCHO, ALTO);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVisible(true);
    }
}
