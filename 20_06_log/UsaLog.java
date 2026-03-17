/*Quan executem programes complexos, sol ser interessant poder registrar les situacions significatives que es van produint. Això ens permet a posteriori entre altres coses, auditar com s'ha executat, descobrir i reproduir errors.

Aquests registres es solen guardar en un fitxer de text amb una o més línies que descriuen què ha passat i sovint quan va passar. A aquest fitxer se'l sol conèixer com a fitxer de log.*/
import java.io.IOException;
public class UsaLog {
   public static void main(String[] args) throws IOException {
       Log.printError("Això és un error greu");
       Log.printWarning("Això és un avís");
       for (int i=0; i < args.length; i++) {
           Log.printInfo(String.format("Argument %d: %s", i, args[i]));
       }
       Log.reset();     // comencem a comptar un altre cop
       Log.printDebug("Aquí s'acaba el main()");
   }
}
}
