/* En aquest exercici crearem un programa junt a un UtilString que realitzarales mateixes funcions que l'exercici 15_06 però els càlculs els realitzarà una funció dins la llibreria */
public class CadenaContinua {
    public static void main(String[] args) {

        System.out.println("Text?");
        String cadenaOriginal = Entrada.readLine();

        if (cadenaOriginal.isEmpty()) {
            System.out.println("error");
            return;
        }

        System.out.println("Nombre?");
        String entradaNumero = Entrada.readLine();

        if (!UtilString.esEnter(entradaNumero)) {
            System.out.println("error");
            return;
        }

        int longitudCadena = Integer.parseInt(entradaNumero);

        // si és menor que 1, acabem sense imprimir res
        if (longitudCadena < 1) {
            return;
        }

        System.out.println(UtilString.cadenaContinua(cadenaOriginal, longitudCadena));
    }
}
