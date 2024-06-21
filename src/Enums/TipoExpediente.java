
package Enums;


public enum TipoExpediente {
    SOLICITUD,
    CERTIFICADO,
    CONSTANCIA,
    CARNET_UNIVERSITARIO,
    LICENCIA,
    RECLAMO,
    AUTORIZACION,
    HISTORIAL_ACADEMICO;

    public static TipoExpediente fromStringToEnum(String text) {
        switch (text.toUpperCase()) {
            case "SOLICITUD" -> {
                return TipoExpediente.SOLICITUD;
            }
            case "CERTIFICADO" -> {
                return TipoExpediente.CERTIFICADO;
            }
            case "CONSTANCIA" -> {
                return TipoExpediente.CONSTANCIA;
            }
            case "CARNET UNIVERSITARIO" -> {
                return TipoExpediente.CARNET_UNIVERSITARIO;
            }
            case "LICENCIA" -> {
                return TipoExpediente.LICENCIA;
            }
            case "RECLAMO" -> {
                return TipoExpediente.RECLAMO;
            }
            case "AUTORIZACION" -> {
                return TipoExpediente.AUTORIZACION;
            }
            case "HISTORIAL ACADEMICO" -> {
                return TipoExpediente.HISTORIAL_ACADEMICO;
            }
            default ->
                throw new IllegalArgumentException("Tipo de expediente no reconocido: " + text);
        }
    }

    public static String fromEnumToString(TipoExpediente tipoExpediente) {
        switch (tipoExpediente) {
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
            case HISTORIAL_ACADEMICO -> {
                return "Historial Academico";
            }
            default ->
                throw new IllegalArgumentException("Tipo de expediente no reconocido: " + tipoExpediente);
        }
    }
}
