
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCpf("007.025.869-43");
		pessoa1.setNome("Michael Christian Buratti");
		pessoa1.setIdade(39);
		System.out.println("Pessoa 1");
		System.out.println(pessoa1.toString());
		
		Pessoa pessoa2 = pessoa1;		
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3 = pessoa1;
		
		pessoa3.setNome("Pessoa3");
		pessoa2.setNome("Pessoa2");
		
		System.out.println("Pessoa 1");
		System.out.println(pessoa1.toString());
		
		System.out.println("Pessoa 2");
		System.out.println(pessoa2.toString());
	
		System.out.println("Pessoa 3");
		System.out.println(pessoa3.toString());
	
		
	}

}
