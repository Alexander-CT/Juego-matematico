package Tipografias;

import java.awt.Font;
import java.io.InputStream;
//import javafx.scene.text.Font;

/**
 *
 * @author CASTRO TOCAFFONDI Alexander Piero
 */
public class Fuentes {
    private Font fuente = null;
    public String CS = "CabinSketch-Regular.ttf";
    public String CSB = "CabinSketch-Bolt.ttf";
    
    public Font Fuentes(String nombreFuente, int estilo, float size) {
        try {
            InputStream is = getClass().getResourceAsStream(nombreFuente);
            fuente = Font.createFont(Font.TRUETYPE_FONT, is);
	} catch(Exception ex) {
            System.err.println("La fuente "+nombreFuente+" no se ha cargado correctamente");
            fuente = new Font ("Arial",Font.PLAIN,14);
	}
	
        Font tfuente = fuente.deriveFont(estilo,size);
	return tfuente;
    }
}
