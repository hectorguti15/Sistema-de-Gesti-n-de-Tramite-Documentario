package Utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean esEmailValido(String correoElectronico) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(correoElectronico).matches();
    }

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static Random random = new Random();

    public static String generarIdentificador() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(CARACTERES.length());
            sb.append(CARACTERES.charAt(index));
        }

        return sb.toString();
    }
}
