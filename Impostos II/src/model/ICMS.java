package model;

public class ICMS extends Tax{

	public ICMS() {
		super("ICMS", "Imposto Circ. Mercadorias", 0);
	}
	
	public void setAliquota(Product product) {
		if(product.possuiIPI()) {
			setAliquot(7);
		}else {
			setAliquot(5);
		}
	}
	
	@Override
	public double calculate(Product p) {
		setAliquota(p);
		return p.getCostPrice() * this.getAliquot();
	}
	
}
