import java.util.Scanner;
import java.util.Random;

class InsertionsortND{

	public static void main(String[] args){
		
		Random ran = new Random();
		Scanner input = new Scanner(System.in);
		int len;		
		
		System.out.printf("Entre com o tamanho do vetor:");
		len = input.nextInt();
		int array[] = new int[len];
		
		System.out.printf("%n%n[");
		for(int k = 0; k < array.length; k++){
			array[k] = ran.nextInt(50);
			System.out.printf("%d ", array[k]);
		}
		System.out.printf("]%n%n");
		
		int key,i;
		
		for(int j = 1; j <array.length; j++){
			
			key = array[j];
			i = j-1;
			
			while(i > -1 && array[i] > key){
				array[i+1] = array[i];
				i = i-1;
			}
			array[i+1] = key;
		
		}
		
		
		System.out.printf("%n%n[");
		for(int k = 0; k < array.length; k++){
			System.out.printf("%d ", array[k]);
		}
		System.out.printf("]%n%n");
	}

}
