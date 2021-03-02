public class Vetor6pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {1, 0, 5, -2, -5, 7};
		int soma;
		soma = A[0] + A[1] + A[5];
		System.out.println("SOMA:"+soma);
		A[4] = 100;
		for(int i = 0; i< A.length;i++) {
			System.out.println(A[i]);
		}

	}

}
