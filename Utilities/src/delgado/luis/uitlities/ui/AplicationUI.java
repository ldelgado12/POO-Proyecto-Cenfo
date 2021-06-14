package delgado.luis.uitlities.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public abstract class AplicationUI {
    /**
     * Constructor por defecto
     */
    public AplicationUI(){

    }

    /**
     * agrega la informacion que digita el usuario
     */
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**
     * Stream para impresion de datos en pantalla
     */
    private PrintStream out = System.out;

    /**
     * lee la opcion del usuario
     * @return retorna el numero seleccionado
     * @throws java.io.IOException
     */

    public int leerOpcion() throws java.io.IOException{
        int opcion =0;
        out.println("Digite la opcion");
        opcion = Integer.parseInt(in.readLine());
        return opcion;
    }

    /**
     *
     * @param msj el mensaje que se va a retornar al usuario
     */

    public void imprimirMensaje(String msj){
        out.println(msj);
    }

    /**
     * lee la informacion agregada por el usurio
     * @return la informacion
     * @throws IOException
     */

    public String leerTexto() throws IOException {
        return in.readLine();
    }

    /**
     * muestra el menu de la aplicacion debe ser implementado por las clases hijas
     * @throws IOException
     */
    public abstract void mostrarMenu() throws IOException;
}
