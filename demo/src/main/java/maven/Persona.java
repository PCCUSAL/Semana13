package maven;

/**
 * Clase Persona
 */
public class Persona {
    String nombre;
    String apellidos;
    String edad;
    String email;

    /**
     * Constructor con argumentos
     * @param nombre el nombre de la persona
     * @param apellidos los apellidos de la persona
     * @param edad la edad de la persona
     * @param email el email de la persona
     */
    public Persona(String nombre, String apellidos, String edad, String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    /**
     * Getter de email
     * @return el email de la persona
     */
    public String getEmail(){
        return this.email;
    }
}
