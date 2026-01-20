//d'aqui extreurem si cada lletra pertany o no a les vocals catalanes i retornarem valors booleans true/fals depenent si pertaynen o no
public class UtilString {

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'à' || c == 'è' || c == 'é'
            || c == 'í' || c == 'ï'
            || c == 'ò' || c == 'ó'
            || c == 'ú' || c == 'ü';
    }
}
