package delgado.luis.bl.entities;

/**
 * clase que representa a las canciones presentes en la aplicacion
 */

public class Cancion {

    protected String nombreCancion;
    /**
     * El String que almacena el genero de la cancion
     */
    protected String genero;
    /**
     * El String que almacena el artista de la cancion
     */
    protected String artista;
    /**
     * El String que almacena el compositor de la aplicacion
     */
    protected String compositor;
    /**
     * El String que almacena la fecha de lanzamiento de la cancion
     */
    protected String fechaLanzamiento;
    /**
     * El String que almacena el albun del la cancion
     */
    protected String albun;

    /**
     * Inicializa los atributos en sus valores por defecto
     */
    public Cancion() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param genero de la cancion dentro de la aplicacion
     * @param artista de la cancion dentro de la aplicacion
     * @param compositor de la cancion dentro de la aplicacion
     * @param fechaLanzamiento de la cancion dentro de la aplicacion
     * @param albun de la cancion dentro de la aplicacion
     */
    public Cancion(String nombreCancion,String genero, String artista, String compositor, String fechaLanzamiento, String albun) {
        this.nombreCancion = nombreCancion;
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.albun = albun;
    }

    public Cancion(String nombreCancion) {
    }

    public Cancion(String artista, String cancion) {
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    /**
     * Acceso al atributo del genero del artista
     * @return del string del genero del artista
     */

    public String getGenero() {
        return genero;
    }

    /**
     * Modificador del valor del atributo del genero del artista
     * @param genero del string del genero del artista
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Acceso al atributo artista
     * @return del string artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Modificador del valor del atributo artista
     * @param artista del string artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Acceso al atributo compositor
     * @return del string compositor
     */
    public String getCompositor() {
        return compositor;
    }

    /**
     * Modificador del valor del atributo compositor
     * @param compositor del string compositor
     */
    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    /**
     * Acceso al atributo de la fecha de lanzamiento
     * @return del string de la fecha de lanzamiento
     */
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Modificador del valor del atributo de la fecha de lanzamiento
     * @param fechaLanzamiento del string de la fecha de lanzamiento
     */
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Acceso al atributo del albun
     * @return del String del albun
     */
    public String getAlbun() {
        return albun;
    }

    /**
     * Modificador del valor del atributo del albun
     * @param albun del String del albun
     */
    public void setAlbun(String albun) {
        this.albun = albun;
    }

    /**
     * metodo toString de la clase cancion
     * @return las variables de la clase cancion
     */

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", genero='" + genero + '\'' +
                ", artista='" + artista + '\'' +
                ", compositor='" + compositor + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", albun='" + albun + '\'' +
                '}';
    }
}
