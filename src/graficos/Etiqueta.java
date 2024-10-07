package graficos;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Etiqueta extends JLabel {
    private static final int ANCHO = 400;
    private static final int ALTO = 30;
    private static final int COORDENADAX = 0;
    private static final int COORDENADAY = 30;

    public Etiqueta() {
        setText("¡Hola, soy una etiqueta!");
        setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        setBounds(COORDENADAX, COORDENADAY, ANCHO, ALTO);
        setHorizontalAlignment(SwingConstants.CENTER);
        setVisible(true);
    }
}
