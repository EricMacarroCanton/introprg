
//creixents = les letres de la paraula van en ordre alfabetic creixent (amor = a>m>o>r)
//inrevés = les letres de la paraula van en ordre alfabetic creixent (roma = r<o<m<a)
//creixidecris = primer creix despres decreix
//decricreixis = primer decreix despres creix 
//normaleta = no pertany a cap (else)
public class Progressio {

    public static void main(String[] args) {
        System.out.println("Introduïu text. Enter per finalitzar.");
        String text = Entrada.readLine();  

        String[] paraules = Separar(text);


        for (int i = 0; i < paraules.length; i++) {
            if (paraules[i] != null) {
                int categoria = classifica(paraules[i]);
                mostraClassificacio(paraules[i], categoria);
            }
        }
    }


    public static String[] Separar(String text) {
        String paraula = "";
        String[] paraules = new String[text.length()]; 
        int comptador = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                paraula += c;
            } else {
                if (!paraula.equals("")) {
                    paraules[comptador] = paraula;
                    comptador++;
                    paraula = "";
                }
            }
        }

        if (!paraula.equals("")) {
            paraules[comptador] = paraula;
        }

        return paraules;
    }


    public static int classifica(String paraula) {

        if (paraula == null || paraula.length() == 0) return -2;

        for (int i = 0; i < paraula.length(); i++) {
            if (!Character.isLetter(paraula.charAt(i))) return -1;
        }

        boolean puja = false;
        boolean baixa = false;
        int canvis = 0;
        int direccioAnterior = 0;

        for (int i = 0; i < paraula.length() - 1; i++) {
            char actual = paraula.charAt(i);
            char seguent = paraula.charAt(i + 1);

            int direccio = 0;
            if (seguent > actual) {
                direccio = 1;
                puja = true;
            } else if (seguent < actual) {
                direccio = -1;
                baixa = true;
            }

            if (direccioAnterior != 0 && direccio != 0 && direccio != direccioAnterior) {
                canvis++;
            }

            if (direccio != 0) direccioAnterior = direccio;
        }

        if (puja && !baixa) return 1;
        else if (!puja && baixa) return 2;
        else if (canvis == 1 && puja) return 3;
        else if (canvis == 1 && baixa) return 4;
        else return 0;
    }

    // Mètode per mostrar una paraula i la seva classificació
    public static void mostraClassificacio(String paraula, int categoria) {
        
        }
    }






