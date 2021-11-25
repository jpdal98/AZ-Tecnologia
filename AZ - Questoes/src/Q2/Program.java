package Q2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int K = sc.nextInt();
		int P[] = new int[N];
		int maior = 0;
		int count = 0;
		
		if(N == 0 && K == 0) {
			sc.close();
			return;
		}
		
		if (N < 1 || N > 1000 || K < 1 || K > 100){
			System.out.println("Error: Valor inválido!!");
			sc.close();
			return;
		}
	
		// preechendo o vetor de perguntas
		for (int i = 0; i < N; i++) {	
			P[i] = sc.nextInt();
			if(P[i] < 1 || P[i] > 100) {
				System.out.println("Error: Número inválido!!");
				sc.close();
				return;
			}
		}
		
		//descobrindo qual das perguntas dentro do vetor de perguntas possui o
		//maior número
		for (int i = 0; i < N; i++) {
			if(maior < P[i]) {
				maior = P[i];
			}
		}
		
		//criando um vetor contador
		int vet[] = new int [maior+1];
		
		//preenchendo o vetor contador com valor 0
		for (int i = 0; i < maior + 1; i++) {
			vet[i] = 0;
		}
		
		//incrementa o vetor contador sempre que o valor aparecer 
		for (int i = 0; i < N; i++) {
			vet[P[i]] ++;
		}
		
		//contando quantas perguntas são frequentes
		for(int i = 1; i < maior + 1; i++) {
			if (vet[i] >= K) {
				count ++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
