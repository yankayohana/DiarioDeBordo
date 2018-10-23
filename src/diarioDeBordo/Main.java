package diarioDeBordo;

public class Main {

	private static void printaOpcoes() {

		System.out.println("1 - adicionar anotação ao diário");
		System.out.println("2 - listar anotações do diário");
		System.out.println("3 - procurar por palavra em anotação");
		System.out.println("4 - pesquisar anotacao por indice");
		System.out.println("5 - fechar o diário");

	}

	public static void main(String[] args) {

		Input input = new Input();
		int qtdAulas = input.leIntFrase("digite a quantidade de aulas: ");

		Diario diario = new Diario(qtdAulas);

		Boolean rodando = true;

		while (rodando) {

			printaOpcoes();

			String opcao = input.leStringFrase("Opção> ");

			switch (opcao) {

			case "1":
				adicionaAnotacao(diario, input);
				break;
			case "2":
				listaAnotacoes(diario, input);
				break;
			case "3":
				procurarPorPalavra(diario, input);
				break;
			case "4":
				pesquisarAnotacaoPorIndice(diario, input);
				break;
			case "5":
				rodando = false;
				break;
			}

		}

	}

	public static void adicionaAnotacao(Diario diario, Input input) {
		int dia = input.leIntFrase("digita o dia: ");
		int mes = input.leIntFrase("digite o mes: ");
		int ano = input.leIntFrase("digite o ano: ");
		String anotacao = input.leStringFrase("digite a anotação: ");

		diario.adicionaAnotacao(dia, mes, ano, anotacao);

	}

	public static void listaAnotacoes(Diario diario, Input input) {
		System.out.println(diario.listaAnotacoes());

	}

	public static void procurarPorPalavra(Diario diario, Input input) {
		String palavra = input.leStringFrase("digita a palavra a ser pesquisada: ");
		System.out.println(diario.pesquisarAnotacaoPorPalavra(palavra));
	}

	public static void pesquisarAnotacaoPorIndice(Diario diario, Input input) {
		int indice = input.leIntFrase("digite o indice a ser pesquisado: ");
		try {
			System.out.println(diario.pesquisarAnotacaoPorIndice(indice));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
