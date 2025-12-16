public class Enters {
public static void main(String[] args) {

	System.out.println("Introdueix els texts a analitzar:");

while (true) {
	String text = Entrada.readLine();

// Finalitzar amb línia buida
if (text.length() == 0) {
	System.out.println("Adéu");
		break;
}

	boolean esEnter = false;
	boolean hiHaLletra = false;
	boolean hiHaAlgunCaracterValid = false;

	for (int i = 0; i < text.length(); i++) {
		char c = text.charAt(i);

		if (Character.isLetter(c)) {
			hiHaLletra = true;
		}

	if (!Character.isSpaceChar(c)) {
		hiHaAlgunCaracterValid = true;
		}
}

// És "enter" si:
// - no té lletres
// - no és només espais
		if (!hiHaLletra && hiHaAlgunCaracterValid) {
			esEnter = true;
}

		if (esEnter) {
			System.out.println("\"" + text + "\" és enter");
		} else {
			System.out.println("\"" + text + "\" no és enter");
			}
		}
	}
}
