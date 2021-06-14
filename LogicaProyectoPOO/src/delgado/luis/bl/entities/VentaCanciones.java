package delgado.luis.bl.entities;

/**
 *Clase venta que representa las canciones que estan a la venta en la aplicacion
 */

public class VentaCanciones {
    /**
     * El String que almacena el precio de las canciones
     */
    private int precioCancion;

    /**
     * Inicializa los atributos en sus valores por defecto
     */
    public VentaCanciones() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param precioCancion de la aplicacion
     */
    public VentaCanciones(int precioCancion) {
        this.precioCancion = precioCancion;
    }

    /**
     * Acceso al atributo precio de la cancion
     * @return del Int precio de la cancion
     */
    public int getPrecioCancion() {
        return precioCancion;
    }

    /**
     * Modificador del valor del atributo  precio de la cancion
     * @param precioCancion int precio de la cancion
     */
    public void setPrecioCancion(int precioCancion) {
        this.precioCancion = precioCancion;
    }

    /**
     * metodo toString de la clase venta de caniones
     * @return la variable presente en la clase de venta de canciones
     */
    @Override
    public String toString() {
        return "VentaCanciones{" +
                "precioCancion=" + precioCancion +
                '}';
    }
}
