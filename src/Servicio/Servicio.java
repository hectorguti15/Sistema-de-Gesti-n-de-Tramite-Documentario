package Servicio;

import modelos.Administrador;
import modelos.AreaDependencia;
import modelos.PersonaDependencia;

public class Servicio {

    public static Administrador administrador;

    public static AreaDependencia areaRecepcionDocumentos;
    public static AreaDependencia areaTramiteDocumentario;
    public static AreaDependencia areaRegistrosAcademicos;
    public static AreaDependencia secretariaAcademica;
    public static AreaDependencia oficinaServicioGenerales;
    public static AreaDependencia secretariaAdministrativa;
    public static AreaDependencia oficinaRecursosHumanos;
    public static AreaDependencia unidadAtencionUsuario;
    public static AreaDependencia oficinaQuejas;
    public static AreaDependencia secretariaGeneral;

    static {
        administrador = new Administrador("Mario", "Lopez", "mlopez@gmail.com", "EDF173KZ", new PersonaDependencia[]{});

     
        areaRecepcionDocumentos = new AreaDependencia("Recepcion de documentos", new PersonaDependencia[]{});
        areaTramiteDocumentario = new AreaDependencia("Oficina de Trámite Documentario", new PersonaDependencia[]{});
        areaRegistrosAcademicos = new AreaDependencia("Oficina de Registros Académicos", new PersonaDependencia[]{});
        secretariaAcademica = new AreaDependencia("Secretaría Académica", new PersonaDependencia[]{});
        oficinaServicioGenerales = new AreaDependencia("Oficina de Servicios Generales", new PersonaDependencia[]{});
        secretariaAdministrativa = new AreaDependencia("Secretaría Administrativa", new PersonaDependencia[]{});
        oficinaRecursosHumanos = new AreaDependencia("Oficina de Recursos Humanos", new PersonaDependencia[]{});
        unidadAtencionUsuario = new AreaDependencia("Unidad de Atención al Usuario", new PersonaDependencia[]{});
        oficinaQuejas = new AreaDependencia("Oficina de Quejas", new PersonaDependencia[]{});
        secretariaGeneral = new AreaDependencia("Secretaría General", new PersonaDependencia[]{});

      
        // Área Recepcion de documentos
        PersonaDependencia personaRecepcion1 = new PersonaDependencia("Juan", "Pérez", "juanperez@gmail.com", 1001);
        PersonaDependencia personaRecepcion2 = new PersonaDependencia("Ana", "Gómez", "anagomez@gmail.com", 1002);
        areaRecepcionDocumentos.agregarPersona(personaRecepcion1);
        areaRecepcionDocumentos.agregarPersona(personaRecepcion2);

        // Área Trámite Documentario
        PersonaDependencia personaTramite1 = new PersonaDependencia("Carlos", "Ramírez", "carlosramirez@gmail.com", 1003);
        areaTramiteDocumentario.agregarPersona(personaTramite1);

        // Área Registros Académicos
        PersonaDependencia personaRegistros1 = new PersonaDependencia("María", "López", "marialopez@gmail.com", 1004);
        PersonaDependencia personaRegistros2 = new PersonaDependencia("Pedro", "Martínez", "pedromartinez@gmail.com", 1005);
        areaRegistrosAcademicos.agregarPersona(personaRegistros1);
        areaRegistrosAcademicos.agregarPersona(personaRegistros2);

        // Área Secretaría Académica
        PersonaDependencia personaSecretariaAcademica1 = new PersonaDependencia("Laura", "Hernández", "laurahernandez@gmail.com", 1006);
        secretariaAcademica.agregarPersona(personaSecretariaAcademica1);

        // Área Oficina de Servicios Generales
        PersonaDependencia personaServiciosGenerales1 = new PersonaDependencia("Luis", "Sánchez", "luissanchez@gmail.com", 1007);
        oficinaServicioGenerales.agregarPersona(personaServiciosGenerales1);

        // Área Secretaría Administrativa
        PersonaDependencia personaSecretariaAdmin1 = new PersonaDependencia("Ana", "Torres", "anatorres@gmail.com", 1008);
        secretariaAdministrativa.agregarPersona(personaSecretariaAdmin1);

        // Área Oficina de Recursos Humanos
        PersonaDependencia personaRecursosHumanos1 = new PersonaDependencia("Jorge", "Díaz", "jorgediaz@gmail.com", 1009);
        PersonaDependencia personaRecursosHumanos2 = new PersonaDependencia("Elena", "Ruiz", "elenaruiz@gmail.com", 1010);
        oficinaRecursosHumanos.agregarPersona(personaRecursosHumanos1);
        oficinaRecursosHumanos.agregarPersona(personaRecursosHumanos2);

        // Área Unidad de Atención al Usuario
        PersonaDependencia personaAtencionUsuario1 = new PersonaDependencia("Sofía", "Vargas", "sofiavargas@gmail.com", 1011);
        unidadAtencionUsuario.agregarPersona(personaAtencionUsuario1);

        // Área Oficina de Quejas
        PersonaDependencia personaQuejas1 = new PersonaDependencia("Pablo", "Ortega", "pabloortega@gmail.com", 1012);
        oficinaQuejas.agregarPersona(personaQuejas1);

        // Área Secretaría General
        PersonaDependencia personaSecretariaGeneral1 = new PersonaDependencia("Carmen", "Mendoza", "carmenmendoza@gmail.com", 1013);
        secretariaGeneral.agregarPersona(personaSecretariaGeneral1);
    }

    public static void main(String[] args) {
        // Aquí puedes agregar lógica adicional si es necesaria
    }
}
