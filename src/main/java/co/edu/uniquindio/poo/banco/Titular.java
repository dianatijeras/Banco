package co.edu.uniquindio.poo.banco;

//Clase titular modela a una persona titular de una cuenta bancaria
public class Titular {

    private String nombres;
    private String apellidos;

    /**
     * Constructor de la clase Titular
     * @param nombres
     * @param apellidos
     */
    public Titular(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    /**
     *Getters y Setters
     */
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
