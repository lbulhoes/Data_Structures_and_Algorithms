import java.util.Random;
import java.util.Scanner;

class BinarySum {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
	
		System.out.printf("%nEntre com o numero de bits:");
		int numBits = input.nextInt();
	
	
		int array1[] = new int[numBits];
		int array2[] = new int[numBits];
	
		System.out.printf("%n%nNúmero 1: ");
		for(int i = 0; i < numBits; i++){
			array1[i] = ran.nextInt(2);
			System.out.print(array1[i]);
		}
	
		System.out.printf("%n%n");
	
		System.out.printf("Número 2: ");
		for(int i = 0; i < numBits; i++){
			array2[i] = ran.nextInt(2);
			System.out.print(array2[i]);
		}	
		
		System.out.printf("%n%n");
	
        int arraySum[] = new int[numBits + 1];
        
        int sobeUm = 0;
        for(int i = numBits - 1 ; i > -1; i--){
            arraySum[i+1] = (sobeUm + array1[i] + array2[i]) % 2;
            sobeUm = (sobeUm + array1[i] + array2[i]) / 2;     
        }
        
        arraySum[0] = sobeUm;
    
        System.out.printf("Soma: ");
		for(int i = 0; i < numBits + 1; i++){
			System.out.print(arraySum[i]);
		}	
		System.out.printf("%n%n");   

	}
	
}
