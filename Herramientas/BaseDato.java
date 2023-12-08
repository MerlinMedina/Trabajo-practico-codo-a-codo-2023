package Herramientas;
/*
 * AQUI ESTÁN LAS VARIBLES GLOBALES
 */

public class BaseDato {

    // 1- Declaración e inicialización de variable global USUARIO y CLAVE
    public static String usuarioValido = "codo";
    public static String claveValido = "123";

    // 2- Declaración e inicialización de variable global SALDO
    public static double monto = 1000.00;

    // INICIALIZACION DE ARRAY DATOS
    public static String datos[] = { "xx.xxx.xxx", "Cosme", "Fulanito", "xxxxx xxxxx xxxxx xxxxx", "XXXXXXX-XXX/X",
            "xxxxxxx" };

    // INICIALIZACION DE VARIABE DEDUCCIÓN (para pagos y transferencias)(tambien es llamada para ultimo movimiento)
    public static double deduccion;

    // INICIALIZACION DE VARIABES ULTIMO MOVIMIENTO (para saber en que se realizó el último movimiento)
    public static String ultimoMovimiento = "";

    // INICIALIZACION DE VARIABES CBU (para saber el cbu de destino en último movimiento)
    public static int cbuDestino = 0;

}
