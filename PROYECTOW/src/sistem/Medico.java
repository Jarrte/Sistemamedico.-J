/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem;

public class Medico {
    private String Nombre;
    private String Especialidad;

    public Medico(String Nombre, String Especialidad) {
        this.Nombre = Nombre;
        this.Especialidad = Especialidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Codigo) {
        this.Especialidad = Codigo;
    }

    public void MostrarDatos() {
        System.out.println("---DATOS DEL MEDICO---");
        System.out.println("Nombre del medico:" + Nombre);
        System.out.println("Especialidad:" + Especialidad);
    }

    @Override
    public String toString() {
        return Nombre + "(" + Especialidad + ")";
    }
}