package delgado.luis.bl.logic;

import delgado.luis.bl.entities.*;
import delgado.luis.dl.Data;

import java.util.ArrayList;

/**
 *
 */

public class ProyectoLogica {

    /**
     * conector entre la base de datos y el paquete de la ligica
     */

    public Data datosGenerales = new Data();

    public ProyectoLogica(){}

    public void inicializarDatos(){
        if (datosGenerales == null){
            datosGenerales = new Data();
        }
    }

    /**
     * parametros presentes en el registro de todos los artistas
     * @param nombreArtista nombre del artista
     * @param apellido apellidos del artista
     * @param nomAritstico nombre artistico del nuevo artista
     * @param fechaNacimiento fecha de nacimiento del artista
     * @param fechaDefuncion fecha de la muerte del artista(si aplica)
     * @param paisNacimiento pais de nacimiento del artista
     * @param genero genero del artista
     * @param edad edad actual del artista
     * @param descripcion una descripcion breve sobre el artista
     */

    public void registrarArtistas (String nombreArtista, String apellido, String nomAritstico, String fechaNacimiento, String fechaDefuncion,
                                   String paisNacimiento, String genero, String edad, String descripcion){
        inicializarDatos();

        Artista nuevoArtista = new Artista(nombreArtista, apellido,nomAritstico, fechaNacimiento, fechaDefuncion,
                paisNacimiento, genero, edad, descripcion);

        datosGenerales.agregarArtista(nuevoArtista);

    }

    /**
     * metodo para listar los artistas
     * @return la lista de los artistas
     */
    public ArrayList<Artista> listarArtistas(){
        return datosGenerales.getArtistas();
    }


    /**
     * parametros presentes en el registro del albun nuevo
     * @param nombre nombre del albun
     * @param lanzamiento lanzamiento del albun
     * @param artista artista o artistas presentes en el albun
     * @param imagenAlbun imagen del albun
     * @param cancion cancion mas importante del albun
     */

    public void registrarAlbun (String nombre, String lanzamiento, String artista, String imagenAlbun, String cancion){

        inicializarDatos();

        Albun nuevoAlbun = new Albun(nombre, lanzamiento, artista, imagenAlbun, cancion);

        datosGenerales.agregarAlbun(nuevoAlbun);
    }

    /**
     * lista de todos los albunes
     * @return la lista de albunes presentes
     */
    public ArrayList<Albun> listarAlbuns(){
        return datosGenerales.getAlbunes();
    }

    /**
     * parametros presentes en el registro de cada cancion
     * @param genero genero de la cancion
     * @param artista artista que interpreta la canion
     * @param compositor compositor de la cancion
     * @param fechaLanzamiento fecha de lanzamiento de la cancion
     * @param albun albun en donde se encuentra la cancion
     */
    public void registrarCancion (String nombreCancion, String genero, String artista, String compositor, String fechaLanzamiento, String albun){

        inicializarDatos();

        Cancion nuevaCancion = new Cancion( nombreCancion, genero, artista, compositor, fechaLanzamiento, albun);

        datosGenerales.agregarCancion(nuevaCancion);
    }

    /**
     * lista de todas las canciones
     * @return la lista de las canciones
     */
    public ArrayList<Cancion> listarCanciones(){
        return datosGenerales.getCanciones();
    }

    /**
     * parametros presentes en el registro de los compositores
     * @param nombre nombre del compositor
     * @param apellido apellido del compositor
     * @param paisNacimiento pais de nacimiento del compositor
     * @param edad edad del compositor
     * @param genero genero del compositor
     */
    public void registrarCompositor (String nombre, String apellido, String paisNacimiento, String edad, String genero){

        inicializarDatos();

        Compositor nuevoCompositor = new Compositor(nombre, apellido, paisNacimiento, edad, genero);

        datosGenerales.agregarComposito(nuevoCompositor);
    }

    /**
     * lista de los compositores presentes en la aplicacion
     * @return la lista de compositores
     */
    public ArrayList<Compositor> listarCompositores(){
        return datosGenerales.getCompositores();
    }

    /**
     * parametros presentes en la lista de reproduccion
     * @param canciones canciones de la lista de reproduccion
     * @param fechaCreacion fecha de creacion de la lista de reproduccion
     * @param nombre nombre de la lista de reproduccion
     * @param calificacion calificacion agregada a la lista de reproduccion
     * @param colaReproduccion cola de reproduccion
     */
    public void registrarListasRepro (String canciones, String fechaCreacion, String nombre, String calificacion, String colaReproduccion){

        inicializarDatos();

        ListaReproduccion nuevoListaRepro = new ListaReproduccion(canciones, fechaCreacion, nombre, calificacion, colaReproduccion);

        datosGenerales.agregarListaRepro(nuevoListaRepro);
    }

    /**
     * lista de reproduccion de la aplicacion
     * @return la lista de todas las listas de reproduccion
     */
    public ArrayList<ListaReproduccion> listarListaRepro(){
        return datosGenerales.getListasRepro();
    }

    /**
     * parametros presentes al momento de agregar un usuario nuevo
     * @param nombre nombre del usuario
     * @param apellidos apellidos de nuevo usuario
     * @param edad edad del usuario
     * @param pais pais de nacimiento del usuario
     * @param identificacion identificacion del usuario
     * @param avatar avatar del usuario
     * @param correoElectronico correo electronico agregado por el usuario
     * @param nombreUsuario nombre de usuario
     * @param contrasenna contrasenna agregada por el usuario
     */
    public void registrarUsuarios (String nombre, String apellidos, String edad, String pais, String identificacion, String avatar, String correoElectronico, String nombreUsuario, String contrasenna){

        inicializarDatos();

        Usuario nuevoUsuario = new Usuario(nombre, apellidos, edad, pais, identificacion, avatar, correoElectronico, nombreUsuario, contrasenna);

        datosGenerales.agregarUsuarios(nuevoUsuario);
    }

    /**
     * lista de todos los usuarios presentes en la aplicacion
     * @return la lista de los usuarios
     */
    public ArrayList<Usuario> listarUsuarios(){
        return datosGenerales.getUsuarios();
    }

    /**
     *
     * @param nombreUsuario nombre de usuario
     * @param avatar avatar del usuario
     * @param nombre nombre del usuario administrativo
     * @param apellidos apellidos del usuario admin
     * @param contrasenna contrasenna agregada por el usuario admin
     * @param correoElectronico correo electronico del usuario administrativo
     */
    public void registrarUsuarioAdmin (String nombreUsuario, String avatar, String nombre, String apellidos, String contrasenna, String correoElectronico){

        inicializarDatos();

        UsuarioAdm nuevoUsuarioAdm = new UsuarioAdm(nombreUsuario, avatar, nombre, apellidos, contrasenna, correoElectronico);

        datosGenerales.agregarUsuariosAdms(nuevoUsuarioAdm);
    }

    /**
     * la lista de los usuarios administrativos de la aplicacion
     * @return lilsta de usuarios adms
     */
    public ArrayList<UsuarioAdm> listarUsuariosAdmi(){
        return datosGenerales.getUsuarioAdms();
    }

    /**
     * registra los precios/ventas de las canciones
     * @param precioCancion precio de la cancion
     */
    public void registrarPrecioCancion (int precioCancion){


        inicializarDatos();

        VentaCanciones nuevoPrecio = new VentaCanciones(precioCancion);

        datosGenerales.agregarVentaCanciones(nuevoPrecio);
    }

    /**
     * lista del precio de las canciones
     * @return la lista de ventas
     */
    public ArrayList<VentaCanciones> listarPrecioCanciones(){
        return datosGenerales.getVentaCanciones();
    }


    //*************************************
    //CODIGO NUEVO

    public boolean buscarIdentificacion(String id){
        return datosGenerales.buscarID(id);
    }


}

