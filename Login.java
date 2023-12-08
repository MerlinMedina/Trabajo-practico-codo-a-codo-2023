/*
 * AQUÍ ESTÁ EL LOGIN CONTROL DE ACCESO AL MENÚ PRINCIPAL
 * Este método anida al resto
 */

import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Mensaje;
import Herramientas.Teclado;
import Pantalla.Menu;
import Pantalla.Validar;

public class Login {
    public static void acceso() {

        int intentos = 0; // Contador

        while (intentos < 3) { // BUCLE DEL INGRESO FALLIDO 
            Imprimir.texto("Ingrese su nombre de usuario:");
            String username = Teclado.texto(); // Declaro e inicializo la variable local por teclado
            Imprimir.texto("Ingrese su contraseña:");
            String password = Teclado.texto(); // Declaro e inicializo la variable local por teclado

            if (Validar.acceso(username, password, BaseDato.usuarioValido, BaseDato.claveValido)) {
                Mensaje.inicio();
                Menu.menuPrincipal(); // INGRESO AL MÉTODO ANIDADO
                return;

            } else {
                intentos++; // Actualizo contador
                if (intentos == 2) { // Si queda el último intento
                    Imprimir.borrarPantalla();
                    Mensaje.ultimoIntento();
                } else if (intentos < 3) { // Sinó envia mensaje de error
                    Imprimir.borrarPantalla();
                    Imprimir.texto("Nombre de usuario o contraseña incorrectos. Inténtalo de nuevo.");
                    Imprimir.texto("");
                }
            }
        }
        Imprimir.borrarPantalla();
        Imprimir.texto("Has alcanzado el límite de intentos. Por favor, inténtalo más tarde.");
        Teclado.cerrar();
        return;
    }
}