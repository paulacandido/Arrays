import java.util.Scanner;

public class Matriz3X3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int A[][] = new int[3][3];
		int maior = 0;
		for(int i = 0; i< A.length;i++) {
			for(int j = 0; j < A.length; j++) {
				System.out.println("Digite o numero na posição ["+(i+1)+ "]["+(j+1)+ "]:");
				A[i][j] = leia.nextInt();
				if(A[i][j]>10) {
					maior++;
				}
		}
	}
		System.out.println("Há "+maior+" numeros maior que 10:");
			for(int i = 0; i< A.length;i++) {
				for(int j = 0; j < A.length; j++) {
					
					if(A[i][j]>10) {
						System.out.print(A[i][j]+ " ");
					}
			}
		

	}

}
}
