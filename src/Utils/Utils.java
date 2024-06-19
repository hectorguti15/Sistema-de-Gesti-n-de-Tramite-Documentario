package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils{
    public static boolean esEmailValido(String correoElectronico){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);

        return pattern.matcher(correoElectronico).matches();
    }
}