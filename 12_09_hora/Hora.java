/*
En aquest exercici crearem un programa que llegeixi una cadena de numeros i la transformi en una hora.
*/
public class Hora {
    public static void main(String[] args) {

        
String textEntrada = Entrada.readLine();
        
       
if (textEntrada.isEmpty()) {
	textEntrada = "0";
        }
        

int midaText = textEntrada.length();
        
       
boolean totDigits = true;
        
if (midaText >= 1) {
	char caracter = textEntrada.charAt(0);
	if (caracter < '0' || caracter > '9') {
	totDigits = false;
            }
        }
if (midaText >= 2) {
	char caracter = textEntrada.charAt(1);
	if (caracter < '0' || caracter > '9') {
                totDigits = false;
            }
        }
if (midaText >= 3) {
	char caracter = textEntrada.charAt(2);
	if (caracter < '0' || caracter > '9') {
                totDigits = false;
            }
        }
if (midaText >= 4) {
	char caracter = textEntrada.charAt(3);
	if (caracter < '0' || caracter > '9') {
                totDigits = false;
            }
        }
if (midaText >= 5) {
	char caracter = textEntrada.charAt(4);
	if (caracter < '0' || caracter > '9') {
                totDigits = false;
            }
        }
if (midaText >= 6) {
	char caracter = textEntrada.charAt(5);
	if (caracter < '0' || caracter > '9') {
                totDigits = false;
            }
        }

       
if (!totDigits || midaText > 6) {
            System.out.println("ERROR");
} else {
            
	int valorNumeric = Integer.parseInt(textEntrada);   
	int segonsCalc = valorNumeric % 100;    
        int minutsCalc = (valorNumeric / 100) % 100;
        int horesCalc = valorNumeric / 10000;
            
           
        if (horesCalc < 24 && minutsCalc < 60 && segonsCalc < 60) {
                String horesTxt = (horesCalc < 10 ? "0" + horesCalc : "" + horesCalc);
                String minutsTxt = (minutsCalc < 10 ? "0" + minutsCalc : "" + minutsCalc);
                String segonsTxt = (segonsCalc < 10 ? "0" + segonsCalc : "" + segonsCalc);
                System.out.println(horesTxt + ":" + minutsTxt + ":" + segonsTxt);
		} else {
			System.out.println("ERROR");
            }
        }
    }
}

