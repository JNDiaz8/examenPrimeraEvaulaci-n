import java.util.Scanner;
/**
@author Joaquin Diaz Ramirez
@version 1.0
*/

public class Numeros{
	
	public static void main (String [] args){
		
		System.out.println("=======================================================");
		System.out.println("Introduce dos numeros comprendidos entre el 1 y el 999");
		System.out.println("=======================================================");
		
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		if(numero1>0 && numero1<1000 && numero2>0 && numero2<1000){    // Con este if pedimos que los numeros sean, mayores que 0 y menores que 1000
		
			System.out.println("Números Correctos");
			return;
		}
			System.out.println("Numeros no válidos");
	}
}