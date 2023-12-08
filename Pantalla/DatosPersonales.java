package Pantalla;
/*
 * AQUÍ ESTÁN LOS DATOS PERSONALES Y LLAMA AL MÉTODO ANIDADO MODIFICAR ALIAS.
 */

import Herramientas.BaseDato;
import Herramientas.Imprimir;

public class DatosPersonales {

    public static void datos() {
        Imprimir.texto("**************** DATOS PERSONALES ****************");
        Imprimir.texto("* NOMBRE TITULAR: " + BaseDato.datos[1]);
        Imprimir.texto("* APELLIDO TITULAR: " + BaseDato.datos[2]);
        Imprimir.texto("* DNI TITULAR: " + BaseDato.datos[0]);
        Imprimir.texto("* CBU (CLAVE BANCARIA UNIFORME): " +BaseDato.datos[3]);
        Imprimir.texto("* NUMERO DE CUENTA: " + BaseDato.datos[4]);
        Imprimir.texto("* ALIAS: " + BaseDato.datos[5]);
        Imprimir.texto("**************************************************");
        
        Menu.modificarAlias(); // Llama al método modificarAlias que pregunta si desea modificar el alias
    }
}
