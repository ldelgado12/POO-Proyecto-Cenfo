package delgado.luis.bl.entities;

/**
 * clase que representa al compositor de las canciones de la aplicacion
 */

public class Compositor extends Usuario {
//    /**
//     * El String que almacena el nombre del compositor
//     */
//    private String nombre;
//    /**
//     * El String que almacena el apellido del compositor
//     */
//    private String apellido;
    /**
     * El String que almacena el pais de nacimiento del compositor
     */
    private String paisNacimiento;
//    /**
//     * El String que almacena la edad del compositor
//     */
//    private int edad;
    /**
     * El String que almacena el genero del compositor
     */
    private String genero;
    /**
     * Inicializa los atributos en sus valores por defecto
     */
    public Compositor() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param nombre del compositor de la cancion
     * @param apellido del compositor de la cancion
     * @param paisNacimiento del compositor de la cancion
     * @param edad del compositor de la cancion
     * @param genero del compositor de la cancion
     */
    public Compositor(String nombre, String apellido, String paisNacimiento, String edad, String genero) {

        super(nombre, apellido, edad);

        //        this.nombre = nombre;
//        this.apellido = apellido;
        this.paisNacimiento = paisNacimiento;
//        this.edad = edad;
        this.genero = genero;
    }

//    /**
//     * Acceso al atributo del nombre del compositor
//     * @return del string del nombre del compositor
//     */
//    public String getNombre() {
//        return nombre;
//    }
//
//    /**
//     * Modificador del valor del atributo del nombre del compositor
//     * @param nombre del string del nombre del compositor
//     */
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    /**
//     * Acceso al atributo del apellido del compositor
//     * @return del string del apellido del compositor
//     */
//    public String getApellido() {
//        return apellido;
//    }
//
//    /**
//     * Modificador del valor del atributo del apellido del compositor
//     * @param apellido del string del apellido del compositor
//     */
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }

    /**
     * Acceso al atributo el pais de nacimiento del compositor
     * @return del string del pais de nacimiento del compositor
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Modificador del valor del atributo el pais de nacimiento del compositor
     * @param paisNacimiento del string del pais de nacimiento del compositor
     */
    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

//    /**
//     * Acceso al atributo de la edad del compositor
//     * @return del string de la edad del compositor
//     */
//    public int getEdad() {
//        return edad;
//    }
//
//    /**
//     * Modificador del valor del atributo de la edad del compositor
//     * @param edad del string de la edad del compositor
//     */
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }

    /**
     * Acceso al atributo del genero del compositor
     * @return string del genero del compositor
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Modificador del valor del atributo del genero del compositor
     * @param genero string del genero del compositor
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * metodo toString de la clase compositor
     * @return las variables presentes en la clase compositor
     */
    @Override
    public String toString() {
        return "Compositor{" +
                "paisNacimiento='" + paisNacimiento + '\'' +
                ", genero='" + genero + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Compositor{" +
//                "nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", paisNacimiento='" + paisNacimiento + '\'' +
//                ", edad=" + edad +
//                ", genero='" + genero + '\'' +
//                '}';
//    }



}
