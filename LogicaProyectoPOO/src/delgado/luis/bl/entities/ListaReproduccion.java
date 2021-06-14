package delgado.luis.bl.entities;

/**
 * clase que representa a la lista de reproduccion de la aplicacion
 */

public class ListaReproduccion extends Cancion{
    /**
     * El String que almacena las canciones de la aplicacion
     */
    private String canciones;
    /**
     * El String que almacena la fecha de creacion de las canciones
     */
    private String fechaCreacion;
//    /**
//     * El String que almacena el nombre de las canciones
//     */
//    private String nombre;
    /**
     * El String que almacena la calificacion de las canciones
     */
    private String calificacion;
    /**
     * El String que almacena la cola de reproduccion
     */
    private String colaReproduccion;

    /**
     * Inicializa los atributos en sus valores por defecto
     */
    public ListaReproduccion() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param canciones de la lista de reproduccion
     * @param fechaCreacion de la lista de reproduccion
    // * @param nombre de la lista de reproduccion
     * @param calificacion de la lista de reproduccion
     * @param colaReproduccion de la lista de reproduccion
     */
    public ListaReproduccion(String canciones, String fechaCreacion, String nombreCancion, String calificacion, String colaReproduccion) {
        super(nombreCancion);
        this.canciones = canciones;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.colaReproduccion = colaReproduccion;
    }

    /**
     * Acceso al atributo de las canciones
     * @return del string de las canciones
     */

    public String getCanciones() {
        return canciones;
    }

    /**
     * Modificador del valor del atributo de las canciones
     * @param canciones del string de las canciones
     */
    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    /**
     * Acceso al atributo de la fecha de creacion
     * @return del string de la fecha de creacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Modificador del valor del atributo de la fecha de creacion
     * @param fechaCreacion del string de la fecha de creacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

//    /**
//     * Acceso al atributo del nombre
//     * @return del string del nombre
//     */
//    public String getNombre() {
//        return nombre;
//    }
//
//    /**
//     * Modificador del valor del atributo del nombre
//     * @param nombre del string del nombre
//     */
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }

    /**
     * Acceso al atributo de la calificacion
     * @return del string de la calificacion
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * Modificador del valor del atributo de la calificacion
     * @param calificacion del string de la calificacion
     */
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Acceso al atributo de la cola de reproduccion
     * @return del string de la cola de reproduccion
     */
    public String getColaReproduccion() {
        return colaReproduccion;
    }

    /**
     * Modificador del valor del atributo de la cola de reproduccion
     * @param colaReproduccion del string de la cola de reproduccion
     */
    public void setColaReproduccion(String colaReproduccion) {
        this.colaReproduccion = colaReproduccion;
    }

    /**
     * metodo toString de la clase lista de reproduccion
     * @return las variables presentes en la lista de reproduccion
     */
    @Override
    public String toString() {
        return "ListaReproduccion{" +
                "canciones='" + canciones + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", calificacion='" + calificacion + '\'' +
                ", colaReproduccion='" + colaReproduccion + '\'' +
                ", nombreCancion='" + nombreCancion + '\'' +
                '}';
    }
}
