package Fuentes;

import java.awt.*;
import java.io.*;

public class Fuentes {
    
    private Font font = null;
    public String PoppinsRegular = "Poppins-Regular.ttf";
    public String PoppinsBold = "Poppins-Bold.ttf";
    
    public Font fuente(String fontName, int estilo, float tamanio)
    {
         try {
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
