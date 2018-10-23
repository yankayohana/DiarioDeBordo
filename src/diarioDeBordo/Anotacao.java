package diarioDeBordo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anotacao {
	
	private String anotacao;
	private LocalDate data;
	
	public Anotacao(int dia, int mes, int ano, String anotacao) throws Exception {
		Validator.verificaData(dia);
		Validator.verificaMes(mes);
		Validator.verificaAno(ano);
		
		this.data = LocalDate.of(ano, mes, dia);
		this.anotacao = anotacao;
	}
	
	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}
	
	public void complementaAnotacao(String complemento) {
		anotacao += complemento;
	}
	
	public boolean contemPalavra(String palavra) {
		if(anotacao.contains(palavra)) {
			return true;
		}
		return false; 
	}
	
	public String getAnotacao() {
		return anotacao;
	}
	
	public String getData() {
		return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	public String toString() {
		return this.getData() + ": " + this.getAnotacao();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anotacao == null) ? 0 : anotacao.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		Anotacao other = (Anotacao) obj;
		if (anotacao == null) {
			if (other.anotacao != null)
				return false;
		} else if (!anotacao.equals(other.anotacao))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	
	

}
