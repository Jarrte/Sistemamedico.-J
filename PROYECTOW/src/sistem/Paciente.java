
package sistem;

import java.util.List;

public class Paciente {
    private String nombre;
    private String dni;
    private int edad;
    private String TelefonoEmergencia;
    private String Sexo;

    public Paciente(String nombre, String dni, int edad, String TelefonoEmergencia, String Sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.TelefonoEmergencia = TelefonoEmergencia;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefonoEmergencia() {
        return TelefonoEmergencia;
    }

    public void setTelefonoEmergencia(String TelefonoEmergencia) {
        this.TelefonoEmergencia = TelefonoEmergencia;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public boolean esDniValido() {
        return dni != null && dni.matches("\\d{8}");
    }

    public boolean esTelefonoValido() {
        return TelefonoEmergencia != null && TelefonoEmergencia.matches("\\d{9}");
    }
    public boolean aplicaCampanaInfantil() {
        return this.edad < 9;
    }
   
    public String obtenerEstadoCampana() {
        if (this.edad < 9) {
            return "CUMPLE (Campaña Infantil contra Enfermedades - Menor de 9 años)";
        } else if (this.edad >= 60) {
            return "CUMPLE (Campaña Adulto Mayor - Hipertensión y Diabetes)";
        } else {
            return "NO CUMPLE (No aplica a campañas prioritarias)";
        }
    }

    public static int contarMenores9ConReduce(List<Paciente> lista) {
        return lista.stream()
                .filter(p -> p.getEdad() < 9)                     
                .map(p -> 1)                                      
                .reduce(0, (subtotal, uno) -> subtotal + uno);    
    }
    // Cuenta total de pacientes aplicando reduce
    public static int contarTotalPacientesConReduce(List<Paciente> lista) {
        return lista.stream()
                .map(p -> 1)
                .reduce(0, (acum, val) -> acum + val);            
    }

    
    

    public void MostrarDatos() {
        System.out.println("---INGRESE DATOS DEL PACIENTE---");
        System.out.println("Nombre del paciente:" + nombre);
        System.out.println("Dni del paciente:" + dni);
        System.out.println("Edad del paciente:" + edad);
        System.out.println("Sexo de la paciente:" + Sexo);
        System.out.println("Telefono del paciente:" + TelefonoEmergencia);
    }
}