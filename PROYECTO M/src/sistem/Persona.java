
package sistem;


public class Persona {
    protected String nombre;
    protected String dni;
    protected int edad;
    protected String telefonoEmergencia;
    protected String sexo;

    public Persona(String nombre, String dni, int edad, String telefonoEmergencia, String sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.telefonoEmergencia = telefonoEmergencia;
        this.sexo = sexo;
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
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean esDniValido() {
        return dni != null && dni.matches("\\d{8}");
    }

    public boolean esTelefonoValido() {
        return telefonoEmergencia != null && telefonoEmergencia.matches("\\d{9}");
    }

    // Metodo base que sera sobreescrito polimorficamente
    public void mostrarDatos() {
        System.out.println("--- DATOS GENERALES ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Telefono de emergencia: " + telefonoEmergencia);
    }
}
