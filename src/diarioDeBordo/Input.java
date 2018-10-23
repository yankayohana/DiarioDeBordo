package diarioDeBordo;

import java.util.Scanner;

public class Input {
	
	Scanner sc;
	
	public Input() {
		this.sc = new Scanner(System.in);
	}
	
	public String leString() {
		String retorno = this.sc.nextLine();
		
		return retorno;
	}
	
	public String leStringFrase(String frase) {
		System.out.print(frase);
		return this.leString();
	}
	
	public int leInt() {
		int retorno = this.sc.nextInt();
		sc.nextLine();
		
		return retorno;
	}
	
	public int leIntFrase(String frase) {
		System.out.print(frase);
		return this.leInt();
	}

}
