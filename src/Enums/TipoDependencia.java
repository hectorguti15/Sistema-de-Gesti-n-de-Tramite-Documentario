package Enums;

public enum TipoDependencia {
    SOLICITUD,
    CERTIFICADO,
    CONSTANCIA,
    CARNET_UNIVERSITARIO,
    LICENCIA,
    RECLAMO,
    AUTORIZACION,
    ACTA,
    HISTORIAL_ACADEMICO;

    public static TipoDependencia fromStringToEnum(String text) {
        switch (text.toUpperCase()) {
            case "SOLICITUD" -> {
                return TipoDependencia.SOLICITUD;
            }
            case "CERTIFICADO" -> {
                return TipoDependencia.CERTIFICADO;
            }
            case "CONSTANCIA" -> {
                return TipoDependencia.CONSTANCIA;
            }
            case "CARNET UNIVERSITARIO" -> {
                return TipoDependencia.CARNET_UNIVERSITARIO;
            }
            case "LICENCIA" -> {
                return TipoDependencia.LICENCIA;
            }
            case "RECLAMO" -> {
                return TipoDependencia.RECLAMO;
            }
            case "AUTORIZACION" -> {
                return TipoDependencia.AUTORIZACION;
            }
            case "ACTA" -> {
                return TipoDependencia.ACTA;
            }
            case "HISTORIAL ACADEMICO" -> {
                return TipoDependencia.HISTORIAL_ACADEMICO;
            }
            default ->
                throw new IllegalArgumentException("Tipo de dependencia no reconocido: " + text);
        }
    }

    public static String fromEnumToString(TipoDependencia tipoDependencia) {
        switch (tipoDependencia) {
            case SOLICITUD -> {
                return "Solicitud";
            }
            case CERTIFICADO -> {
                return "Certificado";
            }
            case CONSTANCIA -> {
                return "Constancia";
            }
            case CARNET_UNIVERSITARIO -> {
                return "Carnet Universitario";
            }
            case LICENCIA -> {
                return "Licencia";
            }
            case RECLAMO -> {
                return "Reclamo";
            }
            case AUTORIZACION -> {
                return "Autorizacion";
            }
            case ACTA -> {
                return "Acta";
            }
            case HISTORIAL_ACADEMICO -> {
                return "Historial Academico";
            }
            default ->
                throw new IllegalArgumentException("Tipo de dependencia no reconocido: " + tipoDependencia);
        }
    }
}
