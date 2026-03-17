/*Quan executem programes complexos, sol ser interessant poder registrar les situacions significatives que es van produint. Això ens permet a posteriori entre altres coses, auditar com s'ha executat, descobrir i reproduir errors.

Aquests registres es solen guardar en un fitxer de text amb una o més línies que descriuen què ha passat i sovint quan va passar. A aquest fitxer se'l sol conèixer com a fitxer de log.*/
public class Log {
    private static int comptador = 1;

    public static void reset() {
        comptador = 1;
    }
}
