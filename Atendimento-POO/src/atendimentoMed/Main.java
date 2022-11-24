package atendimentoMed;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		LocalDate date = LocalDate.of(2000, 1, 8);
		p.setDataNacimento(date);
		
		System.out.println(p.calcularIdade());
		
		Atendimento atendimento = new Atendimento();
		Atestado atestado = new Atestado();
		
		atestado.emitirAtestado(atendimento);
		
		Boolean[] respostas = new Boolean[10];
		for (int i = 0; i < respostas.length; i++) {
			respostas[i] = true;
		}
		
		respostas[0] = false;
		
		System.out.println(atendimento.calculaPrioridade(respostas));
		
	}

}
