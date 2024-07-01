package Servicio;

import Enums.TipoDependencia;
import modelos.PersonaDependencia;

public class PersonalDependenciaServicio {

    private static PersonaDependencia personaRecepcion1;
    private static PersonaDependencia personaRecepcion2;
    private static PersonaDependencia personaTramite1;
    private static PersonaDependencia personaRegistros1;
    private static PersonaDependencia personaRegistros2;
    private static PersonaDependencia personaSecretariaAcademica1;
    private static PersonaDependencia personaServiciosGenerales1;
    private static PersonaDependencia personaSecretariaAdmin1;
    private static PersonaDependencia personaRecursosHumanos1;
    private static PersonaDependencia personaRecursosHumanos2;
    private static PersonaDependencia personaAtencionUsuario1;
    private static PersonaDependencia personaQuejas1;
    private static PersonaDependencia personaSecretariaGeneral1;

    static {
        // Área Recepcion de documentos
        personaRecepcion1 = new PersonaDependencia("Juan", "Perez", "juanperez@gmail.com", "JPK123TZ", TipoDependencia.AREA_RECEPCION_DOCUMENTOS);
        personaRecepcion2 = new PersonaDependencia("Ana", "Gomez", "anagomez@gmail.com", "AGK123TZ", TipoDependencia.AREA_RECEPCION_DOCUMENTOS);

        // Área Trámite Documentario
        personaTramite1 = new PersonaDependencia("Carlos", "Ramirez", "carlosramirez@gmail.com", "CR123TZ", TipoDependencia.AREA_TRAMITE_DOCUMENTARIO);

        // Área Registros Académicos
        personaRegistros1 = new PersonaDependencia("Maroa", "Lopez", "marialopez@gmail.com", "MPK123TZ", TipoDependencia.AREA_REGISTROS_ACADEMICOS);
        personaRegistros2 = new PersonaDependencia("Pedro", "Martinez", "pedromartinez@gmail.com", "PMK123TZ", TipoDependencia.AREA_REGISTROS_ACADEMICOS);

        // Área Secretaría Académica
        personaSecretariaAcademica1 = new PersonaDependencia("Laura", "Hernandez", "laurahernandez@gmail.com", "LHK123TZ", TipoDependencia.SECRETARIA_ACADEMICA);

        // Área Oficina de Servicios Generales
        personaServiciosGenerales1 = new PersonaDependencia("Luis", "Sanchez", "luissanchez@gmail.com", "LSK123TZ", TipoDependencia.OFICINA_SERVICIO_GENERALES);

        // Área Secretaría Administrativa
        personaSecretariaAdmin1 = new PersonaDependencia("Ana", "Torres", "anatorres@gmail.com", "ATK123TZ", TipoDependencia.SECRETARIA_ADMINISTRATIVA);

        // Área Oficina de Recursos Humanos
        personaRecursosHumanos1 = new PersonaDependencia("Jorge", "Diaz", "jorgediaz@gmail.com", "JDK123TZ", TipoDependencia.OFICINA_RECURSOS_HUMANOS);
        personaRecursosHumanos2 = new PersonaDependencia("Elena", "Ruiz", "elenaruiz@gmail.com", "ERK123TZ", TipoDependencia.OFICINA_RECURSOS_HUMANOS);

        // Área Unidad de Atención al Usuario
        personaAtencionUsuario1 = new PersonaDependencia("Sofia", "Vargas", "sofiavargas@gmail.com", "SVK123TZ", TipoDependencia.UNIDAD_ATENCION_USUARIO);

        // Área Oficina de Quejas
        personaQuejas1 = new PersonaDependencia("Pablo", "Ortega", "pabloortega@gmail.com", "POK123TZ", TipoDependencia.OFICINA_QUEJAS);

        // Área Secretaría General
        personaSecretariaGeneral1 = new PersonaDependencia("Carmen", "Mendoza", "carmenmendoza@gmail.com", "CMK123TZ", TipoDependencia.SECRETARIA_GENERAL);
    }

    public static void configurarPersonalPorArea() {
        AreasServicios.areaRecepcionDocumentos.agregarPersona(personaRecepcion1);
        AreasServicios.areaRecepcionDocumentos.agregarPersona(personaRecepcion2);
        AreasServicios.areaRegistrosAcademicos.agregarPersona(personaRegistros1);
        AreasServicios.areaRegistrosAcademicos.agregarPersona(personaRegistros2);
        AreasServicios.areaTramiteDocumentario.agregarPersona(personaTramite1);
        AreasServicios.secretariaAcademica.agregarPersona(personaSecretariaAcademica1);
        AreasServicios.oficinaServicioGenerales.agregarPersona(personaServiciosGenerales1);
        AreasServicios.secretariaAdministrativa.agregarPersona(personaSecretariaAdmin1);
        AreasServicios.oficinaRecursosHumanos.agregarPersona(personaRecursosHumanos1);
        AreasServicios.oficinaRecursosHumanos.agregarPersona(personaRecursosHumanos2);
        AreasServicios.unidadAtencionUsuario.agregarPersona(personaAtencionUsuario1);
        AreasServicios.oficinaQuejas.agregarPersona(personaQuejas1);
        AreasServicios.secretariaGeneral.agregarPersona(personaSecretariaGeneral1);
    }
}
