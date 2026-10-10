/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivoPacientes {

    public static void guardarPaciente(Persona paciente) {

        try {
            FileWriter archivo = new FileWriter("pacientes_backup.txt", true);

            archivo.write(
                "Paciente registrado - DNI: "
                + paciente.getDni()
                + " - Nombre: "
                + paciente.getNombre()
                + System.lineSeparator()
            );

            archivo.close();

            System.out.println("Copia de seguridad guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar la copia de seguridad.");
        }
    }
}