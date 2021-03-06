public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    private int length;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            System.out.println("Error, longitud del nombre insuficiente");
        } 
        if (numeroMatricula.length() < 4){
            System.out.println("Error, longitud del numero de matricula insuficiente");
        } 
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String devolver = "";
        if (numeroMatricula.length() >= 4 & nombre.length() < 3){
            devolver = nombre + numeroMatricula.substring(0, 4);
        }
        if (numeroMatricula.length() < 4 & nombre.length() >= 3){
            devolver = nombre.substring(0, 3) + numeroMatricula;
        }
        if (numeroMatricula.length() < 4 & nombre.length() < 3){
            devolver = nombre + numeroMatricula;
        }
        if (numeroMatricula.length() >= 4 & nombre.length() >= 3){
            devolver = nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
        }
        return devolver;
    }
}