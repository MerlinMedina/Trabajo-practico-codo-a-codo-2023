package Herramientas;

/*
Aqui van los textos de pantalla
 */

public class Mensaje {

    // 1- Mensaje de Bienvenida
    public static void bienvenida() {
        Imprimir.texto("********************************************************");
        Imprimir.texto("*** BIENVENIDO/A SR/A " + BaseDato.datos[1] + " AL BANCO CODO A CODO ***");
        Imprimir.texto("********************************************************");
    }

    // 2- Mensaje de Despedida
    public static void despedida() {
        Imprimir.borrarPantalla();
        Imprimir.texto("*****************************");
        Imprimir.texto(" *** HASTA LUEGO " + BaseDato.datos[1] + " ***");
        Imprimir.texto("*** EXTRAIGA SU TARJETA ***");
        Imprimir.texto("*****************************");
        Teclado.cerrar();
    }

    // 3- Mensaje de opción incorrecta
    public static void opcIncorrecta() {
        Imprimir.borrarPantalla();
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Imprimir.texto("¡OPCIÓN INCORRECTA, INGRESE UNA OPCIÓN CORRECTA!");
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Teclado.presioneEnter();
    }

    // 5- Mensaje Le resta un solo intento
    public static void ultimoIntento() {
        Imprimir.borrarPantalla();
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Imprimir.texto("¡OPCIÓN INCORRECTA, ULTIMO INTENTO!");
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Teclado.presioneEnter();
    }

    // 6- Mensaje de falta de fondos o cero
    public static void fondoInsuficiente() {
        Imprimir.texto("******************************************************************************");
        Imprimir.texto("LA OPERACION NO PUEDE REALIZARSE POR FALTA DE FONDOS O PUSO UN NÚMERO INVÁLIDO");
        Imprimir.texto("******************************************************************************");
    }

    // 7- Mensaje de error al ingresar un número
    public static void errorNumero() {
        Imprimir.texto("");
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!");
        Imprimir.texto("¡DEBE INGRESAR UN NÚMERO!");
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!");
        Imprimir.texto("");
    }

    // 8- Encabezado Transferencia
    public static void transferencia() {
        Imprimir.texto("*********************************************");
        Imprimir.texto("*** USTED VA A REALIZAR UNA TRANSFERENCIA ***");
        Imprimir.texto("*********************************************");
        Imprimir.texto("");
    }

    // 9- Encabezado pagos online Agua
    public static void agua() {
        Imprimir.texto("********************************");
        Imprimir.texto("*** USTED VA A PAGAR EL AGUA ***");
        Imprimir.texto("********************************");
        Imprimir.texto("");
    }

    // 10- Encabezado pagos online Luz
    public static void luz() {
        Imprimir.texto("*******************************");
        Imprimir.texto("*** USTED VA A PAGAR LA LUZ ***");
        Imprimir.texto("*******************************");
        Imprimir.texto("");
    }

    // 11- Encabezado pagos online Luz
    public static void netflix() {
        Imprimir.texto("********************************");
        Imprimir.texto("*** USTED VA A PAGAR NETFLIX ***");
        Imprimir.texto("********************************");
        Imprimir.texto("");
    }

    // 12- Encabezado Ultimo Movimiento
    public static void ultimoMovimiento() {
        Imprimir.texto("***********************************************");
        Imprimir.texto("*** USTED A SOLICITADO EL ULTIMO MOVIMIENTO ***");
        Imprimir.texto("***********************************************");
        Imprimir.texto("");
    }

    // 13- Mensaje No hay mas intentos
    public static void sinIntentos() {
        Imprimir.borrarPantalla();
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Imprimir.texto("¡OPCIÓN INCORRECTA, NO LE QUEDAN MAS INTENTOS!");
        Imprimir.texto("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Teclado.presioneEnter();
    }

    // 14- Encabezado Modificar Alias
    public static void alias() {
        Imprimir.borrarPantalla();
        Imprimir.texto("*****************************************");
        Imprimir.texto("*** USTED ESTÁ POR MODIFICAR EL ALIAS ***");
        Imprimir.texto("*****************************************");
        Imprimir.texto("");
    }

    // 13- Mensaje Nuevo Alias
    public static void nuevoAlias() {
        Imprimir.borrarPantalla();
        Imprimir.texto("******************************");
        Imprimir.texto("USTED A MODIFICADO SU ALIAS");
        Imprimir.texto("SU NUEVO ALIAS ES: " + BaseDato.datos[5]);
        Imprimir.texto("******************************");
        Teclado.presioneEnter();
    }

    // 14- Mensaje Inicio de sesión Exitoso
    public static void inicio() {
        Imprimir.borrarPantalla();
        Imprimir.texto("**************************************");
        Imprimir.texto("*** ¡¡¡INICIO DE SESIÓN EXITOSO!!! ***");
        Imprimir.texto("**************************************");
        Teclado.presioneEnter();
    }
}
