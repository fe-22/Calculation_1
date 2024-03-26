package calculation.model;

public class Entity {
	
	private float tipoDeJuros;
	private Double valorPrincipal;
	private float taxa;
	private int meses;
	private double montante;
	private double totaldeJuros;
	
	public Entity() {
	}

	public Entity(float tipoDeJuros, Double valorPrincipal, float taxa, int meses, double montante,
			double totaldeJuros) {
		super();
		this.tipoDeJuros = tipoDeJuros;
		this.valorPrincipal = valorPrincipal;
		this.taxa = taxa;
		this.meses = meses;
		this.montante = montante;
		this.totaldeJuros = totaldeJuros;
	}

	public float getTipoDeJuros() {
		return tipoDeJuros;
	}

	public void setTipoDeJuros(float tipoDeJuros) {
		this.tipoDeJuros = tipoDeJuros;
	}

	public Double getValorPrincipal() {
		return valorPrincipal;
	}

	public void setValorPrincipal(Double valorPrincipal) {
		this.valorPrincipal = valorPrincipal;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public double getTotaldeJuros() {
		return totaldeJuros;
	}

	public void setTotaldeJuros(double totaldeJuros) {
		this.totaldeJuros = totaldeJuros;
	}
	
	

}
