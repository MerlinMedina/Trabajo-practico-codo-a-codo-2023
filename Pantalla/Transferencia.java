package Pantalla;
/*
 * Aquí se encuentra la opción transferencia del menú. La misma solicita un CBU de destino
 */

import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;

public class Transferencia {

    public static void info() {
        Mensaje.transferencia();
        Validar.esDouble(); // Método de validación double, y modificiación de la variable BaseDato.deduccion
        Validar.esEntero(); // Método de validación entero, y modificiación de la variable BaseDato.cbuDestino

        // Bucle por solvencia
        if (Validar.solvencia(Validar.opc3)) { // Condición con un método que verifica la solvencia
            Imprimir.texto(""); // En caso exitoso
            Imprimir.texto("*** TRANSFERENCIA EXITOSA ***");
            BaseDato.monto -= BaseDato.deduccion; // Modifico el monto de la cuenta
            Imprimir.texto("SALDO DISPONIBLE: $ " + BaseDato.monto);
            BaseDato.ultimoMovimiento = "Por una Transferencia exitosa"; // Actualizo el ultimo movimiento

        } else { // En caso de insolvencia
            Mensaje.fondoInsuficiente();
            Imprimir.texto("");
            Imprimir.texto("SALDO DISPONIBLE: $ " + BaseDato.monto);
        }
        // Continua el programa y envía al menú volver/salir
        Teclado.presioneEnter();
        Imprimir.borrarPantalla();
        Menu.menuVolverSalir();
    }
}
