package Enums;

public enum TipoEstado {

    INGRESADO,
    FINALIZADO,
    ESPERA,
    CANCELADO;

    public static TipoEstado fromStringToEnum(String text) {
        switch (text.toUpperCase()) {
            case "INGRESADO" -> {
                return TipoEstado.INGRESADO;
            }
            case "FINALIZADO" -> {
                return TipoEstado.FINALIZADO;
            }
            case "ESPERA" -> {
                return TipoEstado.ESPERA;
            }
            case "CANCELADO" -> {
                return TipoEstado.CANCELADO;

            }

            default ->
                throw new IllegalArgumentException("Tipo de estado no reconocido: " + text);
        }

    }
    
    public static String fromEnumToString(TipoEstado tipoEstado) {
        switch (tipoEstado) {
            case INGRESADO -> {
                return "Ingresado";
            }
            case FINALIZADO -> {
                return "Finalizado";
            }
            case ESPERA -> {
                return "Espera";
            }
            case CANCELADO -> {
                return "Cancelado";
            }
            default ->
                throw new IllegalArgumentException("Tipo de estado no reconocido: " + tipoEstado);
        }
    }
}
