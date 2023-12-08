package Pantalla;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;

/**
 * Aquí estan los 4 menús que se utilizan en el programa. el MENU PRINCIPAL, EL
 * DE VOLVER Y SALIR, el de PAGOS ONLINE y el de MODIFICAR ALIAS.
 */
public class Menu {

    // 1- MENÚ PRINCIPAL
    public static void menuPrincipal() {
        String opc;

        do {
            Imprimir.borrarPantalla();
            Mensaje.bienvenida();
            Imprimir.texto("SELECCIONE LA OPERACION A REALIZAR");
            Imprimir.texto("[1] CONSULTA DE DATOS");
            Imprimir.texto("[2] SALDO");
            Imprimir.texto("[3] TRANSFERENCIA");
            Imprimir.texto("[4] PAGO ONLINE");
            Imprimir.texto("[5] ÚLTIMO MOVIMIENTO");
            Imprimir.texto("[6] SALIR");
            Imprimir.texto("********************************************************");

            // Instruccion entrada para ingresar a la opción
            opc = Teclado.texto();

            // Estructura de control que chequea la respuesta
            if (Validar.error(opc)) {
                Mensaje.opcIncorrecta();
            } else {
                switch (opc) {
                    case "1":
                        Imprimir.borrarPantalla();
                        DatosPersonales.datos();
                        break;
                    case "2":
                        Imprimir.borrarPantalla();
                        Saldo.saldo();
                        break;
                    case "3":
                        Imprimir.borrarPantalla();
                        Transferencia.info();
                        break;
                    case "4":
                        Imprimir.borrarPantalla();
                        menuPagos();
                        break;
                    case "5":
                        Imprimir.borrarPantalla();
                        UltimoMovimiento.ultimoMovimiento();
                        break;
                    case "6":
                        Mensaje.despedida();
                        return;
                }
            }
        } while (Validar.error(opc));// CONDICION QUE VERIFICA OPCION INCORRECTA
    }

    // 2- MENÚ VOLVER - SALIR
    public static void menuVolverSalir() {
        String opc;

        do {
            Imprimir.borrarPantalla();
            Imprimir.texto("******************************************");
            Imprimir.texto("SELECCIONE LA OPCIÓN QUE DESEA REALIZAR");
            Imprimir.texto("[1] VOLVER AL MENU DE INICIO");
            Imprimir.texto("[2] SALIR DEL HOMEBANKING");
            Imprimir.texto("******************************************");

            // Instruccion entrada para ingresar a la opción
            opc = Teclado.texto();

            // Estructura de control que chequea la respuesta
            if (Validar.errorVolverSalir(opc)) {// CONDICION QUE VERIFICA OPCION INCORRECTA
                Mensaje.opcIncorrecta();
            } else {
                switch (opc) {
                    case "1":
                        Menu.menuPrincipal();
                        break;
                    case "2":
                        Mensaje.despedida();
                        return;
                }
            }
        } while (Validar.errorVolverSalir(opc));// CONDICION QUE VERIFICA OPCION INCORRECTA
    }

    // 3- MENÚ PAGOS ONLILNE
    public static void menuPagos() {
        String opc;

        do {
            Imprimir.borrarPantalla();
            System.out.println("********* PAGOS ONLINE *********");
            System.out.println("SELECCIONE EL SERVICIO A PAGAR");
            System.out.println("[1] AGUA ");
            System.out.println("[2] LUZ");
            System.out.println("[3] NETFLIX");
            System.out.println("[4] VOLVER AL MENU DE INICIO");
            System.out.println("[5] SALIR DEL HOMBANKING");
            Imprimir.texto("************************************");

            // Instruccion entrada para ingresar a la opción
            opc = Teclado.texto();

            // Estructura de control que chequea la respuesta
            if (Validar.error(opc)) {// CONDICION QUE VERIFICA OPCION INCORRECTA
                Mensaje.opcIncorrecta();

                // Estructura switch pagos online
            } else {
                switch (opc) {
                    case "1":
                        Imprimir.borrarPantalla();
                        PagosOnLine.agua();
                        break;

                    case "2":
                        Imprimir.borrarPantalla();
                        PagosOnLine.luz();
                        break;

                    case "3":
                        Imprimir.borrarPantalla();
                        PagosOnLine.netflix();
                        break;

                    case "4":
                        Menu.menuPrincipal();
                        break;

                    case "5":
                        Mensaje.despedida();
                        return;
                }
            }
        } while (Validar.error(opc));// CONDICION QUE VERIFICA OPCION INCORRECTA
    }

    // 4- MENÚ MODIFICAR ALIAS
    public static void modificarAlias() {
        String opc;

        do {
            Imprimir.texto("");
            Imprimir.texto("**************************************************");
            Imprimir.texto("¿DESEA MODIFICAR EL ALIAS? (seleccione una opción)");
            Imprimir.texto("[1] MODIFICAR EL ALIAS");
            Imprimir.texto("[2] DEJARLO COMO ESTÁ");
            Imprimir.texto("**************************************************");

            // Instruccion entrada para ingresar a la opción
            opc = Teclado.texto();

            // Estructura de control que chequea la respuesta
            if (Validar.errorVolverSalir(opc)) {// CONDICION QUE VERIFICA OPCION INCORRECTA
                Mensaje.opcIncorrecta();
            } else {
                switch (opc) {
                    case "1":
                        ModificarAllias.alias();
                        break;
                    case "2":
                        Menu.menuVolverSalir();
                        return;
                }
            }
        } while (Validar.errorVolverSalir(opc));// CONDICION QUE VERIFICA OPCION INCORRECTA
    }
}