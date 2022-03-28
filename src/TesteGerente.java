
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		
		g1.setNome("Fábio");
		g1.setSalario(20000);
		System.out.println(g1.getBonificacao());
		double salarioTotal = g1.getBonificacao() + g1.getSalario();
		System.out.println("O salário total ficou R$" + salarioTotal);
		
		g1.setSenha(2345);
		boolean autenticou = g1.autentica(2345);
		System.out.println(autenticou);
		System.out.println("=======================");
		System.out.println(g1.getBonificacao());
	}

}
