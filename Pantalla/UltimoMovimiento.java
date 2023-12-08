package Pantalla;

import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;

/*
 * ESTA PANTALLA NOS MUESTRA LA ULTIMA OPERACION REALIZADA, EN CASO DE QUE SEA TRANSFERENCIA NOS MUESTRA EL CBU DE DESTINO.
 */

public class UltimoMovimiento {
    public static void ultimoMovimiento() {
        Mensaje.ultimoMovimiento();
        Imprimir.texto("SU ÚLTIMO MOVIMIENTO ES: -" + BaseDato.deduccion + " " + BaseDato.ultimoMovimiento);

        if (BaseDato.cbuDestino != 0) { // Condición que imprime el cbu si el último movimiento fué una transferencia
            Imprimir.texto("EL CBU DE DESTINO FUÉ: " + BaseDato.cbuDestino);
        }

        // Continua el programa y envía al menú volver/salir
        Teclado.presioneEnter();
        Imprimir.borrarPantalla();
        Menu.menuVolverSalir();
    }
}
