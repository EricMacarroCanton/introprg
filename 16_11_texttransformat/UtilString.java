/*exercici on hem de Desenvolupa un programa anomenat TransformaText, que demani un text i mostri una versió transformada segons les següents regles:

Les vocals (les catalanes) apareixeran en minúscules

Les lletres no vocals apareixeran en majúscules

Els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

La resta de caràcters, excepte els blancs, desapareixen a la versió transformada*/
public class UtilString {

    public static boolean esVocal(char c) {
        String vocals = "aeiouàèéíòóúüïAEIOUÀÈÉÍÒÓÚÜÏ";

        for (int i = 0; i < vocals.length(); i++) {
            if (c == vocals.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

