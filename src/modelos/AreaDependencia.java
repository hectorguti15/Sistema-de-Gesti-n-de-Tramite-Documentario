package modelos;

import java.util.Arrays;

public class AreaDependencia {

    private String area;
    private PersonaDependencia[] personalDependencia;
    private int contadorPersonas;

    public AreaDependencia(String area, PersonaDependencia[] personalDependencia) {
        this.area = area;
        this.personalDependencia = new PersonaDependencia[1];
        this.contadorPersonas = 0;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public PersonaDependencia[] getPersonalDependencia() {
        return personalDependencia;
    }

    public void setPersonalDependencia(PersonaDependencia[] personalDependencia) {
        this.personalDependencia = personalDependencia;
    }

    public void agregarPersona(PersonaDependencia persona) {
        System.out.println("Length ");
        if (contadorPersonas == personalDependencia.length) {
            
            this.personalDependencia = Arrays.copyOf(personalDependencia, personalDependencia.length + 1);
            System.out.println("Length se suma" + personalDependencia.length);
        }
        personalDependencia[contadorPersonas] = persona;
        contadorPersonas++;
    }

}
