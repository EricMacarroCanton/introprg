//UtilStringUtilStringUtilStringUtilStringUtilStringUtilStringUtilStringUtilStringUtilString
public class UtilString {


public static boolean esVocal(char lletra) {
String vocales = "aeiouàèéíïòóúü";

for (int i = 0; i < vocales.length(); i++) {
if (lletra == vocales.charAt(i)) {
return true;
}
}
return false;
}

public static String inverteix(String text) {

String textAlReves = "";

for (int i = text.length() - 1; i >= 0; i--) {

char letra = text.charAt(i);
textAlReves+= letra;

}

return textAlReves;


}

public static String cometeja(String text) {

String cometja = "";

for (int i = 0; i < text.length(); i++) {

char letra = text.charAt(i);

if (Character.isWhitespace(letra)) {

continue;

} else if (i == text.length() - 1) {

cometja+= letra;

} else {

cometja+= letra + ", ";
}


}

return cometja;

}


public static char normalitzaChar(char c) {

String ambAccent = "àèéíïòóúüçÀÈÉÍÏÒÓÚÜÇ";
String senseAccent = "aeeiioouucAEEIIOOUUC";

for (int i = 0; i < ambAccent.length(); i++) {

if (c == ambAccent.charAt(i)) {
return senseAccent.charAt(i);
}
}

return c;
}


public static String normalitzaText(String text) {

String resultat = "";

for (int i = 0; i < text.length(); i++) {
resultat += normalitzaChar(text.charAt(i));
}
return resultat;
}


public static String normalitzaBlancs(String text) {

String resultat = "";
boolean ultimaEraEspai = true;

for (int i = 0; i < text.length(); i++) {

char c = text.charAt(i);

if (Character.isWhitespace(c)) {

ultimaEraEspai = true;

} else {

if (!resultat.isEmpty() && ultimaEraEspai) {
resultat += " ";

}

resultat += c;
ultimaEraEspai = false;
}
}

return resultat;
}

public static boolean esEnter(String s) {

if (s == null || s.isEmpty()) return false;

int inicio = 0;

if (s.charAt(0) == '-' || s.charAt(0) == '+') {
if (s.length() == 1) return false;
inicio = 1;
}

for (int i = inicio; i < s.length(); i++) {
if (!Character.isDigit(s.charAt(i))) {
return false;
}
}
return true;
}



public static String entreComes(int[] numeros, char sep) {
if (numeros.length == 0) {
return "";
}

String resultat = "" + numeros[0];
for (int i = 1; i < numeros.length; i++) {
resultat += sep + " " + numeros[i];
}
return resultat;
}



public static String[] separa(String texto, boolean incluirBlancos) {


if (texto == null || texto.isEmpty()) {
return new String[0];
}

String[] resultado = new String[texto.length()];
int indice = 0;
String bloque = "";

boolean esBlancoAnterior = Character.isWhitespace(texto.charAt(0));

for (int i = 0; i < texto.length(); i++) {

char c = texto.charAt(i);
boolean esBlanco = Character.isWhitespace(c);

if (incluirBlancos) {
if (esBlanco == esBlancoAnterior) {
bloque += c;
} else {
resultado[indice++] = bloque;
bloque = "" + c;
esBlancoAnterior = esBlanco;
}
} else {
if (!esBlanco) {
bloque += c;
} else if (!bloque.equals("")) {
resultado[indice++] = bloque;
bloque = "";
}
}
}

if (!bloque.equals("")) {
resultado[indice++] = bloque;
}


String[] finalResult = new String[indice];
for (int i = 0; i < indice; i++) {
finalResult[i] = resultado[i];
}

return finalResult;
}

public static String[] separa(String texto) {
return separa(texto, false);
}


public static String junta(String[] cadenes, String separador, String darrerSeparador) {


if (cadenes == null || cadenes.length == 0) {

return "";
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

public static String junta(String[] cadenes, String separador) {
return junta(cadenes, separador, separador);
}











}
