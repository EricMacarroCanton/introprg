public class Program {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        boolean esVocal = true ;
        String vocals = "aeiou" ;

        for(int i = 0; i < text.length(); i++){
        esVocal = false;
            for(int j = 0; j < vocals.length(); j++){
                if(text.charAt(i) == vocals.charAt(j)){
                    esVocal = true;
                    break;
                }
            }
		if (esVocal) {
			System.out.println(text.charAt(i)); }
        }
    }
}


