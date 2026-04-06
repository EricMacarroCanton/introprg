//Si et passa com a mi, a hores d'ara t'hauràs encarinyant amb el gat Renat. Però no a tothom li passa. De fet, hi ha qui podria voler que nostre estimat amic l'espitxi. Per exemple, imagina't que algú el fa servir com a personatge d'un joc en el que pugui anar perdent vid
public class UsaGatRenat {
    public static void main(String[] args) {

        GatRenat renat = new GatRenat();

        for (int vides = 1; vides <= 3; vides++) {

            while (renat.esViu()) {
                System.out.println("Renat diu: " + renat.mor());
            }

            System.out.println("Renat diu: " + renat.mor()); // rematar
            System.out.println("Renat diu: " + renat.reviu(vides));
        }
    }
}
