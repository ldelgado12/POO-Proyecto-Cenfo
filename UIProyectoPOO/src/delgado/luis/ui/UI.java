package delgado.luis.ui;

/*
IMPRIMIR Y LA TOMA DE DATOS DE LA APLICACION
 */

import delgado.luis.bl.entities.*;
import delgado.luis.dl.Data;
import delgado.luis.uitlities.ui.AplicationUI;
/**
 *
 */
import java.io.BufferedReader;
/**
 *
 */
import java.io.IOException;
/**
 *
 */
import java.io.InputStreamReader;
/**
 *
 */
import java.io.PrintStream;

/**
 *
 */
public class UI extends AplicationUI{
    /**
     * agrega la informacion que digita el usuario
     */
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**
     *
     */
    private PrintStream out = System.out;

    /**
     * Muestra las opciones del menu principal de la aplicacion.
     * @return
     */

    public void mostrarMenu()  {
        out.println("1. Registrar un albun");
        out.println("2. Registrar un artista");
        out.println("3. Registrar una cancion");
        out.println("4. Registrar un compositor");
        out.println("5. Registrar una lista de reproduccion");
        out.println("6. Registrar un usuario");
        out.println("7. Listar un albun");
        out.println("8. Listar un artista");
        out.println("9. Listar una cancion");
        out.println("10. Listar un compositor");
        out.println("11. Listar una lista de reproduccion");
        out.println("12. Listar un usuario");
        out.println("13. Salir");

    }


}











//    for (int i= 0; i<lista.size(); i ++){
//        Curso tmpCurso;
//        tmpCurso =  lista.get(i);
//        interfaz.imprimirMensaje(tmpCurso.toString())
//    }


//    public void main(String args[]) throws java.io.IOException
//    {
//        int opcion = -1;
//        do {
//            opcion = mostrarMenu();
//            procesarOpcion(opcion);
//        } while (opcion != 13);
//    }
