
public class TestaConversao {
	
	//casting
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
	
		long numeroGrande = 65456341589l;
		//short numeroPequeno = 4568;
		//byte pequeno = 127;
		System.out.println(numeroGrande);
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		double total = valor1 + valor2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
	}
	
}
