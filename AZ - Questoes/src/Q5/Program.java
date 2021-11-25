package Q5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int D[] = new int[61];
		int E[] = new int[61];
		int N = sc.nextInt();
		int M;
		char L;
		int count = 0;
		
		if (N <= 0) {
			System.out.println("Error: Valor inválido!!");
			sc.close();
			return;
		}
		
		//prenchendo os vetores contadores com o valor 0
		for(int i=0; i<61; i++) {
			D[i] = 0;
			E[i] = 0;
		}
		
		//verificando as botas
		while(N > 0) {
			M = sc.nextInt();
			L = sc.next().charAt(0);
			if(L=='E') {
				E[M]++;
            }else {
            	D[M]++;
            }if(E[M] == D[M]) {
			    E[M]--;
			    D[M]--;
			    count++;
			}
            N--;
		}
		System.out.println(count);
		sc.close();
	}

}
