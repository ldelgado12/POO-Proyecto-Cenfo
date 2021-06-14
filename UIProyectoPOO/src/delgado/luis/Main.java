package delgado.luis;

import delgado.luis.tl.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static delgado.luis.tl.Controller.controlador;

/*
El MAIN ES EL PUNTO DE ENTRADA DE LA APLICACION
 */

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws java.io.IOException{

        controlador = new Controller();
        controlador.start();

    }
}







