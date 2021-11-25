package Q4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int maior = -1;
		int menor = -1;
		List<Character> mina = new ArrayList<>();
		int diamante = 0;
		int aux;
		
		while(N > 0) {
			String s = new String();
			s = sc.next();
			
			for (int i = 0; i < s.length(); i++) {
				mina.add(s.charAt(i));
				if(mina.get(i) != '<' || mina.get(i) != '.' || mina.get(i) != '>') {
					System.out.println("Error: Valor inválido!!");
					sc.close();
					return;
				}
			}
			
			aux = mina.size();
			
			while(aux > 0) {
				for(int i = 0; i < mina.size(); i++) {
					if(mina.get(i) == '<') {
						menor = i;
					}
					
					if(menor >= 0 && mina.get(i) == '>') {
						maior = i;
						break;
					}
				}
				
				if(menor != -1 && maior != -1) {
					for(int i = maior; i >= menor; i--) {
						mina.remove(i);
					}
					diamante ++;
				}
				
				maior = -1;
				menor = -1;
				aux--;
			}
			
			System.out.println(diamante);
			diamante = 0;
			N--;
		}
		sc.close();
	}
}
