
public class ConvertirMoneda {
	private double cotizacionDolar = 137.99;
	private double cotizacionEuro = 137.02;
	private double cotizacionLibra = 161.08;
	private double cotizacionYen = 0.99;
	private double cotizacionWon = 0.10;
	
	///Convenrtir desde Peso Arg. a Monedas
	
	public double convertirPesoADolar(double importe) {
		return importe / cotizacionDolar;
	}
	
	public double convertirPesoAEuro(double importe) {
		return importe / cotizacionEuro;
	}
	
	public double convertirPesoALibra(double importe) {
		return importe / cotizacionLibra;
	}
	
	public double convertirPesoAYen(double importe) {
		return importe / cotizacionYen;
	}
	
	public double convertirPesoAWon(double importe) {
		return importe / cotizacionWon;
	}
	
	///Convertir desde Monedas a Peso Arg.
	
	public double convertirDolarAPeso(double importe) {
		return importe * cotizacionDolar;
	}
	
	public double convertirEuroAPeso(double importe) {
		return importe * cotizacionEuro;
	}
	
	public double convertirLibraAPeso(double importe) {
		return importe * cotizacionLibra;
	}
	
	public double convertirYenAPeso(double importe) {
		return importe * cotizacionYen;
	}
	
	public double convertirWonAPeso(double importe) {
		return importe * cotizacionWon;
	}
	
	///Getters y Setters
	
	public double getCotizacionDolar() {
		return cotizacionDolar;
	}
	public void setCotizacionDolar(double cotizacionDolar) {
		this.cotizacionDolar = cotizacionDolar;
	}
	public double getCotizacionEuro() {
		return cotizacionEuro;
	}
	public void setCotizacionEuro(double cotizacionEuro) {
		this.cotizacionEuro = cotizacionEuro;
	}
	public double getCotizacionLibra() {
		return cotizacionLibra;
	}
	public void setCotizacionLibra(double cotizacionLibra) {
		this.cotizacionLibra = cotizacionLibra;
	}
	public double getCotizacionYen() {
		return cotizacionYen;
	}
	public void setCotizacionYen(double cotizacionYen) {
		this.cotizacionYen = cotizacionYen;
	}
	public double getCotizacionWon() {
		return cotizacionWon;
	}
	public void setCotizacionWon(double cotizacionWon) {
		this.cotizacionWon = cotizacionWon;
	}
}
