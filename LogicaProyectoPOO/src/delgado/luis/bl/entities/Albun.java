package delgado.luis.bl.entities;

/**
 * Clase que representa el albun del las canciones en la aplicacion
 */

public class Albun extends Cancion{
    /**
     * El String que almacena el nombre del albun
     */
    private String nombre;
    /**
     * El String que almacena la fecha de lanzamiento del albun
     */
    private String lanzamiento;
    /**
     * El String que almacena el artista del albun
     */
//    private String artista;
//    /**
//     * El String que almacena la imagen del albun
//     */
    private String imagenAlbun;
    /**
     * El String que almacena la cacion principal del albun
     */
//    private String cancion;
//    /**
//     * Inicializa los atributos en sus valores por defecto
//     */
    public Albun() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param nombre del albun presente en la aplicacion
     * @param lanzamiento del albun presente en la aplicacion
     * @param artista del albun presente en la aplicacion
     * @param imagenAlbun del albun presente en la aplicacion
     * @param cancion del albun presente en la aplicacion
     */
    public Albun(String nombre, String lanzamiento, String artista, String imagenAlbun, String cancion) {

        super(artista, cancion);
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
//        this.artista = artista;
        this.imagenAlbun = imagenAlbun;
//        this.cancion = cancion;
    }

    /**
     * Acceso al atributo del nombre
     * @return del string del nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificador del valor del atributo nombre
     * @param nombre del string nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Acceso al atributo fecha de lanzamiento
     * @return del string lanzamiento
     */
    public String getLanzamiento() {
        return lanzamiento;
    }

    /**
     * Modificador del valor del atributo lanzamiento
     * @param lanzamiento del string lanzamiento
     */
    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
//
//    /**
//     * Acceso al atributo del artista
//     * @return del string artista
//     */
//    public String getArtista() {
//        return artista;
//    }
//
//    /**
//     * Modificador del valor del atributo artista
//     * @param artista del string artista
//     */
//    public void setArtista(String artista) {
//        this.artista = artista;
//    }

    /**
     * Acceso al atributo imagen de albun
     * @return del string imagen de albun
     */
    public String getImagenAlbun() {
        return imagenAlbun;
    }

    /**
     * Modificador del valor del atributo imagen de albun
     * @param imagenAlbun del string imagen de albun
     */

    public void setImagenAlbun(String imagenAlbun) {
        this.imagenAlbun = imagenAlbun;
    }

//    /**
//     * Acceso al atributo cancion
//     * @return del string cancion
//     */
//    public String getCancion() {
//        return cancion;
//    }
//
//    /**
//     * Modificador del valor del atributo cancion
//     * @param cancion del string cancion
//     */
//    public void setCancion(String cancion) {
//        this.cancion = cancion;
//    }

    /**
     * Metodo toString de la clase albun
     * @return los parametros de la clase albun
     */
    @Override
    public String toString() {
        return "Albun{" +
                "nombre='" + nombre + '\'' +
                ", lanzamiento='" + lanzamiento + '\'' +
                ", imagenAlbun='" + imagenAlbun + '\'' +
                ", nombreCancion='" + nombreCancion + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
