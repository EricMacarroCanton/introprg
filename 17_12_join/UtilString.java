// retorna un String format per les cadenes de text separades pel separador amb darrer separador
public class UtilString {

    
    public static String junta(String[] cadenes, String separador, String darrerSeparador) {
        if (cadenes == null || cadenes.length == 0) {
            return "";
        }

        if (cadenes.length == 1) {
            return cadenes[0];
        }

        String resultat = "";

        for (int i = 0; i < cadenes.length; i++) {
            resultat += cadenes[i];

            if (i < cadenes.length - 2) {
                resultat += separador;
            } else if (i == cadenes.length - 2) {
                resultat += darrerSeparador;
            }
        }

        return resultat;
    }

    // equivalent a junta(cadenes, separador, separador)
    public static String junta(String[] cadenes, String separador) {
        return junta(cadenes, separador, separador);
    }
}
