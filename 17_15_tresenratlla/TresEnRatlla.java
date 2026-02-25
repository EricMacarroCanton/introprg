public class TresEnRatlla {
	public static void main(String[] args)  {
	
		char[] [] taulell = new char[3] [3];
//fem bucle for per emplenar les caselles	   
	   for(int i = 0; i < taulell.length; i++){
		for(int j = 0; j < taulell[i].length; j++) {
		taulell[i] [j] = '.';		
	}
    }
    	System.out.println("Comença el joc");
    	System.out.println("Comença les X")  
    	
    	 while (/* XXX */) {
            mostraTaulell(taulell);
}
public static boolean CasellaOcupada(char[][] taulell, int fila, int columna) {
return taulell[fila] [columna] != '.';
}

public static boolean JugdorGuanya(char[][] taulell, char jugador) {
for ( int i = 0; i < 3; i++) {
	if (taulell[i][0] == jugador &&taulell[i][1] == jugador && taulell[i][2] == jugador) {
                return true;
            }
}
for ( int i = 0; i < 3; i++) {
	if (taulell[0][i] == jugador && taulell[1][i] == jugador && taulell[2][i] == jugador) {
		return true; 
	    }	    
}
	if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador) {
		return true;         
}
	if (taulell[0][2] == jugador && taulell[1][1] == jugador && taulell[2][0] == jugador) {
		return true;         
}
return false;
}

public static boolean hiHaEmpat(char[][] taulell) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (taulell[i][j] == '·') {
                    return false;
                }
            }
        }
        return true;
    }

public static void MostraTaulell(char taulell) {
	 for(int i = 0; i < taulell.length; i++){
		for(int j = 0; j < taulell[i].length; j++) {
		System.out.print(taulell[i] [j]) = '.';
	}
	System.out.println();
  // obté el moviment del jugador actual
            /* XXX */

            // comprova abandonament
            /* XXX */

            // obté coordenades del moviment
            /* XXX */

            // comprova si la casella està ocupada
            /* XXX */

            // realitza el moviment
            /* XXX */

            // comprova jugador guanya
            /* XXX */

            // comprova empat
            /* XXX */

            // passa torn a l'altre jugador
            /* XXX */
        }
    }
}
}

