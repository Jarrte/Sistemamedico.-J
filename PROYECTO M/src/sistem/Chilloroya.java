
package sistem;

import java.util.Scanner;

public class Chilloroya {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        GestorPacientes gestor = new GestorPacientes();

        int opcion;

        do {

            System.out.println();
            System.out.println("=================================");
            System.out.println("          SISTEMA MEDICO");
            System.out.println("=================================");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Ver pacientes registrados");
            System.out.println("3. Salir");
            System.out.println("=================================");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {

                case 1:

                    System.out.println();
                    System.out.println("=== REGISTRO DE PACIENTE ===");

                    // DATOS DEL PACIENTE
                    System.out.print("Ingrese nombre del paciente: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Ingrese DNI: ");
                    String dni = entrada.nextLine();

                    System.out.print("Ingrese edad: ");
                    int edad = Integer.parseInt(entrada.nextLine());

                    System.out.print("Ingrese telefono de emergencia: ");
                    String telefono = entrada.nextLine();

                    System.out.print("Ingrese sexo: ");
                    String sexo = entrada.nextLine();

                    Paciente paciente = new Paciente(
                            nombre,
                            dni,
                            edad,
                            telefono,
                            sexo     
                    );

                    // VERIFICAR SI YA EXISTE
                    boolean registrado = gestor.registrarPaciente(paciente);

                    if (!registrado) {
                        System.out.println("No se puede registrar nuevamente este paciente.");
                        break;
                    }

                    // DATOS DE LA ATENCIÓN
                    System.out.println();
                    System.out.println("=== DATOS DE LA ATENCION ===");

                    System.out.print("Ingrese fecha de atencion: ");
                    String fecha = entrada.nextLine();

                    System.out.print("Ingrese diagnostico o enfermedad: ");
                    String diagnostico = entrada.nextLine();

                    System.out.print("Ingrese observaciones: ");
                    String observaciones = entrada.nextLine();

                    Atencion atencion = new Atencion(
                            paciente,
                            fecha,
                            diagnostico,
                            observaciones 
                            
                    );

                    // DATOS DEL MEDICAMENTO
                    System.out.println();
                    System.out.println("=== MEDICAMENTO ===");

                    System.out.print("Ingrese nombre del medicamento: ");
                    String nombreMedicamento = entrada.nextLine();

                    System.out.print("Ingrese codigo del medicamento: ");
                    String codigoMedicamento = entrada.nextLine();

                    System.out.print("Ingrese cantidad disponible: ");
                    int cantidad = Integer.parseInt(entrada.nextLine());

                    System.out.print("Ingrese stock minimo: ");
                    int stockMinimo = Integer.parseInt(entrada.nextLine());

                    Medicamento medicamento = new Medicamento(
                            nombreMedicamento,
                            codigoMedicamento,
                            cantidad,
                            stockMinimo
                    );

                    // DATOS DEL MÉDICO
                    System.out.println();
                    System.out.println("=== DATOS DEL MEDICO ===");

                    System.out.print("Ingrese nombre del medico: ");
                    String nombreMedico = entrada.nextLine();

                    System.out.print("Ingrese especialidad: ");
                    String especialidad = entrada.nextLine();

                    Medico medico = new Medico(
                            nombreMedico,
                            especialidad
                    );

                    // DATOS DE LA CITA
                    System.out.println();
                    System.out.println("=== CITA MEDICA ===");

                    System.out.print("Ingrese fecha de la cita: ");
                    String fechaCita = entrada.nextLine();

                    System.out.print("Ingrese hora de la cita: ");
                    String horaCita = entrada.nextLine();

                    System.out.print("Ingrese estado de la cita: ");
                    String estadoCita = entrada.nextLine();

                    Citamedica cita = new Citamedica(
                            paciente,
                            medico,
                            fechaCita,
                            horaCita,
                            estadoCita
                    );

                    System.out.println();
                    System.out.println("=================================");
                    System.out.println("     PACIENTE REGISTRADO");
                    System.out.println("=================================");

                    atencion.mostrarAtencion();
                    System.out.println();

                    medicamento.mostrarMedicamento();
                    System.out.println();

                    cita.MostrarDatos();
                    
                    

                    break;

                case 2:

                    System.out.println();
                    gestor.mostrarPacientes();
                    int total = Paciente.contarTotalPacientesConReduce(gestor.getListaPacientes());
                    int menores9 = Paciente.contarMenores9ConReduce(gestor.getListaPacientes());
                    System.out.println("Total de pacientes registrados: " + total);
                    System.out.println("Pacientes menores de 9 anos aptos para campana: " + menores9);
                    break;

                   

                case 3:

                    System.out.println();
                    System.out.println("=================================");
                    System.out.println("      SISTEMA FINALIZADO");
                    System.out.println("=================================");

                    break;

                default:

                    System.out.println("Opcion no válida.");

            }

        } while (opcion != 3);

        entrada.close();
    }
}