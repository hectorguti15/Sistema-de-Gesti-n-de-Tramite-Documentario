package Enums;

public enum TipoIdentificacion {
    PERSONA,
    TRABAJADOR_ULIMA,
    INSTITUCION;

    public static TipoIdentificacion fromStringToEnum(String text) {
        switch (text.toUpperCase()) {
            case "PERSONA" -> {
                return TipoIdentificacion.PERSONA;
            }
            case "TRABAJADOR ULIMA" -> {
                return TipoIdentificacion.TRABAJADOR_ULIMA;
            }
            case "INSTITUCION" -> {
                return TipoIdentificacion.INSTITUCION;
            }
            default ->
                throw new IllegalArgumentException("Tipo de identificacion no reconocida: " + text);
        }
    }
    public static String fromEnumToString(TipoIdentificacion tipoIdentificacion) {
        switch (tipoIdentificacion) {
            case TipoIdentificacion.PERSONA -> {
                return "Persona"; 
            }
            case TipoIdentificacion.TRABAJADOR_ULIMA -> {
                return "Trabajador Ulima";
            }
            case TipoIdentificacion.INSTITUCION -> {
                return "Institucion";
            }
            default ->
                throw new IllegalArgumentException("Tipo de identificacion no reconocida: " + tipoIdentificacion);
        }
    }
}