package modelos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    private String nombre;
    private String apellido;
    private String correoElectronico;

    public Persona(String nombre, String apellido, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCorreoElectronico(String correoElectronico) {

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        try {

            Matcher matcher = pattern.matcher(correoElectronico);
            if (matcher.matches()) {
                this.correoElectronico = correoElectronico;
            } else {
                throw new IllegalArgumentException("Correo electrónico no válido");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

}
 
