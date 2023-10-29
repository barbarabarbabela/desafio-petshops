package desafiopetshops;

public class Petshops {
	
	public double ValorCaoPequeno;
	public double ValorCaoGrande;
	public double Distancia;
	public String Nome;
	public double valorTotal(double caesP, double caesG, double ValorCaoPequeno, double ValorCaoGrande) {
		return (caesP * ValorCaoPequeno) + (caesG * ValorCaoGrande);	
}

	public Petshops(double valorCaoPequeno, double valorCaoGrande, String nome, double distancia) {
		Nome = nome;
		ValorCaoGrande = valorCaoGrande;
		ValorCaoPequeno = valorCaoPequeno;
		Distancia = distancia;
	}
	

}
