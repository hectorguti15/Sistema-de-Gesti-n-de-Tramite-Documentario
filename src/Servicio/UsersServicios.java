package Servicio;

import java.util.Arrays;
import modelos.User;

public class UsersServicios {

    public static User[] users = new User[1];
    private static int userCount = 0;

    public static void agregarUsuario(User user) {

        if (userCount == users.length) {

            users = Arrays.copyOf(users, users.length * 2);
        }
        users[userCount] = user;
        userCount++;

    }

    public static User obtenerUsuario(String correoElectronico) {
        for (int i = 0; i < users.length; i++) {
            if (correoElectronico == null ? users[i].getCorreoElectronico() == null : correoElectronico.equals(users[i].getCorreoElectronico())) {
                return users[i];
            }
        }
        return null;
    }
}
