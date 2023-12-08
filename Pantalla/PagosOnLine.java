package Pantalla;
import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;

/*
Aqui está la pantalla PAGOS ONLINE
 */

public class PagosOnLine {

    // 1- PAGOS ONLINE AGUA
    public static void agua() {
        Mensaje.agua();
        Validar.esDouble(); // Método de validación double, y modificiación de la variable
                            // BaseDato.deduccion

        // Bucle por solvencia
        if (Validar.solvencia(Validar.opc3)) { // Condición con un método que verifica la solvencia
            Imprimir.texto("*** TRANSFERENCIA EXITOSA ***"); // En caso de exitoso
            BaseDato.monto -= BaseDato.deduccion; // Modifico el monto de la cuenta
            Imprimir.texto("SALDO DISPONIBLE: $ " + BaseDato.monto);
            BaseDato.ultimoMovimiento = "Por el pago del Agua"; // Actualizo el ultimo movimiento

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

    // 2- PAGOS ONLINE LUZ
    public static void luz() {
        Mensaje.luz();
        Validar.esDouble(); // Método de validación double, y modificiación de la variable
                            // BaseDato.deduccion

        // Bucle por solvencia
        if (Validar.solvencia(Validar.opc3)) { // Condición con un método que verifica la solvencia
            Imprimir.texto("*** TRANSFERENCIA EXITOSA ***"); // En caso de exitoso
            BaseDato.monto -= BaseDato.deduccion; // Modifico el monto de la cuenta
            Imprimir.texto("SALDO DISPONIBLE: $ " + BaseDato.monto);
            BaseDato.ultimoMovimiento = "Por el pago de la Luz"; // Actualizo el ultimo movimiento

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

    // 1- PAGOS ONLINE NETFLIX
    public static void netflix() {
        Mensaje.netflix();
        Validar.esDouble(); // Método de validación double, y modificiación de la variable
                            // BaseDato.deduccion

        // Bucle por solvencia
        if (Validar.solvencia(Validar.opc3)) { // Condición con un método que verifica la solvencia
            Imprimir.texto("*** TRANSFERENCIA EXITOSA ***"); // En caso de exitoso
            BaseDato.monto -= BaseDato.deduccion; // Modifico el monto de la cuenta
            Imprimir.texto("SALDO DISPONIBLE: $ " + BaseDato.monto);
            BaseDato.ultimoMovimiento = "Por el pago de netflix"; // Actualizo el ultimo movimiento

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
