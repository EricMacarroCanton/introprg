public class Recursivitat3 {
	public static void main(String[] args) {
	
	System.out.println(factorial(5)); 
}
public static double factorial(int factors) {
    if (factors == 0) return 1;               //Base case

    else  return factors * factorial(factors - 1);  //Recursive case
}
	}
