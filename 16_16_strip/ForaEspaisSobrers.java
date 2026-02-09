//Desenvolupa un lloro que vagi demanant texts fins trobar la cadena buida o en blanc. Per cada text que rebi, que no correspongui a la condició de finalització, el lloro mostrarà la versió normalitzada.
public class ForaEspaisSobrers {

    public static void main(String[] args) {

        while (true) {
            System.out.println("El lloro espera un text");
            String text = Entrada.readLine();

            if (text.isBlank()) {
                break;
            }

            String normalitzat = UtilString.normalitzaBlancs(text);
            System.out.println("El lloro respon: \"" + normalitzat + "\"");
        }

        System.out.println("El lloro s'acomiada atentament");
    }
}


