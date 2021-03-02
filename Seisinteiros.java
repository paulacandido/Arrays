import java.util.Scanner;

public class Seisinteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int A[] = new int[6];
		int somapares = 0,quantImpar = 0;
		for(int i = 0; i< A.length;i++) {
			System.out.println("Digite o numero na posição "+(i+1)+ ":");
			A[i] = leia.nextInt();
			if(A[i]%2 == 0) {
				somapares+=A[i];
			}else {
				quantImpar++;
			}
		}
		for(int i = 0; i< A.length;i++) {
			
			if(A[i]%2 == 0) {
				System.out.print(A[i]+" ");
			}
		}
		System.out.println("Soma dos pares:"+somapares);
		for(int i = 0; i< A.length;i++) {
			
			if(A[i]%2 != 0) {
				System.out.print(A[i]+" ");
			}
		}
		System.out.println("Quantidade de impares:"+quantImpar);

	}

}
