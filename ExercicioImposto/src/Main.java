import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Imposto icms = new Imposto("ICMS", 0.07);
		Imposto confins = new Imposto("CONFINS", 0.12);
		Imposto iss = new Imposto("ISS", 0.05);
		Imposto ipi = new Imposto("IPI", 0.08);
		Imposto cide = new Imposto("CIDE", 0.10);
		Imposto csll = new Imposto("CSLL", 0.04);
		
		Produto arroz = new Produto("Arroz", 7.00, 0.20);
		arroz.insereImposto(icms);
		arroz.insereImposto(confins);
		arroz.insereImposto(iss);
		
		Produto feijao = new Produto("Feijao", 7.00, 0.25);
		feijao.insereImposto(icms);
		feijao.insereImposto(confins);
		feijao.insereImposto(iss);
		
		Produto carne = new Produto("Carne", 7.00, 0.35);
		carne.insereImposto(icms);
		carne.insereImposto(confins);
		carne.insereImposto(ipi);
		
		Produto cerveja = new Produto("Cerveja", 7.00, 0.30);
		cerveja.insereImposto(icms);
		cerveja.insereImposto(confins);
		cerveja.insereImposto(iss);
		cerveja.insereImposto(ipi);
		
		Produto gas = new Produto("Gas", 7.00, 0.15);
		gas.insereImposto(icms);
		gas.insereImposto(confins);
		gas.insereImposto(ipi);
		
		Produto gasolina = new Produto("Carne", 7.00, 0.15);
		gasolina.insereImposto(icms);
		gasolina.insereImposto(confins);
		gasolina.insereImposto(cide);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(arroz);
		produtos.add(carne);
		produtos.add(feijao);
		produtos.add(gas);
		produtos.add(gasolina);
		produtos.add(cerveja);
		
		for (Produto produto : produtos) {
            double precoVenda = produto.calcPrecoVenda();
            System.out.println(produto.getNome() + ": R$" + String.format("%.2f", precoVenda));
        }
	}
	

}
