package entities;

public class Aluno {

	public String nome;
	public double n1, n2, n3, media, pontos, aprovacao = 60;
	
	
	public double calculoMedia() {
		return n1 + n2 + n3;
	}
	
	public String getsituacaoAluno() {
		double media = this.calculoMedia();
		
		if (media < aprovacao) {
			pontos = aprovacao - media;
			return "Failed! \nMissing " + String.format("%.2f", pontos) + " points";
		}
		else {
			return "Pass!";
		}
	}
}