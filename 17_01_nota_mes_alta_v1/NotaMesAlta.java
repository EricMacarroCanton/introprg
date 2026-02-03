/*Desenvolupa un programa que vagi demanant les notes obtingudes pels estudiants de programació en el darrer examen (com a mínim dues) i indiqui quina ha estat la nota més alta.

Les notes estaran representades en base 10 i, per tant, els valors vàlids són els números enters del 1 fins el 10*/
public class NotaMesAlta {
    public static void main(String[] args) {

        int nota;
        int notaMesAlta = 0;
        int comptador = 0;

        System.out.println("Introdueix les notes (-1 per finalitzar)");

        nota = Integer.parseInt(Entrada.readLine());

        while (nota >= 0) {

            comptador++;

            if (comptador == 1 || nota > notaMesAlta) {
                notaMesAlta = nota;
            }

            nota = Integer.parseInt(Entrada.readLine());
        }

        if (comptador < 2) {
            System.out.println("Com a mínim calen dues notes");
        } else {
            System.out.println("La nota més alta és " + notaMesAlta);
        }
    }
}

