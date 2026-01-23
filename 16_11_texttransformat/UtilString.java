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

