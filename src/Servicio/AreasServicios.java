package Servicio;

import modelos.AreaDependencia;
import modelos.PersonaDependencia;

public class AreasServicios {

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
    }

    public static void configurarAreaPersonal() {

        int tamañoTotal = 0;
        tamañoTotal += areaRecepcionDocumentos.getPersonalDependencia().length;
        System.out.println("1 : " + tamañoTotal);
        tamañoTotal += areaTramiteDocumentario.getPersonalDependencia().length;
        System.out.println("2 : " + tamañoTotal);
        tamañoTotal += areaRegistrosAcademicos.getPersonalDependencia().length;
        System.out.println("3 : " + tamañoTotal);
        tamañoTotal += secretariaAcademica.getPersonalDependencia().length;
        System.out.println("4 : " + tamañoTotal);
        tamañoTotal += oficinaServicioGenerales.getPersonalDependencia().length;
        System.out.println("5 : " + tamañoTotal);
        tamañoTotal += secretariaAdministrativa.getPersonalDependencia().length;
        System.out.println("6 : " + tamañoTotal);
        tamañoTotal += oficinaRecursosHumanos.getPersonalDependencia().length;
        System.out.println("7 : " + tamañoTotal);
        tamañoTotal += unidadAtencionUsuario.getPersonalDependencia().length;
        System.out.println("8 : " + tamañoTotal);
        tamañoTotal += oficinaQuejas.getPersonalDependencia().length;
        System.out.println("9 : " + tamañoTotal);
        tamañoTotal += secretariaGeneral.getPersonalDependencia().length;
        System.out.println("10 : " + tamañoTotal);

        PersonaDependencia[] personalDependencia = new PersonaDependencia[tamañoTotal];
        int index = 0;

        for (PersonaDependencia persona : areaRecepcionDocumentos.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }

        }
        for (PersonaDependencia persona : areaTramiteDocumentario.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : areaRegistrosAcademicos.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : secretariaAcademica.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : oficinaServicioGenerales.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : secretariaAdministrativa.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : oficinaRecursosHumanos.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : unidadAtencionUsuario.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : oficinaQuejas.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }
        for (PersonaDependencia persona : secretariaGeneral.getPersonalDependencia()) {
            if (persona != null) {
                personalDependencia[index++] = persona;
            }
        }

        AdministradorServicio.administrador.setPersonalDependencia(personalDependencia);
        System.out.println("SETEADO");
        
    }
    public static PersonaDependencia[] retornarPersonal(){
        return AdministradorServicio.administrador.getPersonalDependencia();
    }
}
