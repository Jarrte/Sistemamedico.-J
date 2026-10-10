
package sistem;

public class Medico extends Persona {
    private String especialidad;

    public Medico(String nombre, String dni, int edad, String telefono, String sexo, String especialidad) {
        super(nombre, dni, edad, telefono, sexo);
        this.especialidad = especialidad;
    }

    // Constructor simplificado si solo tienes nombre y especialidad
    public Medico(String nombre, String especialidad) {
        super(nombre, "00000000", 0, "000000000", "No especificado");
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // POLIMORFISMO: Sobreescritura propia de Medico
    @Override
    public void mostrarDatos() {
        System.out.println("--- DATOS DEL MEDICO ---");
        System.out.println("Doctor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}