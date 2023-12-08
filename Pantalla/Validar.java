package Pantalla;

import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;

/**
 * Métodos para validar: acceso al login, opcion incorrecta menú principal y menú volver/salir,
 *                       solvencia para transferencias y pagos online, opcion incorrecta numero double.
 */
public class Validar {

    public static boolean error = false;
    public static boolean opc, op2, opc3;

    // 0- CONTROL DE ACCESO AL LOGIN
    public static boolean acceso(String usuario, String clave, String usuarioRegistro, String claveRegistro) {
        return usuario.equals(usuarioRegistro) && clave.equals(claveRegistro);
    }

    // 1- CONTROL DE OPCION INCORRECTA DEL MENÚ PRINCIPAL
    public static boolean error(String opc) {
        return !opc.equals("1") && !opc.equals("2") && !opc.equals("3")
                && !opc.equals("4") && !opc.equals("5") && !opc.equals("6");
    }

    // 2- CONTROL DE OPCION INCORRECTA DEL MENÚ VOLVER / SALIR
    public static boolean errorVolverSalir(String opc2) {
        return !opc2.equals("1") && !opc2.equals("2");
    }

    // 3- CONTROL DE SOLVENCIA PARA LAS TRANSFERENCIAS Y PAGOS ONLINE
    public static boolean solvencia(boolean opc3) {
        return (BaseDato.deduccion > 0) && (BaseDato.deduccion <= BaseDato.monto);
    }

    // 4- CONTROL DE OPCIÓN INCORRECTA AL NO INGRESAR UN NÚMERO DOUBLE Y MODIFICA LA VARIABLE "DEDUCCION"
    //    POR TRANSFERENCIA O POR PAGO ONLINE. 
    public static double esDouble() {
       BaseDato.deduccion = 0; // Actualizo variable a 0 porque si viene cargada y uno llega al limite de intentos tiene que estar en cero para que no se ejecute otra deducción.
       BaseDato.cbuDestino = 0; // Actualizo la variable global a 0 para que no aparezca el cbu en ultimos movimientos
        boolean esValido = false;
        int intentos = 0; // Contador
        while (!esValido && intentos < 5) { // Bucle para intentos erroneos (hasta 5 intentos)
            Imprimir.texto(" INGRESE EL MONTO A DEDUCIR:");
            String ingresoPorTeclado = Teclado.texto(); // Ingreso por teclado y guardo en variable local
            try { // Excepción
                BaseDato.deduccion = Double.parseDouble(ingresoPorTeclado); // Método para convertir String a double. y actualizo variable global
                esValido = true; // Actualización de bandera
            } catch (NumberFormatException e) { // Capturo el error
                intentos ++; // Actualizo contador
                if (intentos == 4) { // Condición para el último intento
                    Mensaje.ultimoIntento();
                } else if (intentos < 5) { // Condición para todos los otros intentos
                    Mensaje.errorNumero();
                }
            }
        }
        if (intentos == 5) { // Condición cuando no hay mas intentos
            Mensaje.sinIntentos();
            Menu.menuVolverSalir(); // Menú anidado
        }
        return BaseDato.deduccion; // Retorna la variable deduccion modificada
    }

    // 5- CONTROL DE OPCIÓN INCORRECTA AL NO INGRESAR UN NÚMERO ENTERO (para el CBU)
    public static int esEntero() {
        boolean esValido = false;
        int intentos = 0; // Contador
        while (!esValido && intentos < 5) { // Bucle para intentos erroneos (hasta 5 intentos)
            Imprimir.texto("INGRESE EL CBU DE DESTINO: ");
            String ingresoPorTeclado = Teclado.texto(); // Ingreso por teclado y guardo en variable local
            try { // Excepción
                BaseDato.cbuDestino = Integer.parseInt(ingresoPorTeclado); // Método para convertir String a entero. y actualizo variable global
                esValido = true; // Actualización de bandera
            } catch (NumberFormatException e) { // Capturo el error
                intentos ++; // Actualizo contador
                if (intentos == 4) { // Condición para el último intento
                    Mensaje.ultimoIntento();
                } else if (intentos < 5) { // Condición para todos los otros intentos
                    Mensaje.errorNumero();
                }
            }
        }
        if (intentos == 5) { // Condición cuando no hay mas intentos
            Mensaje.sinIntentos();
            Menu.menuVolverSalir(); // Menú anidado
        }
        return BaseDato.cbuDestino; // Retorna la variable deduccion modificada
    }
}