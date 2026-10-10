
package sistem;

import java.util.List;

public class Paciente extends Persona {

    
    public Paciente(String nombre, String dni, int edad, String telefonoEmergencia, String sexo) {
        super(nombre, dni, edad, telefonoEmergencia, sexo);
    }

    public boolean aplicaCampanaInfantil() {
        return this.edad < 9;
    }

    public String obtenerEstadoCampana() {
        if (this.edad < 9) {
            return "CUMPLE (Campana Infantil contra Enfermedades - Menor de 9 anos)";
        } else if (this.edad >= 60) {
            return "CUMPLE (Campana Adulto Mayor - Hipertension y Diabetes)";
        } else {
            return "NO CUMPLE (No aplica a campanas prioritarias)";
        }
    }

   
    public static int contarMenores9ConReduce(List<Paciente> lista) {
        return lista.stream()
                .filter(p -> p.getEdad() < 9)
                .map(p -> 1)
                .reduce(0, (subtotal, uno) -> subtotal + uno);
    }

    public static int contarTotalPacientesConReduce(List<Paciente> lista) {
        return lista.stream()
                .map(p -> 1)
                .reduce(0, (acum, val) -> acum + val);
    }

    
    @Override
    public void mostrarDatos() {
        System.out.println("--- DATOS DEL PACIENTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Telefono de emergencia: " + telefonoEmergencia);
        System.out.println("Estado de campana: " + obtenerEstadoCampana());
    }

    void MostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}