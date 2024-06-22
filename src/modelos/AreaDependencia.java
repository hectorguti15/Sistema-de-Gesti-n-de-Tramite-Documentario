package modelos;

import java.util.Arrays;

public class AreaDependencia {

    private String area;
    private PersonaDependencia[] personalDependencia;
    private int contadorPersonas;

    public AreaDependencia(String area, PersonaDependencia[] personalDependencia) {
        this.area = area;
        this.personalDependencia = new PersonaDependencia[1];
        this.contadorPersonas = 1;
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
        if (contadorPersonas == personalDependencia.length) {
            personalDependencia = Arrays.copyOf(personalDependencia, personalDependencia.length + 1);
        }

        // Agregar la persona al arreglo
        personalDependencia[contadorPersonas] = persona;
        contadorPersonas++;
    }

}
