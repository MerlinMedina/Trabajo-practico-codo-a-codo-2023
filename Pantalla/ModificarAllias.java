package Pantalla;
/*
 * AQUÍ ESTÁ PARA MODIFICAR EL ARRAY DE LOS DATOS, MODIFICA EL ALIAS Y LO PONE EN MAYUSCULAS
 */

import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;

public class ModificarAllias {
    public static void alias() {
        Mensaje.alias();
        Imprimir.texto("Ingrese el nuevo alias y presione enter para finalizar...");
        String aliasModificado = Teclado.texto(); // Declaración e inicialización de variable por entrada de teclado
        BaseDato.datos[5] = aliasModificado.toUpperCase(); // Método que pasa a mayúscula
        Mensaje.nuevoAlias();

        // CONTINÚA CON EL PROGRAMA Y LLAMA AL MENÚ VOLVER - SALIR
        Imprimir.borrarPantalla();
        Menu.menuVolverSalir();
    }

}
