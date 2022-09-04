import javax.swing.JOptionPane;

public class MenuConvertirTemperatura {
	String titulo = "Conversor de Temperaturas";
	public void SelectorConversor() {
		String[] conversores = {"Celcius a Farenheit", "Celcius a Kelvin", "Farenheit a Celcius", "Farenheit a Kelvin"
								, "Kelvin a Celcius", "Kelvin a Farenheit"};
		String valorStr = "";
		Double valorDbl = 0.0;
		String respuesta = "";
		EjecutarConversionTemperatura ect = new EjecutarConversionTemperatura();
		Boolean seguir = true;
		while (seguir){
			valorStr = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir.\n  - No utilice puntos o comas para marcar miles.\n  - Utilice ',' para los decimales.",titulo,JOptionPane.PLAIN_MESSAGE);
			try {
				if(valorStr.contains(".")) {
					throw new NumberFormatException();
				}
				if (valorStr.contains(",")) {
					String valorStr2 = "";
					valorStr2 = valorStr;
					valorStr = valorStr2.replace(",", ".");
					System.out.println(valorStr);
				}
				valorDbl = Double.parseDouble(valorStr);
				String opcionDeConversor = JOptionPane.showInputDialog(null,"Seleccione el tipo de conversion que desea realizar: ",titulo,JOptionPane.PLAIN_MESSAGE,null,conversores,"Seleccionar").toString();
				respuesta = ect.ConversorTemperatura(opcionDeConversor, valorDbl, valorStr);
				JOptionPane.showMessageDialog(null, respuesta, titulo, JOptionPane.INFORMATION_MESSAGE, null);
				int opcionSeleccionada = JOptionPane.showConfirmDialog(null,"¿Desea realizar una nueva conversión de temperaturas?",titulo,JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(JOptionPane.NO_OPTION == opcionSeleccionada) {
					seguir = false;
				}
			}
			catch(NumberFormatException err){
				String msjError = "";
				if (valorStr.isEmpty()) {
					msjError = "No ha ingresado un valor a convertir.";
				}else {
					msjError = "El valor ingresado no es un número válido.";
				}
				JOptionPane.showMessageDialog(null,msjError, titulo, JOptionPane.ERROR_MESSAGE, null);
			}
			catch(NullPointerException err) {
				int opcionSeleccionada = JOptionPane.showConfirmDialog(null,"¿Desea salir del conversor de temperaturas?",titulo,JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
				if(JOptionPane.YES_OPTION == opcionSeleccionada) {
					seguir = false;
				}
			}
			catch(Exception err){
				JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Por favor intentelo nuevamente",titulo, JOptionPane.ERROR_MESSAGE, null);
			}
		}
	}
}
