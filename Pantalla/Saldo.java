package Pantalla;
import Herramientas.BaseDato;
import Herramientas.Imprimir;
import Herramientas.Teclado;

public class Saldo {

    // PANTALLA DE SALDO
    public static void saldo() {
        Imprimir.texto("********************************************************");
        Imprimir.texto(" SR: "+BaseDato.datos[1]+" SU SALDO DISPONIBLE ES $ " + BaseDato.monto);
        Imprimir.texto("********************************************************");
        Imprimir.texto("");
        Teclado.presioneEnter();
        Imprimir.borrarPantalla();
        Menu.menuVolverSalir();
    }
}
