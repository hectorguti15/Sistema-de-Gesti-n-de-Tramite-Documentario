
package Servicio;

import modelos.PersonaDependencia;


public class PersonalDependenciaServicio {
    static{
        // Área Recepcion de documentos
        PersonaDependencia personaRecepcion1 = new PersonaDependencia("Juan", "Pérez", "juanperez@gmail.com", "JPK123TZ");
        PersonaDependencia personaRecepcion2 = new PersonaDependencia("Ana", "Gómez", "anagomez@gmail.com", "AGK123TZ");
        AreasServicios.areaRecepcionDocumentos.agregarPersona(personaRecepcion1);
        AreasServicios.areaRecepcionDocumentos.agregarPersona(personaRecepcion2);

        // Área Trámite Documentario
        PersonaDependencia personaTramite1 = new PersonaDependencia("Carlos", "Ramírez", "carlosramirez@gmail.com", "CR123TZ");
        AreasServicios.areaTramiteDocumentario.agregarPersona(personaTramite1);

        // Área Registros Académicos
        PersonaDependencia personaRegistros1 = new PersonaDependencia("María", "López", "marialopez@gmail.com", "MPK123TZ");
        PersonaDependencia personaRegistros2 = new PersonaDependencia("Pedro", "Martínez", "pedromartinez@gmail.com", "PMK123TZ");
        AreasServicios.areaRegistrosAcademicos.agregarPersona(personaRegistros1);
        AreasServicios.areaRegistrosAcademicos.agregarPersona(personaRegistros2);

        // Área Secretaría Académica
        PersonaDependencia personaSecretariaAcademica1 = new PersonaDependencia("Laura", "Hernández", "laurahernandez@gmail.com", "LHK123TZ");
        AreasServicios.secretariaAcademica.agregarPersona(personaSecretariaAcademica1);

        // Área Oficina de Servicios Generales
        PersonaDependencia personaServiciosGenerales1 = new PersonaDependencia("Luis", "Sánchez", "luissanchez@gmail.com", "LSK123TZ");
        AreasServicios.oficinaServicioGenerales.agregarPersona(personaServiciosGenerales1);

        // Área Secretaría Administrativa
        PersonaDependencia personaSecretariaAdmin1 = new PersonaDependencia("Ana", "Torres", "anatorres@gmail.com", "ATK123TZ");
        AreasServicios.secretariaAdministrativa.agregarPersona(personaSecretariaAdmin1);

        // Área Oficina de Recursos Humanos
        PersonaDependencia personaRecursosHumanos1 = new PersonaDependencia("Jorge", "Díaz", "jorgediaz@gmail.com", "JDK123TZ");
        PersonaDependencia personaRecursosHumanos2 = new PersonaDependencia("Elena", "Ruiz", "elenaruiz@gmail.com", "ERK123TZ");
        AreasServicios.oficinaRecursosHumanos.agregarPersona(personaRecursosHumanos1);
        AreasServicios.oficinaRecursosHumanos.agregarPersona(personaRecursosHumanos2);

        // Área Unidad de Atención al Usuario
        PersonaDependencia personaAtencionUsuario1 = new PersonaDependencia("Sofía", "Vargas", "sofiavargas@gmail.com", "SVK123TZ");
        AreasServicios.unidadAtencionUsuario.agregarPersona(personaAtencionUsuario1);

        // Área Oficina de Quejas
        PersonaDependencia personaQuejas1 = new PersonaDependencia("Pablo", "Ortega", "pabloortega@gmail.com", "POK123TZ");
        AreasServicios.oficinaQuejas.agregarPersona(personaQuejas1);

        // Área Secretaría General
        PersonaDependencia personaSecretariaGeneral1 = new PersonaDependencia("Carmen", "Mendoza", "carmenmendoza@gmail.com", "CMK123TZ");
        AreasServicios.secretariaGeneral.agregarPersona(personaSecretariaGeneral1);
    }
}
