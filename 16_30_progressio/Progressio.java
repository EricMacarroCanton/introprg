
//creixents = les letres de la paraula van en ordre alfabetic creixent (amor = a>m>o>r)
//inrevés = les letres de la paraula van en ordre alfabetic creixent (roma = r<o<m<a)
//creixidecris = primer creix despres decreix
//decricreixis = primer decreix despres creix 
//normaleta = no pertany a cap (else)
public class Progressio {

    public static void main(String[] args) {

        System.out.println("Introduïu text. Enter per finalitzar.");
        String text = Entrada.readLine();

        System.out.println("\"" + text + "\"");

        Comparacio(text);
    }

        public static String[] Comparacio(String text) {

        String paraula = "";
	String[] paraules = new String[text.length()];
        int comptador = 0;

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c != ' ') {
                paraula += c;
            } else {
                paraules[comptador] = paraula;
                comptador++;
                paraula = "";
            }
            }
        return paraules;
    }
}

