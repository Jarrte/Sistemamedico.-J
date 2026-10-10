/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

import java.util.ArrayList;
import java.util.List;

public class GestorPacientes {

    private ArrayList<Paciente> pacientes;

    // Constructor
    public GestorPacientes() {
        pacientes = new ArrayList<>();
    }

    // Registrar paciente y evitar duplicados por DNI
    public boolean registrarPaciente(Paciente paciente) {

        if (paciente == null) {
            System.out.println("ERROR: El paciente no puede estar vacío.");
            return false;
        }

        // Verificar si el DNI ya existe
        for (Paciente p : pacientes) {

            if (p.getDni().equals(paciente.getDni())) {
                System.out.println("ERROR: El paciente ya está registrado.");
                System.out.println("DNI duplicado: " + paciente.getDni());
                return false;
            }
        }

        // Registrar paciente
        pacientes.add(paciente);

        // Guardar copia de seguridad
        ArchivoPacientes.guardarPaciente(paciente);

        System.out.println("Paciente registrado correctamente.");

        return true;
    }
    
    

    // Mostrar todos los pacientes registrados
    public void mostrarPacientes() {

        System.out.println("--- PACIENTES REGISTRADOS ---");

        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
            return;
        }

        for (Paciente paciente : pacientes) {

            paciente.MostrarDatos();

            System.out.println("-----------------------------");
        }
    }

    // Buscar paciente por DNI
    public Paciente buscarPacientePorDni(String dni) {

        for (Paciente paciente : pacientes) {

            if (paciente.getDni().equals(dni)) {
                return paciente;
            }
        }

        return null;
    }

    // Cantidad de pacientes registrados
    public int cantidadPacientes() {
        return pacientes.size();
    }

    List<Paciente> getListaPacientes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}