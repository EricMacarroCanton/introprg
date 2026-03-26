##########################################
Anotacions sobre les propietats protegides
##########################################

Autor/a: Raül Salesio Blasco

Data: 23/03/2026

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
propietats protegides dins de la programació orientada a objectes.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que el programa no compila i dona error.

Penso que passa perquè l’atribut vides està declarat com a private i no es pot accedir directament des d’una altra classe com ho es UsaGatRenat.

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que ara accedim a l’atribut mitjançant el mètode públic getVides() en lloc d’accedir-hi directament.

El resultat ara és:

El gat Renat té 7 vides

Penso que passa això perquè getVides() és un mètode public i permet accedir al valor de l’atribut privat de forma controlada.

Pregunta 3. Canviant valor
==========================

Per què des del main() de UsaGatRenat poguem dir que renat té 5 vides, cal fer servir el mètode setVides().

El codi de UsaGatRenat seria:

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        renat.setVides(5);
        System.out.println("El gat Renat té " + renat.getVides() + " vides");
    }
}

La sortida:

$ java UsaGatRenat
El gat Renat té 5 vides

La meva explicació és que el mètode setVides() permet modificar el valor si és vàlid, i després el getVides() retorna aquest nou valor.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, Ens trobem que el valor no canvia i continua sent 7.

El codi seria:

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        renat.setVides(-12);
        System.out.println("El gat Renat té " + renat.getVides() + " vides");
    }
}

La sortida:

$ java UsaGatRenat
El gat Renat té 7 vides

La meva explicació és que el setVides() només accepta valors ≥ 0, i ignora els valors absurds com -12

Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo que sí compila i s’executa correctament.

Comparant-lo amb la pregunta 1, veiem que ara sí es pot accedir a vides perquè estem dins de la mateixa classe.

La meva explicació és que private només restringeix l’accés des de fora de la classe, però dins la mateixa classe sí que es pot accedir directament als atributs.

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és sí, és possible, perquè si dins la pròpia classe s’accedeix directament a l’atribut (com al main() de GatRenat), es poden assignar valors sense passar pel setVides().


Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és que private protegeix les dades i impedeix l’accés directe des de fora de la classe, mentre que public permet accedir-hi mitjançant mètodes controlats.


Pregunta 8. Només getter
==========================

Aquesta implementació de ``GatRenat`` disposa de getter i de setter.
Aquests venen definits pels mòduls getVides() i setVides().

En cas que ``GatRenat`` només disposés de getter, el resultat seria si només hi hagués getter: podríem consultar el valor però no modificar-lo..

En canvi, si només en tingués setter el que passaria és que sii només hi hagués setter: podríem modificar el valor però no consultar-lo directament..

Finalment, si no en tingués cap dels dos, ens trobaríem que si no hi hagués cap: no podríem ni consultar ni modificar l’atribut des de fora de la classe..


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret, aquests mètodes serveixen per accedir i modificar atributs privats (encapsulació), mentre que abans els mètodes no tenien necessàriament aquesta funció de control d’accés a dades internes.




