
public class ConvertirTemperatura {
	
	public double celciusAFarenheit (double temperatura){
		return (temperatura *9/5) + 32;
	}
	
	public double celciusAKelvin (double temperatura){
		return temperatura + 273.15;
	}
	
	public double farenheitACelcius (double temperatura){
		return ((temperatura - 32) * 5/9);
	}
	
	public double kelvinACelcius (double temperatura){
		return temperatura - 273.15;
	}
	
	public double farenheitAKelvin (double temperatura){
		return ((temperatura - 32) * 5/9) + 273.15;
	}
	
	public double kelvinAFarenheit (double temperatura){
		return ((temperatura - 273.15) * 9/5) + 32;
	}
	
}
