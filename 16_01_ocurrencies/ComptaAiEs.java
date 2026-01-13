/*
En aquest programa crearem un programa que conti ocurrencies (lletra a i e), les compti, i ocmpari dient quina de les due te més en el text introduit.
*/
public class ComptaAiEs {
    public static void main(String[] args) {
    
        //demanem text
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();

        comptaLletra(entrada, 'a');
        comptaLletra(entrada, 'e');

        comparaOcurrencies(entrada, 'a', 'e');
    }

    public static void comptaLletra(String text, char lletra) {
        int comptador = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador++;
            }
        }
        System.out.println("Nombre de '" + lletra + "'s: " + comptador);
    }

    public static void comparaOcurrencies(String text, char lletra1, char lletra2) {
        int comptador1 = 0;
        int comptador2 = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptador1++;
            } else if (text.charAt(i) == lletra2) {
                comptador2++;
            }
        }

        if (comptador1 > comptador2) {
            System.out.println("Hi ha més '" + lletra1 + "'s que '" + lletra2 + "'s");
        } else if (comptador1 < comptador2) {
            System.out.println("Hi ha menys '" + lletra1 + "'s que '" + lletra2 + "'s");
        } else {
            System.out.println("Hi ha tantes '" + lletra1 + "'s com '" + lletra2 + "'s");
        }
    }
}

