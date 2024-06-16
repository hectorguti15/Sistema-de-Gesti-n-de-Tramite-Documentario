package Enums;

public enum TipoPrioridad {
    ALTA,
    MEDIA,
    BAJA;

    public static TipoPrioridad fromStringToEnum(String text) {
        switch (text.toUpperCase()) {
            case "ALTA" -> {
                return TipoPrioridad.ALTA;
            }
            case "MEDIA" -> {
                return TipoPrioridad.MEDIA;
            }
            case "BAJA" -> {
                return TipoPrioridad.BAJA;
            }
            default ->
                throw new IllegalArgumentException("Prioridad no reconocida: " + text);
        }
    }

    public static String fromStringToEnum(TipoPrioridad prioridad) {
        switch (prioridad) {
            case TipoPrioridad.ALTA -> {
                return "Alta";
            }
            case TipoPrioridad.MEDIA -> {
                return "Media";
            }
            case TipoPrioridad.BAJA -> {
                return "Baja";
            }
            default ->
                throw new IllegalArgumentException("Prioridad no reconocida: " + prioridad);
        }
    }

}
