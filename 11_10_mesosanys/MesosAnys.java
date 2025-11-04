/**
 * Nom del fitxer: MesosAnys.java
 * Autor:Eric
 Aquest programa demana a l'usuari un mes i un any,
 *   i mostra el mes anterior i el mes següent amb l'any corresponent.
*/
public class MesosAnys {
    public static void main(String[] args) {
 System.out.println("Mes?");
         int mes = Integer.parseInt(Entrada.readLine());

       System.out.println("Any?"); 
        int any = Integer.parseInt(Entrada.readLine());

        int mesAnterior;
        int anyAnterior;
        int mesSeguent;
        int anySeguent;


        if (mes == 1) {
            mesAnterior = 12;
            anyAnterior = any - 1;
        } else {
            mesAnterior = mes - 1;
            anyAnterior = any;
        }


        if (mes == 12) {
            mesSeguent = 1;
            anySeguent = any + 1;
        } else {
            mesSeguent = mes + 1;
            anySeguent = any;
        }

 
        System.out.println("Mes anterior " + mesAnterior + "/" + anyAnterior +
                           " i mes següent " + mesSeguent + "/" + anySeguent);
    }
}

