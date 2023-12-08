package Herramientas;
/*
 * En esta clase capturamos el sout y el borrar pantalla dentro de un método
 */

public class Imprimir {
   // public static boolean error = false;

    // 1- Método para imprimir texto por consola
    public static void texto(String txt) {
        System.out.println(txt);
    }

    // 2- Metodo para borrar pantalla
    public static void borrarPantalla() {
        System.out.print("\033[H\033[2J");
    }
    
}