package delgado.luis.tl;

import delgado.luis.bl.entities.*;
import delgado.luis.bl.logic.ProyectoLogica;
import delgado.luis.ui.UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import delgado.luis.dl.Data;

/**
 * SE VA A COMUNICAR CON LA UI Y CON LA CL
 */

public class Controller {


//    private Data datos = new Data();

    /**
     * comunica la logica con el ui
     */
    private ProyectoLogica tranfDatos = new ProyectoLogica();

    /**
     *
     */
    public static Controller controlador;

    /**
     *
     */
    private UI interfaz= new UI();

    /**
     *
     */
    public Controller(){
    }

    /**
     * el metodo que inicia el app
     */
    public void start() throws IOException {
        int opcion;
        do {
        interfaz.mostrarMenu();
        opcion = interfaz.leerOpcion();
        procesarOpcion(opcion);
        } while (opcion != 13);

    }

    public ProyectoLogica aplicador;

    /**
     * Procesar las opciones del menu
     * @param pOpcion
     * @throws java.io.IOException
     */
    public void procesarOpcion(int pOpcion) throws java.io.IOException {
        switch (pOpcion)
        {
            case 1:
                registrarAlbun();
                break;
            case 2:
                registrarArtista();
                break;
            case 3:
                registrarCancion();
                break;
            case 4:
                registrarCompositor();
                break;
            case 5:
                registrarListaRepro();
                break;
            case 6:
                registrarUsuario();
                break;
            case 7:
                listarAlbun();
                break;
            case 8:
                listarArtista();
                break;
            case 9:
                listarCancion();
                break;
            case 10:
                listarCompositor();
                break;
            case 11:
                listarListaRepro();
                break;
            case 12:
                listarUsuario();
                break;
            case 13:
                interfaz.imprimirMensaje("Gracias por usar el sistema.");
                break;
            default:
                interfaz.imprimirMensaje("Opcion Invalida");
        }
    }

    /**
     * metodo para registrar un nuevo artista
     * @throws IOException
     */
    public void registrarArtista() throws IOException{

        String nombreArtista;
        String apellido;
        String nomAritstico;
        String fechaNacimiento;
        String fechaDefuncion;
        String paisNacimiento;
        String genero;
        String murio = "no";
        String edad;
        int date;

        String descripcion;

        interfaz.imprimirMensaje("Digite el nombre del artista");
        nombreArtista = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el apellido del artista");
        apellido = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre artistico");
        nomAritstico = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la fecha de nacimiento en formato AAAA,MM,DD");
//        do{
//            Calendar fechaNac = new GregorianCalendar();
//            Calendar fechaHoy = Calendar.getInstance();
//            int anoNac = fechaNac.get(Calendar.YEAR);
//            int anoHoy = fechaHoy.get(Calendar.YEAR);
//            int edad = anoHoy-anoNac;
//        }
        fechaNacimiento = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la fecha de defuncion");
        //agregar un if para preguntar si el artista murio o no
        fechaDefuncion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el pais de nacimiento");
        paisNacimiento = interfaz.leerTexto();;
        interfaz.imprimirMensaje("Digite el genero");
        genero = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la edad del artista");
        edad = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite una breve descripcion del artista");
        descripcion = interfaz.leerTexto();




        tranfDatos.registrarArtistas(nombreArtista, apellido, nomAritstico, fechaNacimiento, fechaDefuncion, paisNacimiento,  genero, edad, descripcion);


    }

    /**
     * metodo para registrar un nuevo albun
     * @throws java.io.IOException
     */
    public void registrarAlbun() throws java.io.IOException{
        String nombre;
        String lanzamiento;
        String artista;
        String imagenAlbun;
        String cancion;

        interfaz.imprimirMensaje("Digite el nombre del Albun");
        nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite La fecha de lanzamiento");
        lanzamiento = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre del artista");
        artista = interfaz.leerTexto();
        interfaz.imprimirMensaje("Imagen del albun");
        imagenAlbun = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre de al menos 1 cancion");
        cancion = interfaz.leerTexto();

        tranfDatos.registrarAlbun(nombre, lanzamiento, artista, imagenAlbun, cancion);

    }

    /**
     * metodo para registrar una nueva cancion
     * @throws java.io.IOException
     */
    public void registrarCancion() throws java.io.IOException{
        String genero;
        String artista;
        String compositor;
        String fechaLanzamiento;
        String albun;
        String nombreCancion;

        interfaz.imprimirMensaje("Digite el nombre de la cancion");
        nombreCancion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el genero de la cancion");
        genero = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre del Artista");
        artista = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre del compositor");
        compositor = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la fecha de lanzamiento de la cancion");
        fechaLanzamiento = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre del Albun");
        albun = interfaz.leerTexto();

        tranfDatos.registrarCancion(nombreCancion, genero, artista, compositor, fechaLanzamiento, albun);

    }

    /**
     * metodo para registrar un nuevo compositor
     * @throws java.io.IOException
     */
    public void registrarCompositor() throws java.io.IOException{

        String nombre;
        String apellido;
        String paisNacimiento;
        String edad;
        String genero;

        interfaz.imprimirMensaje("Digite el nombre del Compositor");
        nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite los apellidos del compositor");
        apellido = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el pais de nacimiento del compositor");
        paisNacimiento = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la edad del compositor");
        edad = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el genero del compositor");
        genero = interfaz.leerTexto();

        tranfDatos.registrarCompositor(nombre, apellido, paisNacimiento, edad, genero);

    }

    /**
     * metodo para registrar una nueva lista de reproduccion
     * @throws java.io.IOException
     */
    public void registrarListaRepro() throws java.io.IOException{

        String canciones;
        String fechaCreacion;
        String nombre;
        String calificacion;
        String colaReproduccion;

        interfaz.imprimirMensaje("Digite el nombre la cancion");
        canciones = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la fecha de creacion de la lista de reproduccion");
        fechaCreacion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre de la lista de reproduccion");
        nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite una calificacion para la lista");
        calificacion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Cola de Reproduccion");
        colaReproduccion = interfaz.leerTexto();

        tranfDatos.registrarListasRepro(canciones, fechaCreacion, nombre, calificacion, colaReproduccion);

    }

    /**
     * metodo para registrar un nuevo usuario
     * @throws java.io.IOException
     */
    public void registrarUsuario() throws java.io.IOException{

        String nombre;
        String apellidos;
        String edad;
        String pais;
        String identificacion;
        String avatar;
        String correoElectronico;
        String nombreUsuario;
        String contrasenna;

        interfaz.imprimirMensaje("Digite el nombre del usuario");
        nombre = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite los apellidos del usuario");
        apellidos = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la edad del usuario");
        edad = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el pais del usuario");
        pais = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la identificacion del usuario");
        identificacion = interfaz.leerTexto();
        //************************************************
        //codigo nuevo

        //tranfDatos.buscarIdentificacion(identificacion);

        //*******************************
        interfaz.imprimirMensaje("Avatar");
        avatar = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el correo electronico del usuario");
        correoElectronico = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite el nombre que el usuario desea en la aplicacion");
        nombreUsuario = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite la contrasenna");
        contrasenna = interfaz.leerTexto();

        tranfDatos.registrarUsuarios(nombre, apellidos, edad, pais, identificacion, avatar, correoElectronico, nombreUsuario, contrasenna);

    }

    /*
    *****************************
    * NUEVO
     */








    /**
     * metodo para listar los albunes presentes en la aplicacion
     * @throws java.io.IOException
     */
    public void listarAlbun() throws java.io.IOException{

        ArrayList<Albun> albunes = tranfDatos.listarAlbuns();

        interfaz.imprimirMensaje("----LISTA DE ALBUNES---");
        for (Albun dato : albunes){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }
    }

    /**
     *metodo para listar todos los artistas
     */
    public void listarArtista(){
        ArrayList<Artista> artistas = tranfDatos.listarArtistas();

        interfaz.imprimirMensaje("----LISTA DE ARTISTAS---");
        for (Artista dato : artistas){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }
    }

    /**
     * metodo para listar todas las canciones
     * @throws java.io.IOException
     */
    public void listarCancion() throws java.io.IOException{

        ArrayList<Cancion> canciones = tranfDatos.listarCanciones();

        interfaz.imprimirMensaje("----LISTA DE CANCIONES---");
        for (Cancion dato : canciones){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
                }
        }
    }

    /**
     * metodo para listar todos los compositores
     * @throws java.io.IOException
     */
    public void listarCompositor() throws java.io.IOException{

        ArrayList<Compositor> compositores = tranfDatos.listarCompositores();

        interfaz.imprimirMensaje("----LISTA DE COMPOSITORES---");
        for (Compositor dato : compositores){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }
    }

    /**
     * metodo para listar las listas de reproduccion
     * @throws java.io.IOException
     */
    public void listarListaRepro() throws java.io.IOException{

        ArrayList<ListaReproduccion> listasDeRepro = tranfDatos.listarListaRepro();

        interfaz.imprimirMensaje("----LISTA DE COMPOSITORES---");
        for (ListaReproduccion dato : listasDeRepro){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }
    }

    /**
     * metodo para listar los usuarios
     * @throws java.io.IOException
     */
    public void listarUsuario() throws java.io.IOException{

        ArrayList<Usuario> usuarios =  tranfDatos.listarUsuarios();

        interfaz.imprimirMensaje("----LISTA DE USUARIOS---");
        for (Usuario dato : usuarios){
            if (dato != null){
                interfaz.imprimirMensaje(dato.toString());
            }
        }
    }
}
