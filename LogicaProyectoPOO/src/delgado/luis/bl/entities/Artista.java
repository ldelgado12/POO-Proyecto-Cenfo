package delgado.luis.bl.entities;

/**
 * Clase que representa al artista de las canciones dentro de la aplicacion
 */

public class Artista extends Usuario{
//    /**
//     * El String que almacena el nombre del artista de la cancion
//      */
//    private String nombreArtista;
//    /**
//     * El String que almacena el apellido del artista
//     */
//    private String apellido;
    /**
     * El String que almacena el nombre artistico del artista de la cancion
     */
    private String nomAritstico;
    /**
     * El String que almacena la fecha de nacimiento del artista
     */
    private String fechaNacimiento;
    /**
     * El String que almacena la fecha de la defuncion del artista(si aplica)
     */
    private String fechaDefuncion;
    /**
     * El String que almacena el pais de nacimiento del artista
     */
    private String paisNacimiento;
    /**
     * El String que almacena el genero del artista
     */
    private String genero;
//    /**
//     * El String que almacena la edad del artista
//     */
//    private int edad;
    /**
     * El String que almacena una breve descripcion del artista
     */
    private String descripcion;

    /**
     * Inicializa los atributos en sus valores por defecto
     */

    public Artista() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param nombreArtista de la cancion presente en la aplicacion
     * @param apellido de la cancion presente en la aplicacion
     * @param nomAritstico de la cancion presente en la aplicacion
     * @param fechaNacimiento de la cancion presente en la aplicacion
     * @param fechaDefuncion de la cancion presente en la aplicacion
     * @param paisNacimiento de la cancion presente en la aplicacion
     * @param genero de la cancion presente en la aplicacion
     * @param edad de la cancion presente en la aplicacion
     * @param descripcion de la cancion presente en la aplicacion
     */

    public Artista(String nombreArtista, String apellido, String nomAritstico, String fechaNacimiento, String fechaDefuncion, String paisNacimiento, String genero, String edad, String descripcion) {

        super(nombreArtista, apellido, edad);
//        this.nombreArtista = nombreArtista;
//        this.apellido = apellido;
        this.nomAritstico = nomAritstico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
//        this.edad = edad;
        this.descripcion = descripcion;
    }

//    /**
//     * Acceso al atributo del nombre del artista
//     * @return del String del nombre del artista
//     */
//
//    public String getNombreArtista() {
//        return nombreArtista;
//    }
//
//    /**
//     * Modificador del valor del atributo del nombre del artista
//     * @param nombreArtista del String del nombre del artista
//     */
//    public void setNombreArtista(String nombreArtista) {
//        this.nombreArtista = nombreArtista;
//    }
//
//    /**
//     * Acceso al atributo del apellido del artista
//     * @return del String del apellido del artista
//     */
//    public String getApellido() {
//        return apellido;
//    }
//
//    /**
//     * Modificador del valor del atributo del apellido del artista
//     * @param apellido del String del apellido del artista
//     */
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }

    /**
     * Acceso al atributo del nombre artistico
     * @return del String del nombre artistico
     */
    public String getNomAritstico() {
        return nomAritstico;
    }

    /**
     * Modificador del valor del atributo del nombre artistico
     * @param nomAritstico del String del nombre artistico
     */
    public void setNomAritstico(String nomAritstico) {
        this.nomAritstico = nomAritstico;
    }

    /**
     * Acceso al atributo de la fecha de nacimiento
     * @return del String de la fecha de nacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Modificador del valor del atributo de la fecha de nacimiento
     * @param fechaNacimiento  del String de la fecha de nacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Acceso al atributo de la fecha de defuncion
     * @return del String de la fecha de defuncion
     */
    public String getFechaDefuncion() {
        return fechaDefuncion;
    }

    /**
     * Modificador del valor del atributo de la fecha de defuncion
     * @param fechaDefuncion  del String de la fecha de defuncion
     */
    public void setFechaDefuncion(String fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    /**
     * Acceso al atributo pais de nacimiento
     * @return del String pais de nacimiento
     */
    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     * Modificador del valor del atributo pais de nacimiento
     * @param paisNacimiento del String pais de nacimiento
     */
    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    /**
     * Acceso al atributo genero
     * @return del String genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Modificador del valor del atributo genero
     * @param genero del String genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

//    /**
//     * Acceso al atributo edad
//     * @return del String edad
//     */
//    public int getEdad() {
//        return edad;
//    }
//
//    /**
//     * Modificador del valor del atributo edad
//     * @param edad del String edad
//     */
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }

    /**
     * Acceso al atributo descripcion
     * @return del String de la descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modificador del valor del atributo descripcion
     * @param descripcion del String de la descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * metodo toString de la clase Artista
     * @return los parametros presentes en la clase artista
     */
    @Override
    public String toString() {
        return "Artista{" +
                "nomAritstico='" + nomAritstico + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", fechaDefuncion='" + fechaDefuncion + '\'' +
                ", paisNacimiento='" + paisNacimiento + '\'' +
                ", genero='" + genero + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Artista{" +
//                "nombreArtista='" + nombreArtista + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", nomAritstico='" + nomAritstico + '\'' +
//                ", fechaNacimiento='" + fechaNacimiento + '\'' +
//                ", fechaDefuncion='" + fechaDefuncion + '\'' +
//                ", paisNacimiento='" + paisNacimiento + '\'' +
//                ", genero='" + genero + '\'' +
//                ", edad=" + edad +
//                ", descripcion='" + descripcion + '\'' +
//                '}';
//    }
}
