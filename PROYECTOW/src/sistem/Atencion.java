/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

public class Atencion {
    private Paciente paciente;
    private String fecha;
    private String diagnostico;
    private String observaciones;

    public Atencion(Paciente paciente, String fecha, String diagnostico, String observaciones) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.observaciones = observaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    


    public void mostrarAtencion() {
        System.out.println("--- ATENCIÓN MÉDICA ---");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("Observaciones: " + observaciones);    
    }
}