package maven;

/**
 * Clase Persona
 */
public class Persona {
    String nombre;
    String apellidos;
    int edad;
    String email;

    /**
     * Constructor con argumentos
     * @param nombre el nombre de la persona
     * @param apellidos los apellidos de la persona
     * @param edad la edad de la persona
     * @param email el email de la persona
     */
    public Persona(String nombre, String apellidos, int edad, String email){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    public static Persona factory(String cadena) {
        if(cadena == null){
            throw new IllegalArgumentException("No son válidos los argumentos");
        }

        String partes[] = cadena.split(",");

        if(partes.length !=4) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }

        try {
            int edad = Integer.parseInt(partes[2]);
            return new Persona(partes[0], partes[1], edad, partes[3]);
        }
        catch (Exception e) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }
    }

    /**
     * Getter de nombre
     * @return el nombre de la persona
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Getter de apellido/s
     * @return el apellido/s de la persona
     */
    public String getApellidos(){
        return this.apellidos;
    }

    /**
     * Getter de edad
     * @return la edad de la persona
     */
    public int getEdad(){
        return this.edad;
    }

    /**
     * Getter de email
     * @return el email de la persona
     */
    public String getEmail(){
        return this.email;
    }

    
}
