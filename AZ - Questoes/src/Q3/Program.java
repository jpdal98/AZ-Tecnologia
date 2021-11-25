package Q3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int R = sc.nextInt();
		int idVoluntario;
		int vet[] = new int[N+1];
		
		if (N < R || N > 10001 || R < 1){
			System.out.println("Error: Valor inválido!!");
			sc.close();
			return;
		}
		
		//preenchendo o vetor com valor 0
		for(int i = 0; i < N; i++) {
			vet[i] = 0;
		}
		
		//lendo os identificadores dos voluntários
		for(int i = 0; i < R; i++) {
			idVoluntario = sc.nextInt();
			vet[idVoluntario] = 1;
		}
		
		//verificando os mergulhadores
		if(N == R) {
			System.out.println("*");
		}else {
			for(int i = 1; i < N + 1; i++) {
				if(vet[i] == 0) {
					System.out.print(i + " ");
				}else {
					vet[i] = 0;
				}
			}
		}
		sc.close();
	}
}
