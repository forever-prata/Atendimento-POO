package atendimentoMed;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private LocalDate dataNacimento;
	private String nome;
	
	public LocalDate getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(LocalDate dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularIdade() {
		return Period.between(this.dataNacimento, LocalDate.now()).getYears();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNacimento=");
		builder.append(dataNacimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
