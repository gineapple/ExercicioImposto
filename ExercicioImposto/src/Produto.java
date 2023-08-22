import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private double lucro;
	private List <Imposto> impostos;
	private double precoCusto;

	public Produto(String nome, double precoCusto, double lucro) {
		this.nome=nome;
		this.lucro=lucro;
		this.precoCusto=precoCusto;
		this.impostos= new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public List<Imposto> getImpostos() {
		return impostos;
	}
	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double calcPrecoVenda(){
		double totalImposto=0.0;
		for (Imposto imposto : impostos) {
			totalImposto += this.precoCusto*imposto.getPorcentagem();
		} 
		double precoComImposto = precoCusto+totalImposto;
		double precoLucro = precoComImposto+(precoComImposto*this.lucro);
		return precoLucro;
		
	}
	public void insereImposto(Imposto imposto) {
		impostos.add(imposto);
	}

}
