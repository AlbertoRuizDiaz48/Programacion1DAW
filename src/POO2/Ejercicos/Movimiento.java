package POO2.Ejercicos;

import java.util.Date;
class Movimiento
{
    Date fecha;
    char tipo;
    float importe;
    float saldo;
    public Movimiento (Date aFecha, char aTipo, float aImporte, float aSaldo) {
        fecha = aFecha;
        tipo = aTipo;
        importe = aImporte;
        saldo = aSaldo;
    }
}
