/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

public class Citamedica {
    private Paciente paciente;
    private Medico medico;
    private String Fecha;
    private String Hora;
    private String EstadodelPaciente;

    public Citamedica(Paciente paciente, Medico medico, String Fecha, String Hora, String EstadodelPaciente) {
        this.paciente = paciente;
        this.medico = medico;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.EstadodelPaciente = EstadodelPaciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getEstadodelPaciente() {
        return EstadodelPaciente;
    }

    public void setEstadodelPaciente(String EstadodelPaciente) {
        this.EstadodelPaciente = EstadodelPaciente;
    }

    public void MostrarDatos() {
        System.out.println("---Datos de la Cita Medica---");
        System.out.println("Datos del paciente:" + paciente);
        System.out.println("Fecha de la atención Medica:");
        System.out.println("Fecha:"  + Fecha +  "Hora de la Atención:"  + Hora);
        System.out.println("Estado del paciente:" + EstadodelPaciente);
        System.out.println("Medico:" + medico);
    }
}
