package Herramientas;
import java.util.*;

/*
 * En esta clase generamos los métodos para utilizar teclados 
 */

public class Teclado {
   
    // Declaramos e instanciamos el objeto Scanner
    static Scanner teclado = new Scanner(System.in);

    // 1- Metodo para leer datos tipo numerico double
    public static double numero() {
        return teclado.nextDouble();
    }

    // 2- Metodo para leer datos tipo String
    public static String texto() {
        return teclado.nextLine();
    }

    // 3- Presione enter para continuar, mejora la experiencia de usuario
    public static void  presioneEnter(){
        Imprimir.texto("");
        Imprimir.texto("Precione la tecla \"ENTER\" para continuar...");
        texto();
    }

    // 4- Metodo para cerrar el teclado
    public static void cerrar() {
        teclado.close();
    }
}