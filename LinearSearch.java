import java.util.Scanner;
import java.util.Random;

class LinearSearch{

	public static void main(String[] args){
	
	System.out.printf("%nEntre com o tamanho do vetor:");
	
	Scanner input = new Scanner(System.in);

	Random ran = new Random();

	int len = input.nextInt();
	int array[] = new int[len];

	
	System.out.printf("%n[");
	for(int i = 0; i < len; i++){
		array[i] = ran.nextInt(20);
		System.out.printf("%d ", array[i]);
	}
	System.out.printf("]%n%n");
	
	System.out.printf("Entre com um valor para buscar:");
	
	int value = input.nextInt();
	
	int i = 0;
	int j = 0;
	
	
	while(i < len && j != 1){
		if(array[i] == value){
			System.out.printf("O valor %d aparece na posição %d%n", value, i);
			j = 1;
		}
		else{
			i = i + 1;
		}
	}
	
	if( j == 0){
		System.out.println("NIL");
	}
	
	}
	
}
