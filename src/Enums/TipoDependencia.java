package Enums;

public enum TipoDependencia {
    AREA_RECEPCION_DOCUMENTOS,
    AREA_TRAMITE_DOCUMENTARIO,
    AREA_REGISTROS_ACADEMICOS,
    SECRETARIA_ACADEMICA,
    OFICINA_SERVICIO_GENERALES,
    SECRETARIA_ADMINISTRATIVA,
    OFICINA_RECURSOS_HUMANOS,
    UNIDAD_ATENCION_USUARIO,
    OFICINA_QUEJAS,
    SECRETARIA_GENERAL,
    POR_ASIGNAR;

    public static TipoDependencia fromStringToEnum(String text) {
        switch (text.toUpperCase()) {
            case "AREA RECEPCION DOCUMENTOS" -> {
                return TipoDependencia.AREA_RECEPCION_DOCUMENTOS;
            }
            case "AREA TRAMITE DOCUMENTARIO" -> {
                return TipoDependencia.AREA_TRAMITE_DOCUMENTARIO;
            }
            case "AREA REGISTROS ACADEMICOS" -> {
                return TipoDependencia.AREA_REGISTROS_ACADEMICOS;
            }
            case "SECRETARIA ACADEMICA" -> {
                return TipoDependencia.SECRETARIA_ACADEMICA;
            }
            case "OFICINA SERVICIO GENERALES" -> {
                return TipoDependencia.OFICINA_SERVICIO_GENERALES;
            }
            case "SECRETARIA ADMINISTRATIVA" -> {
                return TipoDependencia.SECRETARIA_ADMINISTRATIVA;
            }
            case "OFICINA RECURSOS HUMANOS" -> {
                return TipoDependencia.OFICINA_RECURSOS_HUMANOS;
            }
            case "UNIDAD ATENCION USUARIO" -> {
                return TipoDependencia.UNIDAD_ATENCION_USUARIO;
            }
            case "OFICINA QUEJAS" -> {
                return TipoDependencia.OFICINA_QUEJAS;
            }
            case "SECRETARIA GENERAL" -> {
                return TipoDependencia.SECRETARIA_GENERAL;
            }
            case "POR ASIGNAR" -> {
                return TipoDependencia.POR_ASIGNAR;
            }
            default -> throw new IllegalArgumentException("Tipo de dependencia no reconocido: " + text);
        }
    }

    public static String fromEnumToString(TipoDependencia tipoDependencia) {
        switch (tipoDependencia) {
            case AREA_RECEPCION_DOCUMENTOS -> {
                return "Area Recepcion Documentos";
            }
            case AREA_TRAMITE_DOCUMENTARIO -> {
                return "Area Tramite Documentario";
            }
            case AREA_REGISTROS_ACADEMICOS -> {
                return "Area Registros Academicos";
            }
            case SECRETARIA_ACADEMICA -> {
                return "Secretaria Academica";
            }
            case OFICINA_SERVICIO_GENERALES -> {
                return "Oficina Servicio Generales";
            }
            case SECRETARIA_ADMINISTRATIVA -> {
                return "Secretaria Administrativa";
            }
            case OFICINA_RECURSOS_HUMANOS -> {
                return "Oficina Recursos Humanos";
            }
            case UNIDAD_ATENCION_USUARIO -> {
                return "Unidad Atencion Usuario";
            }
            case OFICINA_QUEJAS -> {
                return "Oficina Quejas";
            }
            case SECRETARIA_GENERAL -> {
                return "Secretaria General";
            }
            case POR_ASIGNAR -> {
                return "Por asignar";
            }
            default -> throw new IllegalArgumentException("Tipo de dependencia no reconocido: " + tipoDependencia);
        }
    }
}
