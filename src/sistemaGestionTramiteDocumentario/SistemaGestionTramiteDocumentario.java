package sistemaGestionTramiteDocumentario;

import interfaces.LandingPage;

public class SistemaGestionTramiteDocumentario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio.PersonalDependenciaServicio.configurarPersonalPorArea();
        Servicio.AreasServicios.configurarAreaPersonal();
        LandingPage main = new LandingPage();
        main.setVisible(true);

    }

}
