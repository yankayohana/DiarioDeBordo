package diarioDeBordo;

public class Validator {

	public static void verificaString(String string) throws Exception {

		if (string == null || string.equals("")) {
			throw new Exception(string + " INVÁLIDO!");
		}
	}

	public static void verificaData(int dia) throws Exception {

		if (dia < 1 || dia > 31) {
			throw new Exception("dia inválido");
		}
	}

	public static void verificaMes(int mes) throws Exception {

		if (mes < 1 || mes > 12) {
			throw new Exception("mês inválido");
		}
	}

	public static void verificaAno(int ano) throws Exception {

		if (ano < 1) {
			throw new Exception("ano inválido");
		}
	}
}
