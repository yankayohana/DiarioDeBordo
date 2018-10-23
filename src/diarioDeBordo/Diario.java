package diarioDeBordo;


import java.util.Arrays;

public class Diario {

	private int qtdAulas;
	private Anotacao[] anotacoes;
	private int qtdAnotacoes;

	public Diario(int qtdAulas) {
		this.qtdAulas = qtdAulas;
		this.anotacoes = new Anotacao[this.qtdAulas];
		this.qtdAnotacoes = 0;
		

	}

	public boolean adicionaAnotacao(int dia, int mes, int ano, String anotacao) throws Exception {
		Anotacao texto = new Anotacao(dia, mes, ano, anotacao);
		if (qtdAulas >= qtdAnotacoes) {
			return false;
		} else {
			this.anotacoes[qtdAnotacoes++] = texto;
		}
		return true;

	}

	public String listaAnotacoes() {
		String lista = "";
		for (int i = 0; i < this.qtdAnotacoes; i++) {
			lista += anotacoes[i].toString() + System.lineSeparator();
		}

		return lista;
	}

	public String pesquisarAnotacaoPorIndice(int indice) throws Exception {
		String anotacao = "";
		if (indice < 0 || indice >= qtdAnotacoes) {
			throw new Exception("índice inválido");
		} else {
			anotacao = anotacoes[indice].toString();
		}

		return anotacao;
	}

	public String pesquisarAnotacaoPorPalavra(String palavra) {
		String texto = "";
		for (Anotacao anotacao : anotacoes) {
			if (anotacao.contemPalavra(palavra)) {
				texto = anotacao.getAnotacao();
			}
		}
		return texto;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(anotacoes);
		result = prime * result + qtdAnotacoes;
		result = prime * result + qtdAulas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diario other = (Diario) obj;
		if (!Arrays.equals(anotacoes, other.anotacoes))
			return false;
		if (qtdAnotacoes != other.qtdAnotacoes)
			return false;
		if (qtdAulas != other.qtdAulas)
			return false;
		return true;
	}
	
	
	

}
