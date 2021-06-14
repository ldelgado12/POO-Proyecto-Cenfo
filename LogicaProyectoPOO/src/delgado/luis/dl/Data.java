package delgado.luis.dl;

import delgado.luis.bl.entities.*;

import java.util.ArrayList;

/**
 * Almancena los datos y todas las operaciones relacionadas con el almacenamiento
 */

public class Data {
    /**
     *Almacena el arreglo de datos de todos los albunes
     */
    private ArrayList <Albun> albunes;
    /**
     *Almacena el arreglo de datos de todos los artistas
     */
    private ArrayList <Artista> artistas;
    /**
     *Almacena el arreglo de datos de todas las canciones
     */
    private ArrayList<Cancion> canciones;
    /**
     *Almacena el arreglo de datos de todos los compositores
     */
    private ArrayList<Compositor> compositores;
    /**
     *Almacena el arreglo de datos de todas las listas de reproduccion
     */
    private ArrayList<ListaReproduccion> listasRepro;
    /**
     *Almacena el arreglo de datos de todos los usuarios
     */
    private ArrayList<Usuario> usuarios;
    /**
     *Almacena el arreglo de datos de los usuarios administradores
     */
    private ArrayList<UsuarioAdm> usuarioAdms;
    /**
     *Almacena el arreglo de datos de todas las ventas de canciones
     */
    private ArrayList<VentaCanciones>  ventaCanciones;

    /**
     *Constructor por defecto
     */
    public Data(){

    }

    /**
     *Registra las ventas de las canciones, si no existe arreglo lo crea.
     * @param ventaCancion de las ventas de las canciones
     */
    public void agregarVentaCanciones(VentaCanciones ventaCancion){
        if (ventaCanciones == null){
            ventaCanciones =  new ArrayList<>();
            ventaCanciones.add(ventaCancion);
        }else{
            ventaCanciones.add(ventaCancion);
        }

    }

    /**
     * Lista todas las ventas de canciones que se han efectuado en la aplicacion
     * @return la lista de la venta de canciones
     */
    public String[] listarVentaCanciones(){
        String[] listarVentaCanciones = new String[ventaCanciones.size()];
        int i = 0;
        for (VentaCanciones dato : ventaCanciones){
            listarVentaCanciones[i] = dato.toString();
            i++;
        }
        return listarVentaCanciones;
    }

    /**
     *Registra los usuarios adms, si no existe arreglo lo crea.
     * @param usuarioAdm el usuario administrador
     */
    public void agregarUsuariosAdms(UsuarioAdm usuarioAdm){
        if (usuarioAdms == null){
            usuarioAdms =  new ArrayList<>();
            usuarioAdms.add(usuarioAdm);
        }else{
            usuarioAdms.add(usuarioAdm);
        }

    }

    /**
     * Lista todos los usuarios administradores de la aplicacion
     * @return la lista de los usuarios admi
     */
    public String[] listarUsuariosAdms(){
        String[] listarUsuariosAdms = new String[usuarioAdms.size()];
        int i = 0;
        for (UsuarioAdm dato : usuarioAdms){
            listarUsuariosAdms[i] = dato.toString();
            i++;
        }
        return listarUsuariosAdms;
    }

    /**
     *Registra los usuarios que desean utilizar la aplicacion, si no existe arreglo lo crea.
     * @param usuario el usuario nuevo de la aplicacion
     */
    public void agregarUsuarios(Usuario usuario){
        if (usuarios == null){
            usuarios =  new ArrayList<>();
            usuarios.add(usuario);
        }else{
            usuarios.add(usuario);
        }

    }

    /**
     * lista todos los usuarios de la aplicacion
     * @return la lista de los usuarios
     */
    public String[] listarUsuarios(){
        String[] listarUsuarios = new String[usuarios.size()];
        int i = 0;
        for (Usuario dato : usuarios){
            listarUsuarios[i] = dato.toString();
            i++;
        }
        return listarUsuarios;
    }

    /**
     *Registra las ventas de las canciones, si no existe arreglo lo crea.
     * @param listaReproduccion de la lista de reproduccion de canciones.
     */
    public void agregarListaRepro(ListaReproduccion listaReproduccion){
        if (listasRepro == null){
            listasRepro =  new ArrayList<>();
            listasRepro.add(listaReproduccion);
        }else{
            listasRepro.add(listaReproduccion);
        }

    }

    /**
     * Lista todas las canciones presentes en la lista de reproduccion
     * @return la lista de reproduccion de la aplicacion
     */
    public String[] listarListasRepro(){
        String[] listarListasRepro = new String[listasRepro.size()];
        int i = 0;
        for (ListaReproduccion dato : listasRepro){
            listarListasRepro[i] = dato.toString();
            i++;
        }
        return listarListasRepro;
    }

    /**
     *Registra los compositores de las canciones, si no existe arreglo lo crea.
     * @param compositor de la lista de las canciones
     */
    public void agregarComposito(Compositor compositor){
        if (compositores == null){
            compositores =  new ArrayList<>();
            compositores.add(compositor);
        }else{
            compositores.add(compositor);
        }

    }

    /**
     * lista todos los compositores presentes en la aplicacion
     * @return la lista de los compositores
     */
    public String[] listarCompositores(){
        String[] listarCompositores = new String[compositores.size()];
        int i = 0;
        for (Compositor dato : compositores){
            listarCompositores[i] = dato.toString();
            i++;
        }
        return listarCompositores;
    }

    /**
     *Registra los nuevos albuns agregados en la aplicacion, si no existe arreglo lo crea.
     * @param albun recien agregado a la aplicacion
     */
    public void agregarAlbun(Albun albun){
        if (albunes == null){
            albunes =  new ArrayList<>();
            albunes.add(albun);
        }else{
            albunes.add(albun);
        }

    }

    /**
     * lista de abunes presentes en la aplicacion
     * @return la lista de albunes de la aplicacion
     */
    public String[] listarAlbuns(){
        String[] listarAlbuns = new String[albunes.size()];
        int i = 0;
        for (Albun dato : albunes){
            listarAlbuns[i] = dato.toString();
            i++;
        }
        return listarAlbuns;
    }

    /**
     *Registra los nuevos artistas de la aplicacion, si no existe arreglo lo crea.
     * @param art recien agregado en la aplicacion
     */
    public void agregarArtista(Artista art){
        if (artistas == null){
            artistas =  new ArrayList<>();
            artistas.add(art);
        }else{
            artistas.add(art);
        }

    }

    /**
     * lista de artistas presentes en la aplicacion
     * @return la lista de los artistas
     */
    public String[] listarArtistas(){
        String[] listaArtistas = new String[artistas.size()];
        int i = 0;
        for (Artista dato : artistas){
            listaArtistas[i] = dato.toString();
            i++;
        }
        return listaArtistas;
    }

    /**
     *Registra las canciones, si no existe arreglo lo crea.
     * @param cancion recien agregada a la aplicacion
     */
    public void agregarCancion(Cancion cancion){
        if (canciones == null){
            canciones =  new ArrayList<>();
            canciones.add(cancion);
        }else{
            canciones.add(cancion);
        }

    }

    /**
     * lista todas las canciones presentes en la aplicacion
     * @return la lista de canciones de la aplicacion
     */
    public String[] listarCanciones(){
        String[] listarCanciones = new String[canciones.size()];
        int i = 0;
        for (Cancion dato : canciones){
            listarCanciones[i] = dato.toString();
            i++;
        }
        return listarCanciones;
    }

    //*************************************************
    //codigo nuevo

    public boolean buscarID (String id){
        for(Usuario e : usuarios){
            if (id.equals(e.getIdentificacion())){
                return true;
            }

        }
        return false;
    }










    /**
     *
     * @return
     */
    public ArrayList<Albun> getAlbunes() {
        return albunes;
    }

    /**
     *
     * @param albunes
     */
    public void setAlbunes(ArrayList<Albun> albunes) {
        this.albunes = albunes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    /**
     *
     * @param artistas
     */
    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    /**
     *
     * @param canciones
     */
    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     *
     * @return
     */
    public ArrayList<Compositor> getCompositores() {
        return compositores;
    }

    /**
     *
     * @param compositores
     */
    public void setCompositores(ArrayList<Compositor> compositores) {
        this.compositores = compositores;
    }

    /**
     *
     * @return
     */
    public ArrayList<ListaReproduccion> getListasRepro() {
        return listasRepro;
    }

    /**
     *
     * @param listasRepro
     */
    public void setListasRepro(ArrayList<ListaReproduccion> listasRepro) {
        this.listasRepro = listasRepro;
    }

    /**
     *
     * @return
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     *
     * @param usuarios
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     *
     * @return
     */
    public ArrayList<UsuarioAdm> getUsuarioAdms() {
        return usuarioAdms;
    }

    /**
     *
     * @param usuarioAdms
     */
    public void setUsuarioAdms(ArrayList<UsuarioAdm> usuarioAdms) {
        this.usuarioAdms = usuarioAdms;
    }

    /**
     *
     * @return
     */
    public ArrayList<VentaCanciones> getVentaCanciones() {
        return ventaCanciones;
    }

    /**
     *
     * @param ventaCanciones
     */
    public void setVentaCanciones(ArrayList<VentaCanciones> ventaCanciones) {
        this.ventaCanciones = ventaCanciones;
    }
}
