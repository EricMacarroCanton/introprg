###########################
Anotacions sobre propietats
###########################

* Autor/a: Eric Macarro 

* Data: 23/3/2026

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       int vides = 7;                // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``GatRenat.java``.

Si reanomeno el fitxer anterior a ``UnNomQualsevol.java``, em trobo el
següent resultat a l'hora de compilar:

GatRenat.java:1: error: class UnNomQualsevol is public, should be declared in a file named UnNomQualsevol.java
public class UnNomQualsevol


    $ javac UnNomQualsevol.java
    XXX

Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
    Al gat Renat li queden 7 vides

Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 6 és la 04.

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 02.

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

:Al gat Renat li queden 0 vides

    XXX

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

GatRenat.java:6: error: cannot find symbol
               renat = new GatRenat();   // creem la instància del gat Renat.
               ^
  symbol:   variable renat
  location: class GatRenat
GatRenat.java:7: error: cannot find symbol
               System.out.println("Al gat Renat li queden " + renat.vides + " vides");
                                                              ^
  symbol:   variable renat
  location: class GatRenat
2 errors


Penso que passa això perquè renat no conté res (es null) i intentem accedir-hi.

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè renat no conté l’objecte en si, sinó una adreça (referència) a l’objecte creat..

Crec que la  relació entre *referència* i *variable* és: una variable de tipus objecte guarda una referència a l’objecte, no l’objecte directament..


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: new GatRenat()

* la variable és: renat

* la referència és: renat

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències presenta la variable ``vides`` respecte les 
*variables globals* són:

1. vides és una propietat d’un objecte (variable d’instància), mentre que una variable global no pertany a cap objecte concret.

2. objecte GatRenat tindria la seva pròpia còpia de vides, mentre que una variable global és compartida per tot el programa.

