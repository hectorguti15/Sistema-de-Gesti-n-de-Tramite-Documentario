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
}
