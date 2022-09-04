import java.text.DecimalFormat;

public class EjecutarConversionMoneda {
	public String ConversorMonetario(String opcionDeConversor, double valorDbl,String valorStr) {
		String respuesta = "";
		ConvertirMoneda cm = new ConvertirMoneda();
		switch(opcionDeConversor) {
		case "Pesos a Dolar":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirPesoADolar(valorDbl),"pesos","dolares");
			break;
		case "Pesos a Euros":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirPesoAEuro(valorDbl),"pesos","euros");
			break;
		case "Pesos a Libras":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirPesoALibra(valorDbl),"pesos","libras");
			break;
		case "Pesos a Yen":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirPesoAYen(valorDbl),"pesos","yenes");
			break;
		case "Pesos a Won":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirPesoAWon(valorDbl),"pesos","wons");
			break;
		case "Dolar a Pesos":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirDolarAPeso(valorDbl),"dolares","pesos");
			break;
		case "Euros a Pesos":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirEuroAPeso(valorDbl),"euros","pesos");
			break;
		case "Libras a Pesos":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirLibraAPeso(valorDbl),"libras","pesos");
			break;
		case "Yen a Pesos":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirYenAPeso(valorDbl),"yenes","pesos");
			break;
		case "Won a Pesos":
			respuesta = calcularYMostrar(valorDbl,valorStr,cm.convertirWonAPeso(valorDbl),"wons","pesos");
			break;
		}
		return respuesta;
	}
	
	public String calcularYMostrar(Double valorDbl,String valorStr,Double resultado, String txtMonedaInicial, String txtMonedaFinal) {
		
		String monedaInicial = SingularPlural(valorDbl, txtMonedaInicial);
		String monedaFinal = SingularPlural(resultado, txtMonedaFinal);
		String verbo = "";
		if(valorDbl == 1.0) {
			verbo = " es ";
		}else {
			verbo = " son ";
		}
		DecimalFormat df = new DecimalFormat( "#,##0.00");
		return (df.format(valorDbl) +" "+ monedaInicial + verbo + df.format(resultado) + " " + monedaFinal);
	}
	
	public String SingularPlural(Double valor, String moneda) {
		String texto = "";
		if (valor == 1.0) {
			switch (moneda){
			case "pesos":
				texto = "peso";
				break;
			case "dolares":
				texto = "dolar";
				break;
			case "libras":
				texto = "libra";
				break;
			case "yenes":
				texto = "yen";
				break;
			case "wons":
				texto = "won";
				break;
			case "euros":
				texto = "euro";
				break;
			}
		} else {
			texto = moneda;
		} 
		return texto;
	}
}
