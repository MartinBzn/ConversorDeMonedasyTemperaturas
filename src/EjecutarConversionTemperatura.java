import java.text.DecimalFormat;

public class EjecutarConversionTemperatura {
	public String ConversorTemperatura(String opcionDeConversor, double valorDbl,String valorStr) {
		String respuesta = "";
		ConvertirTemperatura ct = new ConvertirTemperatura();
		switch(opcionDeConversor) {
		case "Celcius a Farenheit":
			respuesta = calcularYMostrar(valorDbl,valorStr,ct.celciusAFarenheit(valorDbl),"celcius","farenheit");
			break;
		case "Celcius a Kelvin":
			respuesta = calcularYMostrar(valorDbl,valorStr,ct.celciusAKelvin(valorDbl),"celcius","kelvin");
			break;
		case "Farenheit a Celcius":
			respuesta = calcularYMostrar(valorDbl,valorStr,ct.farenheitACelcius(valorDbl),"farenheit","celcius");
			break;
		case "Farenheit a Kelvin":
			respuesta = calcularYMostrar(valorDbl,valorStr,ct.farenheitAKelvin(valorDbl),"farenheit","kelvin");
			break;
		case "Kelvin a Celcius":
			respuesta = calcularYMostrar(valorDbl,valorStr,ct.kelvinACelcius(valorDbl),"kelvin","celcius");
			break;
		case "Kelvin a Farenheit":
			respuesta = calcularYMostrar(valorDbl,valorStr,ct.kelvinAFarenheit(valorDbl),"kelvin","farenheit");
			break;
		}
		return respuesta;
	}
	
	public String calcularYMostrar(Double valorDbl,String valorStr,Double resultado, String txtGradoInicial, String txtGradoFinal) {
		DecimalFormat df = new DecimalFormat( "#,##0.00");
		return (df.format(valorDbl) +" grados "+ txtGradoInicial + " son " + df.format(resultado) + " grados " + txtGradoFinal);
	}
}
